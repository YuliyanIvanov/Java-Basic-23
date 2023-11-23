package ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class F05Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int foodLeftForPets = Integer.parseInt(scanner.nextLine());
        double dogFoodKg = Double.parseDouble(scanner.nextLine());
        double catFoodKg = Double.parseDouble(scanner.nextLine());
        double turtleFoodGr = Double.parseDouble(scanner.nextLine());

        double totalFood = Math.ceil(days * (dogFoodKg + catFoodKg + (turtleFoodGr * 0.001)));

        double diff = Math.ceil(Math.abs(foodLeftForPets - totalFood));

        if (foodLeftForPets >= totalFood) {
            System.out.printf("%.0f kilos of food left.", diff);
        } else {
            System.out.printf("%.0f more kilos of food are needed.", diff);
        }
    }
}
