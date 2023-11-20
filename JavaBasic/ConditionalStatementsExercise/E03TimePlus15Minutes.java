package ConditionalStatementsExercise;

import java.util.Scanner;

public class E03TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        //calculate the total minutes (+ 15)
        int totalMinutes = hour * 60 + minutes + 15;

        //updating the hour and minutes
        hour = totalMinutes / 60;
        minutes = totalMinutes % 60;

        //check if it's midnight
        if (hour > 23) {
            hour = 0;
        }
        System.out.printf("%d:%02d", hour, minutes);
    }
}
