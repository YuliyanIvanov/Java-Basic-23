package FirstStepsInCodingExercise;

import java.util.Scanner;

public class B04VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bookPages = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int hours = bookPages / pagesPerHour;
        int daysNeeded = hours / days;

        System.out.println(daysNeeded);
    }
}
