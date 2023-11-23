package ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class F08FuelTankPartTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuel = scanner.nextLine().toLowerCase();
        int liters = Integer.parseInt(scanner.nextLine());
        String card = scanner.nextLine();

        double fuelPrice;

        switch (fuel) {
            case "diesel":
                fuelPrice = 2.33;
                break;
            case "gasoline":
                fuelPrice = 2.22;
                break;
            case "gas":
                fuelPrice = 0.93;
                break;
            default:
                System.out.print("Invalid fuel type!");
                return;
        }

        double discount = 0;

        if (card.equals("Yes")) {
            switch (fuel) {
                case "diesel":
                    discount = 0.12;
                    break;
                case "gasoline":
                    discount = 0.18;
                    break;
                case "gas":
                    discount = 0.08;
                    break;
            }
        }

        fuelPrice -= discount;

        if (liters >= 20 && liters <= 25) {
            fuelPrice *= 0.92;
        } else if (liters > 25) {
            fuelPrice *= 0.9;
        }

        double totalPrice = liters * fuelPrice;

        System.out.printf("%.2f lv.", totalPrice);
    }
}
