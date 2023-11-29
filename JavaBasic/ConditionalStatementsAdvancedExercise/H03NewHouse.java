package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class H03NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flower = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double expense = 0;

        switch (flower) {
            case "Roses":
                if (count > 80) {
                    expense = count * 5 * 0.9;
                } else {
                    expense = count * 5;
                }
                break;
            case "Dahlias":
                if (count > 90) {
                    expense = count * 3.80 * 0.85;
                } else {
                    expense = count * 3.80;
                }
                break;
            case "Tulips":
                if (count > 80) {
                    expense = count * 2.80 * 0.85;
                } else {
                    expense = count * 2.80;
                }
                break;
            case "Narcissus":
                if (count < 120) {
                    expense = count * 3 * 1.15;
                } else {
                    expense = count * 3;
                }
                break;
            case "Gladiolus":
                if (count < 80) {
                    expense = count * 2.50 * 1.2;
                } else {
                    expense = count * 2.50;
                }
                break;
            default:
                break;
        }

        double diff = Math.abs(budget - expense);

        if (budget >= expense) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", count, flower, diff);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", diff);
        }
    }
}
