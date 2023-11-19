package FirstStepsInCodingMoreExercises;

import java.util.Scanner;

public class C06Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double mackerelKgPrice = Double.parseDouble(scanner.nextLine());
        double spratKgPrice = Double.parseDouble(scanner.nextLine());
        double bonitoKg = Double.parseDouble(scanner.nextLine());
        double scadKg = Double.parseDouble(scanner.nextLine());
        int clams = Integer.parseInt(scanner.nextLine());

        double bonitoKgPrize = bonitoKg * (mackerelKgPrice + (0.6 * mackerelKgPrice));
        double scadKgPrize = scadKg * (spratKgPrice + (0.8 * spratKgPrice));
        double clamsPrize = clams * 7.5;

        double Total = bonitoKgPrize + scadKgPrize + clamsPrize;

        System.out.printf("%.2f", Total);
    }
}
