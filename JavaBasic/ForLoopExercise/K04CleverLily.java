package ForLoopExercise;

import java.util.Scanner;

public class K04CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double washingMachine = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        double moneyCount = 0;
        double moneySaved = 0;
        int toyCount = 0;
        int brother = 0;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                moneyCount += 10;
                moneySaved += moneyCount;
                brother++;
            } else {
                toyCount++;
            }
        }
        double toySum = toyPrice * toyCount - brother;
        double totalMoney = moneySaved + toySum;

        double diff = Math.abs(washingMachine - totalMoney);

        if (totalMoney >= washingMachine) {
            System.out.printf("Yes! %.2f", diff);
        } else {
            System.out.printf("No! %.2f", diff);
        }
    }
}
