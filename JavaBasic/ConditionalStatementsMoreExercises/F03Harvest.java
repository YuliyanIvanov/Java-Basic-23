package ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class F03Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vineyard = Integer.parseInt(scanner.nextLine());
        double grapesForOneSqM = Double.parseDouble(scanner.nextLine());
        int wineNeeded = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());

        //total grape yield
        double totalYield = vineyard * grapesForOneSqM;

        //calculating wine yield
        double wine = (0.4 / 2.5) * totalYield;

        if (wineNeeded <= wine) {
            double wineSurplus = Math.floor(wine - wineNeeded);
            double wineForWorkers = Math.ceil(wineSurplus / workers);

            System.out.printf("Good harvest this year! Total wine: %.0f liters.\n", wine);
            System.out.printf("%.0f liters left -> %.0f liters per person.", wineSurplus, wineForWorkers);
        } else {
            double diff = Math.floor(wineNeeded - wine);
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", diff);
        }
    }
}
