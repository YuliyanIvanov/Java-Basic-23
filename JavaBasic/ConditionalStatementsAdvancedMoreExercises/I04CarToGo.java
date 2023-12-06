package ConditionalStatementsAdvancedMoreExercises;

import java.util.Scanner;

public class I04CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String carClass = "";
        String carType = "";
        double carPrice = 0;

        switch (season) {
            case "Summer":
                if (budget <= 100) {
                    carClass = "Economy class";
                    carPrice = budget * 0.35;
                    carType = "Cabrio";
                } else if (budget > 100 && budget <= 500) {
                    carClass = "Compact class";
                    carPrice = budget * 0.45;
                    carType = "Cabrio";
                } else {
                    carClass = "Luxury class";
                    carPrice = budget * 0.9;
                    carType = "Jeep";
                }
                break;
            case "Winter":
                if (budget <= 100) {
                    carClass = "Economy class";
                    carPrice = budget * 0.65;
                    carType = "Jeep";
                } else if (budget > 100 && budget <= 500) {
                    carClass = "Compact class";
                    carPrice = budget * 0.8;
                    carType = "Jeep";
                } else {
                    carClass = "Luxury class";
                    carPrice = budget * 0.9;
                    carType = "Jeep";
                }
                break;
        }
        System.out.printf("%s\n", carClass);
        System.out.printf("%s - %.2f", carType, carPrice);
    }
}
