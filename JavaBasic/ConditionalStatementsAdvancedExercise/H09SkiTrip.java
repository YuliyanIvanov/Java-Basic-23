package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class H09SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine();
        String feedback = scanner.nextLine();

        double sum = days - 1;

        switch (room) {
            case "room for one person":
                sum *= 18;
                break;
            case "apartment":
                sum *= 25;
                if (days < 10) {
                    sum = sum * 0.7;
                } else if (days <= 15) {
                    sum = sum * 0.65;
                } else {
                    sum = sum * 0.5;
                }
                break;
            case "president apartment":
                sum *= 35;
                if (days < 10) {
                    sum = sum * 0.9;
                } else if (days <= 15) {
                    sum = sum * 0.85;
                } else {
                    sum = sum * 0.8;
                }
                break;
            default:
                break;
        }
        switch (feedback) {
            case "positive":
                sum *= 1.25;
                break;
            case "negative":
                sum *= 0.9;
                break;
            default:
                break;
        }
        System.out.printf("%.2f", sum);
    }
}
