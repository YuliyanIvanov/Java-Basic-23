package ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class F07FuelTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuel = scanner.nextLine().toLowerCase();
        int liters = Integer.parseInt(scanner.nextLine());

        switch (fuel) {
            case "diesel":
            case "gasoline":
            case "gas":
                if (liters >= 25) {
                    System.out.printf("You have enough %s.", fuel);
                } else {
                    System.out.printf("Fill your tank with %s!", fuel);
                }
                break;
            default:
                System.out.print("Invalid fuel!");
                break;
        }
    }
}
