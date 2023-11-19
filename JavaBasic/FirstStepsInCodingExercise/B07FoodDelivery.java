package FirstStepsInCodingExercise;

import java.util.Scanner;

public class B07FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chickenMenu = Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int vegMenu = Integer.parseInt(scanner.nextLine());

        double chicken = chickenMenu * 10.35;
        double fish = fishMenu * 12.40;
        double veg = vegMenu * 8.15;

        double totalMenu = chicken + fish + veg;

        double desert = totalMenu * 0.2;
        double delivery = 2.5;

        double total = totalMenu + desert + delivery;

        System.out.printf("%.2f", total);
    }
}
