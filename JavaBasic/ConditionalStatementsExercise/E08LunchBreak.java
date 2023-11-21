package ConditionalStatementsExercise;

import java.util.Scanner;

public class E08LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String series = scanner.nextLine();
        int episodeLength = Integer.parseInt(scanner.nextLine());
        int breakLength = Integer.parseInt(scanner.nextLine());

        double lunchTime = breakLength / 8.0;
        double restTime = breakLength / 4.0;
        double timeLeft = breakLength - lunchTime - restTime;

        double diff = Math.ceil(Math.abs(timeLeft - episodeLength));

        if (timeLeft >= episodeLength) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", series, diff);
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", series, diff);
        }
    }
}
