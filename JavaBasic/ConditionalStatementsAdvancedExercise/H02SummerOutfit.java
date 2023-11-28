package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class H02SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double temperature = Double.parseDouble(scanner.nextLine());
        String timeOfDay = scanner.nextLine();

        String outfit;
        String shoe;

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
        }
    }
}
