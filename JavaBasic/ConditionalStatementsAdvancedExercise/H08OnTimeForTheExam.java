package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class H08OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examH = Integer.parseInt(scanner.nextLine());
        int examM = Integer.parseInt(scanner.nextLine());
        int arrivalH = Integer.parseInt(scanner.nextLine());
        int arrivalM = Integer.parseInt(scanner.nextLine());

        int examTimeInM = examH * 60 + examM;
        int arrivalTimeInM = arrivalH * 60 + arrivalM;

        int diff = Math.abs(examTimeInM - arrivalTimeInM);

        if (examTimeInM < arrivalTimeInM) {
            System.out.println("Late");
            if (diff >= 60) {
                int hour = diff / 60;
                int min = diff % 60;
                System.out.printf("%d:%02d hours after the start", hour, min);
            } else {
                System.out.printf("%d minutes after the start", diff);
            }
        } else if (examTimeInM == arrivalTimeInM || diff <= 30) {
            System.out.println("On time");
            if (diff >= 1 && diff <= 30) {
                System.out.printf("%d minutes before the start", diff);
            }
        } else {
            System.out.println("Early");
            if (diff >= 60) {
                int hour = diff / 60;
                int min = diff % 60;
                System.out.printf("%d:%02d hours before the start", hour, min);
            } else {
                System.out.printf("%d minutes before the start", diff);
            }
        }
    }
}
