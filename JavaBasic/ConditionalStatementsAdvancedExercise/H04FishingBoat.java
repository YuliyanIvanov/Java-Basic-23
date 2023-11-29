package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class H04FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fisherman = Integer.parseInt(scanner.nextLine());

        double baseRent;

        switch (season) {
            case "Spring":
                baseRent = 3000;
                break;
            case "Summer":
            case "Autumn":
                baseRent = 4200;
                break;
            case "Winter":
                baseRent = 2600;
                break;
            default:
                baseRent = 0;
                break;
        }

        double rent = baseRent;

        if (fisherman <= 6) {
            rent *= 0.9;
        } else if (fisherman <= 11) {
            rent *= 0.85;
        } else {
            rent *= 0.75;
        }

        if (fisherman % 2 == 0 && !season.equals("Autumn")) {
            rent *= 0.95;
        }

        double diff = Math.abs(budget - rent);

        if (budget >= rent) {
            System.out.printf("Yes! You have %.2f leva left.", diff);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", diff);
        }
    }
}
