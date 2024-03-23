package ForLoopMoreExercises;

import java.util.Scanner;

public class L11OddEvenPosition {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numbers = Integer.parseInt(scanner.nextLine());

        double oddSum = 0;
        double oddMin = Double.POSITIVE_INFINITY;
        double oddMax = Double.NEGATIVE_INFINITY;
        double evenSum = 0;
        double evenMin = Double.POSITIVE_INFINITY;
        double evenMax = Double.NEGATIVE_INFINITY;

        for (int i = 1; i <= numbers; i++) {
            double number = Double.parseDouble(scanner.nextLine());

            if (i % 2 == 0) {
                evenSum += number;
                evenMin = Math.min(evenMin, number);
                evenMax = Math.max(evenMax, number);
            } else {
                oddSum += number;
                oddMin = Math.min(oddMin, number);
                oddMax = Math.max(oddMax, number);
            }
        }

        System.out.printf("OddSum=%.2f,%n", oddSum);
        System.out.printf("OddMin=%s,%n", oddMin == Double.POSITIVE_INFINITY
                ? "No" : String.format("%.2f", oddMin));
        System.out.printf("OddMax=%s,%n", oddMax == Double.NEGATIVE_INFINITY
                ? "No" : String.format("%.2f", oddMax));
        System.out.printf("EvenSum=%.2f,%n", evenSum);
        System.out.printf("EvenMin=%s,%n", evenMin == Double.POSITIVE_INFINITY
                ? "No" : String.format("%.2f", evenMin));
        System.out.printf("EvenMax=%s%n", evenMax == Double.NEGATIVE_INFINITY
                ? "No" : String.format("%.2f", evenMax));
    }
}
