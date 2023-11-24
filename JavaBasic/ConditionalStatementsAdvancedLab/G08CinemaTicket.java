package ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class G08CinemaTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();
        int tiket = 0;

        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Friday":
                tiket = 12;
                break;
            case "Wednesday":
            case "Thursday":
                tiket = 14;
                break;
            case "Saturday":
            case "Sunday":
                tiket = 16;
                break;
        }
        System.out.println(tiket);
    }
}
