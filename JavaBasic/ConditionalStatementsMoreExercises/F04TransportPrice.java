package ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class F04TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kilometers = Integer.parseInt(scanner.nextLine());
        String timeOfDay = scanner.nextLine();

        double taxiStartPrice = 0.7;
        double taxiDayPrice = 0.79;
        double taxiNightPrice = 0.9;

        double busDayAndNightPrice = 0.09;
        double trainDayAndNightPrice = 0.06;

        double price;

        switch (timeOfDay) {
            case "day":
                if (kilometers < 20) {
                    price = taxiStartPrice + kilometers * taxiDayPrice;
                } else if (kilometers < 100) {
                    price = kilometers * busDayAndNightPrice;
                } else {
                    price = kilometers * trainDayAndNightPrice;
                }
                break;

            case "night":
                if (kilometers < 20) {
                    price = taxiStartPrice + kilometers * taxiNightPrice;
                } else if (kilometers < 100) {
                    price = kilometers * busDayAndNightPrice;
                } else {
                    price = kilometers * trainDayAndNightPrice;
                }
                break;

            default:
                price = 0;
                break;
        }

        System.out.printf("%.2f", price);
    }
}