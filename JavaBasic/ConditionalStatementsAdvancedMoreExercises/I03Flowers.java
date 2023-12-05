package ConditionalStatementsAdvancedMoreExercises;

import java.util.Scanner;

public class I03Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chrysanthemums = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int tulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String holiday = scanner.nextLine();

        double chrysanthemumsPrice = 0;
        double rosesPrice = 0;
        double tulipsPrice = 0;

        int flowerCount = chrysanthemums + roses + tulips;

        switch (season) {
            case "Spring":
            case "Summer":
                chrysanthemumsPrice = 2;
                rosesPrice = 4.10;
                tulipsPrice = 2.50;
                break;
            case "Autumn":
            case "Winter":
                chrysanthemumsPrice = 3.75;
                rosesPrice = 4.50;
                tulipsPrice = 4.15;
                break;
        }
        switch (holiday) {
            case "Y":
                chrysanthemumsPrice *= 1.15;
                rosesPrice *= 1.15;
                tulipsPrice *= 1.15;
                break;
            case "N":
                break;
        }
        double flowerPrice = (chrysanthemums * chrysanthemumsPrice) +
                (roses * rosesPrice) + (tulips * tulipsPrice);

        if (season.equals("Spring") && tulips > 7) {
            flowerPrice *= 0.95;
        }
        if (season.equals("Winter") && roses >= 10) {
            flowerPrice *= 0.9;
        }
        if (flowerCount > 20) {
            flowerPrice *= 0.8;
        }

        flowerPrice += 2;

        System.out.printf("%.2f", flowerPrice);

    }
}
