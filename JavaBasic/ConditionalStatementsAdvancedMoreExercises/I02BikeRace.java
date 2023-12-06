package ConditionalStatementsAdvancedMoreExercises;

import java.util.Scanner;

public class I02BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int juniors = Integer.parseInt(scanner.nextLine());
        int seniors = Integer.parseInt(scanner.nextLine());
        String trace = scanner.nextLine();

        double juniorTax = 0;
        double seniorTax = 0;

        switch (trace) {
            case "trail":
                juniorTax = 5.50;
                seniorTax = 7;
                break;
            case "cross-country":
                juniorTax = 8;
                seniorTax = 9.50;

                int participants = juniors + seniors;

                if (participants >= 50) {
                    juniorTax -= juniorTax * 0.25;
                    seniorTax -= seniorTax * 0.25;
                }
                break;
            case "downhill":
                juniorTax = 12.25;
                seniorTax = 13.75;
                break;
            case "road":
                juniorTax = 20;
                seniorTax = 21.50;
                break;
        }

        double totalJuniors = juniors * juniorTax;
        double totalSeniors = seniors * seniorTax;

        double totalProfit = totalJuniors + totalSeniors;
        totalProfit *= 0.95;

        System.out.printf("%.2f", totalProfit);
    }
}
