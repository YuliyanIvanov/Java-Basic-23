package ConditionalStatementsAdvancedMoreExercises;

import java.util.Scanner;

public class I10MultiplyBy2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            double number = scanner.nextDouble();

            if (number < 0) {
                System.out.print("Negative number!");
                break;
            }
            double result = number * 2;
            System.out.printf("Result: %.2f\n", result);
        }
    }
}
