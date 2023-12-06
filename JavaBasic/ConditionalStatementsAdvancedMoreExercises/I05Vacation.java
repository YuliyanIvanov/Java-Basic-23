package ConditionalStatementsAdvancedMoreExercises;

import java.util.Scanner;

public class I05Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        double price = 0;
        String location = "";
        String place = "";

        switch (season) {
            case "Summer":
                if (budget <= 1000) {
                    location = "Alaska";
                    place = "Camp";
                    price = budget * 0.65;
                } else if (budget > 1000 && budget <= 3000) {
                    location = "Alaska";
                    place = "Hut";
                    price = budget * 0.8;
                } else {
                    location = "Alaska";
                    place = "Hotel";
                    price = budget * 0.9;
                }
                break;
            case "Winter":
                if (budget <= 1000) {
                    location = "Morocco";
                    place = "Camp";
                    price = budget * 0.45;
                } else if (budget > 1000 && budget <= 3000) {
                    location = "Morocco";
                    place = "Hut";
                    price = budget * 0.6;
                } else {
                    location = "Morocco";
                    place = "Hotel";
                    price = budget * 0.9;
                }
                break;
        }
        System.out.printf("%s - %s - %.2f", location, place, price);
    }
}
