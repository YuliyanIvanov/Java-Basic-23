package ForLoopMoreExercises;

import java.util.Scanner;

public class L01BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double inheritance = Double.parseDouble(scanner.nextLine());
        int yearToLive = Integer.parseInt(scanner.nextLine());

        int years = 19;
        double remainingMoney = inheritance;

        for (int year = 1800; year <= yearToLive; year++) {
            if (year % 2 == 0) {
                remainingMoney -= 12000;
            } else {
                remainingMoney -= (12000 + (50 * years));
                years += 2;
            }
        }
        if (inheritance >= remainingMoney && remainingMoney >= 0) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", remainingMoney);
        } else {
            remainingMoney = Math.abs(remainingMoney);
            System.out.printf("He will need %.2f dollars to survive.", remainingMoney);
        }
    }
}



