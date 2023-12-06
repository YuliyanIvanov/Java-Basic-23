package ConditionalStatementsAdvancedMoreExercises;

import java.util.Scanner;

public class I06TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        double kmPerMonth = Double.parseDouble(scanner.nextLine());

        double totalIncome = 0;

        for (int month = 1; month <= 4; month++) {
            double paymentPerKilometer = 0;

            switch (season.toLowerCase()) {
                case "spring":
                case "autumn":
                    if (kmPerMonth <= 5000) {
                        paymentPerKilometer = 0.75;
                    } else if (kmPerMonth > 5000 && kmPerMonth <= 10000) {
                        paymentPerKilometer = 0.95;
                    } else if (kmPerMonth > 10000 && kmPerMonth <= 20000) {
                        paymentPerKilometer = 1.45;
                    }
                    break;
                case "summer":
                    if (kmPerMonth <= 5000) {
                        paymentPerKilometer = 0.9;
                    } else if (kmPerMonth > 5000 && kmPerMonth <= 10000) {
                        paymentPerKilometer = 1.1;
                    } else if (kmPerMonth > 10000 && kmPerMonth <= 20000) {
                        paymentPerKilometer = 1.45;
                    }
                    break;
                case "winter":
                    if (kmPerMonth <= 5000) {
                        paymentPerKilometer = 1.05;
                    } else if (kmPerMonth > 5000 && kmPerMonth <= 10000) {
                        paymentPerKilometer = 1.25;
                    } else if (kmPerMonth > 10000 && kmPerMonth <= 20000) {
                        paymentPerKilometer = 1.45;
                    }
                    break;
                default:
                    System.out.println("Invalid season");
                    return;
            }

            double monthlyIncome = kmPerMonth * paymentPerKilometer;
            totalIncome += monthlyIncome;

        }
        totalIncome *= 0.9; // 10% taxes
        System.out.printf("%.2f", totalIncome);
    }
}
