package ConditionalStatementsAdvancedMoreExercises;

import java.util.Scanner;

public class I01MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double budget = Double.parseDouble(scanner.nextLine());
        String type = scanner.nextLine();
        int people = Integer.parseInt(scanner.nextLine());

        double vipTicketPrice = 499.99;
        double normalTicketPrice = 249.99;

        double transportPercent = 0;

        if (people >= 1 && people <= 4) {
            transportPercent = 0.75;
        } else if (people >= 5 && people <= 9) {
            transportPercent = 0.6;
        } else if (people >= 10 && people <= 24) {
            transportPercent = 0.5;
        } else if (people >= 25 && people <= 49) {
            transportPercent = 0.4;
        } else {
            transportPercent = 0.25;
        }

        double transportBudget = budget * transportPercent;
        double remainingBudget = budget - transportBudget;

        double totalExpense = 0;

        switch (type) {
            case "VIP":
                totalExpense = people * vipTicketPrice;
                break;
            case "Normal":
                totalExpense = people * normalTicketPrice;
                break;
        }

        double diff = Math.abs(totalExpense - remainingBudget);

        if (remainingBudget >= totalExpense) {
            System.out.printf("Yes! You have %.2f leva left.\n", diff);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", diff);
        }
    }
}
