package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class H02SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int temperature = Integer.parseInt(scanner.nextLine());
        String timeOfDay = scanner.nextLine();

        String outfit = "";
        String shoe = "";

        switch (timeOfDay) {
            case "Morning":
                if (temperature <= 18) {
                    outfit = "Sweatshirt";
                    shoe = "Sneakers";
                } else if (temperature <= 24) {
                    outfit = "Shirt";
                    shoe = "Moccasins";
                } else if (temperature >= 25) {
                    outfit = "T-Shirt";
                    shoe = "Sandals";
                }
                break;
            case "Afternoon":
                if (temperature <= 18) {
                    outfit = "Shirt";
                    shoe = "Moccasins";
                } else if (temperature <= 24) {
                    outfit = "T-Shirt";
                    shoe = "Sandals";
                } else if (temperature >= 25) {
                    outfit = "Swim Suit";
                    shoe = "Barefoot";
                }
                break;
            case "Evening":
                if (temperature <= 18) {
                    outfit = "Shirt";
                    shoe = "Moccasins";
                } else if (temperature <= 24) {
                    outfit = "Shirt";
                    shoe = "Moccasins";
                } else if (temperature >= 25) {
                    outfit = "Shirt";
                    shoe = "Moccasins";
                }
                break;
        }
        System.out.printf("It's %s degrees, get your %s and %s.", temperature, outfit, shoe);
    }
}
