package ConditionalStatementsExercise;

import java.util.Scanner;

public class E07Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int gpu = Integer.parseInt(scanner.nextLine());
        int cpu = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        //calculating the price

        double gpuPrice = gpu * 250;
        double cpuPrice = cpu * (gpuPrice * 0.35);
        double ramPrice = ram * (gpuPrice * 0.10);

        double totalPrice = gpuPrice + cpuPrice + ramPrice;

        //check if gpu are more than the cpu
        if (gpu > cpu) {
            totalPrice = totalPrice * 0.85;
        }

        double diff = Math.abs(budget - totalPrice);

        //check if the money will be enough
        if (budget >= totalPrice) {
            System.out.printf("You have %.2f leva left!", diff);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", diff);
        }
    }
}
