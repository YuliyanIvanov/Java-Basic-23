package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class H05Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destination = "";
        String accommodation = "";
        double expenses = 0;

        switch (season) {
            case "summer":
                if (budget <= 100) {
                    destination = "Bulgaria";
                    accommodation = "Camp";
                    expenses = budget * 0.3;
                } else if (budget <= 1000) {
                    destination = "Balkans";
                    accommodation = "Camp";
                    expenses = budget * 0.4;
                } else {
                    destination = "Europe";
                    accommodation = "Hotel";
                    expenses = budget * 0.9;
                }
                break;
            case "winter":
                if (budget <= 100) {
                    destination = "Bulgaria";
                    accommodation = "Hotel";
                    expenses = budget * 0.7;
                } else if (budget <= 1000) {
                    destination = "Balkans";
                    accommodation = "Hotel";
                    expenses = budget * 0.8;
                } else {
                    destination = "Europe";
                    accommodation = "Hotel";
                    expenses = budget * 0.9;
                }
                break;
            default:
                break;
        }
        System.out.printf("Somewhere in %s\n", destination);
        System.out.printf("%s - %.2f", accommodation, expenses);
    }
}
