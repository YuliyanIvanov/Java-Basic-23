package ConditionalStatementsAdvancedMoreExercises;

import java.util.Scanner;

public class I07SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String group = scanner.nextLine();
        int numberOfStudents = Integer.parseInt(scanner.nextLine());
        int numberOfNights = Integer.parseInt(scanner.nextLine());

        double price = 0.0;
        String sport = "";
        double total;

        switch (season) {
            case "Winter":
                switch (group) {
                    case "boys":
                        price = 9.60;
                        sport = "Judo";
                        break;
                    case "girls":
                        price = 9.60;
                        sport = "Gymnastics";
                        break;
                    case "mixed":
                        price = 10;
                        sport = "Ski";
                        break;
                }
                break;
            case "Spring":
                switch (group) {
                    case "boys":
                        price = 7.20;
                        sport = "Tennis";
                        break;
                    case "girls":
                        price = 7.20;
                        sport = "Athletics";
                        break;
                    case "mixed":
                        price = 9.50;
                        sport = "Cycling";
                        break;
                }
                break;
            case "Summer":
                switch (group) {
                    case "boys":
                        price = 15;
                        sport = "Football";
                        break;
                    case "girls":
                        price = 15;
                        sport = "Volleyball";
                        break;
                    case "mixed":
                        price = 20;
                        sport = "Swimming";
                        break;
                }
                break;
            default:
                break;
        }
        total = numberOfNights * price * numberOfStudents;

        if (numberOfStudents >= 50) {
            total *= 0.5;
        } else if (numberOfStudents >= 20) {
            total *= 0.85;
        } else if (numberOfStudents >= 10) {
            total *= 0.95;
        }

        System.out.printf("%s %.2f lv.", sport, total);
    }
}
