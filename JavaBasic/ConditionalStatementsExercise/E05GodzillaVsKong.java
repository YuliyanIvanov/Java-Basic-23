package ConditionalStatementsExercise;

import java.util.Scanner;

public class E05GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int crue = Integer.parseInt(scanner.nextLine());
        double crueOutfits = Double.parseDouble(scanner.nextLine());

        double decor = budget * 0.1;
        double crueOutfitPrice = crue * crueOutfits;

        if (crue > 150) {
            crueOutfitPrice = crueOutfitPrice - (crueOutfitPrice * 0.1);
        }

        double total = crueOutfitPrice + decor;
        double diff = Math.abs(total - budget);

        if (total > budget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", diff);
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", diff);
        }
    }
}
