package ForLoopMoreExercises;

import java.util.Scanner;

public class L05GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int moves = Integer.parseInt(scanner.nextLine());

        double zeroToNine = 0;
        double tenToNineteen = 0;
        double twentyToTwentyNine = 0;
        double thirtyToThirtyNine = 0;
        double fortyToFifty = 0;
        double invalidMoves = 0;
        double totalScore = 0;

        for (int game = 0; game < moves; game++) {
            int points = Integer.parseInt(scanner.nextLine());

            if (points >= 0 && points <= 9) {
                zeroToNine++;
                totalScore += (points * 0.2);
            } else if (points >= 10 && points <= 19) {
                tenToNineteen++;
                totalScore += (points * 0.3);
            } else if (points >= 20 && points <= 29) {
                twentyToTwentyNine++;
                totalScore += (points * 0.4);
            } else if (points >= 30 && points <= 39) {
                thirtyToThirtyNine++;
                totalScore += 50;
            } else if (points >= 40 && points <= 50) {
                fortyToFifty++;
                totalScore += 100;
            } else {
                invalidMoves++;
                totalScore /= 2;
            }
        }
        double finalScore = totalScore;

        System.out.printf("%.2f\n", finalScore);

        double zeroToNinePercent = zeroToNine / moves * 100;
        System.out.printf("From 0 to 9: %.2f%%\n", zeroToNinePercent);

        double tenToNineteenPercent = tenToNineteen / moves * 100;
        System.out.printf("From 10 to 19: %.2f%%\n", tenToNineteenPercent);

        double twentyToTwentyNinePercent = twentyToTwentyNine / moves * 100;
        System.out.printf("From 20 to 29: %.2f%%\n", twentyToTwentyNinePercent);

        double thirtyToThirtyNinePercent = thirtyToThirtyNine / moves * 100;
        System.out.printf("From 30 to 39: %.2f%%\n", thirtyToThirtyNinePercent);

        double fortyToFiftyPercent = fortyToFifty / moves * 100;
        System.out.printf("From 40 to 50: %.2f%%\n", fortyToFiftyPercent);

        double invalidPercent = invalidMoves / moves * 100;
        System.out.printf("Invalid numbers: %.2f%%\n", invalidPercent);
    }
}
