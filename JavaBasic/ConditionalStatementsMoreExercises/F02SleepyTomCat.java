package ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class F02SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vacationDays = Integer.parseInt(scanner.nextLine());

        //we must find the working days
        int workDays = 365 - vacationDays;

        //now we must find the time that the owner plays whit him during work days and vacation days
        int minVac = vacationDays * 127;
        int minWork = workDays * 63;

        //calculate in minutes
        int play = 30000 - (minVac + minWork);
        int hours = play / 60;
        double min = play % 60;

        if (play >= 0) {
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %.0f minutes less for play", hours, min);
        } else {
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %.0f minutes more for play", Math.abs(hours), Math.abs(min));
        }
    }
}
