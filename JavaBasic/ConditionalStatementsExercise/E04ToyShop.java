package ConditionalStatementsExercise;

import java.util.Scanner;

public class E04ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double excursion = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int talkingDolls = Integer.parseInt(scanner.nextLine());
        int teddyBears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        // Calculating the price of each type of toy
        double puzzlesPrice = puzzles * 2.60;
        double talkingDollsPrice = talkingDolls * 3;
        double teddyBearsPrice = teddyBears * 4.10;
        double minionsPrice = minions * 8.20;
        double trucksPrice = trucks * 2;

        // Calculating the total cost of all toys
        double midSum = puzzlesPrice + talkingDollsPrice + teddyBearsPrice + minionsPrice + trucksPrice;

        // Calculating the total number of toys
        int toyCount = puzzles + talkingDolls + teddyBears + minions + trucks;

        // Apply a discount if the total number of toys is 50 or more
        if (toyCount >= 50) {
            midSum = midSum - (midSum * 0.25);
        }

        // Calculating the total profit after applying discounts
        double totalProfit = midSum - (midSum * 0.10);

        // Calculate the difference between the total profit and the excursion budget
        double diff = Math.abs(totalProfit - excursion);

        // Output the result based on the comparison between total profit and excursion budget
        if (totalProfit >= excursion) {
            System.out.printf("Yes! %.2f lv left.", diff);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", diff);
        }
    }
}
