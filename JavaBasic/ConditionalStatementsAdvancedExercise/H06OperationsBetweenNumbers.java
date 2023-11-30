package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class H06OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOne = Integer.parseInt(scanner.nextLine());
        int numberTwo = Integer.parseInt(scanner.nextLine());
        String symbol = scanner.nextLine();

        double operation = 0;

        switch (symbol) {
            case "+":
                operation = numberOne + numberTwo;
                String evenOrOdd = operation % 2 == 0 ? "even" : "odd";
                System.out.printf("%d %s %d = %.0f - %s", numberOne, symbol, numberTwo, operation, evenOrOdd);
                break;
            case "-":
                operation = numberOne - numberTwo;
                evenOrOdd = operation % 2 == 0 ? "even" : "odd";
                System.out.printf("%d %s %d = %.0f - %s", numberOne, symbol, numberTwo, operation, evenOrOdd);
                break;
            case "*":
                operation = numberOne * numberTwo;
                evenOrOdd = operation % 2 == 0 ? "even" : "odd";
                System.out.printf("%d %s %d = %.0f - %s", numberOne, symbol, numberTwo, operation, evenOrOdd);
                break;
            case "/":
                if (numberOne == 0 || numberTwo == 0) {
                    System.out.printf("Cannot divide %d by zero", numberOne, numberTwo);
                } else {
                    operation = (double) numberOne / numberTwo;
                    System.out.printf("%d / %d = %.2f", numberOne, numberTwo, operation);
                }
                break;
            case "%":
                if (numberOne == 0 || numberTwo == 0) {
                    System.out.printf("Cannot divide %d by zero", numberOne, numberTwo);
                } else {
                    operation = numberOne % numberTwo;
                    System.out.printf("%d %% %d = %.0f", numberOne, numberTwo, operation);
                }
                break;
            default:
                break;
        }
    }
}
