package ForLoopMoreExercises;

import java.util.Scanner;

public class L03Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cargo = Integer.parseInt(scanner.nextLine());

        int allTons = 0;
        double transportPrice = 0;
        int microbusTons = 0;
        int truckTons = 0;
        int trainTons = 0;

        for (int i = 0; i < cargo; i++) {
            int tons = Integer.parseInt(scanner.nextLine());
            allTons += tons;

            if (tons <= 3) {
                transportPrice += tons * 200;
                microbusTons += tons;
            } else if (tons <= 11) {
                transportPrice += tons * 175;
                truckTons += tons;
            } else {
                transportPrice += tons * 120;
                trainTons += tons;
            }
        }

        double averagePrice = transportPrice / allTons;
        double microbusPercentage = microbusTons * 100.0 / allTons;
        double truckPercentage = truckTons * 100.0 / allTons;
        double trainPercentage = trainTons * 100.0 / allTons;

        System.out.printf("%.2f%n", averagePrice);
        System.out.printf("%.2f%%%n", microbusPercentage);
        System.out.printf("%.2f%%%n", truckPercentage);
        System.out.printf("%.2f%%%n", trainPercentage);
    }
}