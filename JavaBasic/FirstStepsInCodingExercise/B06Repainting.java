package FirstStepsInCodingExercise;

import java.util.Scanner;

public class B06Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cover = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int diluent = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double coverPrice = (cover + 2) * 1.50;
        double paintPrice = (paint + 0.1 * (paint)) * 14.50;
        double diluentPrice = diluent * 5;
        double bags = 0.4;

        double matSum = coverPrice + paintPrice + diluentPrice + bags;
        double workerPrice = (matSum * 0.3) * hours;

        double total = matSum + workerPrice;

        System.out.printf("%.2f", total);
    }
}
