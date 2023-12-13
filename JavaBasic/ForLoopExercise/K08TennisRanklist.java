package ForLoopExercise;

import java.util.Scanner;

public class K08TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tournaments = Integer.parseInt(scanner.nextLine());
        int starterPoints = Integer.parseInt(scanner.nextLine());

        int points;
        points = starterPoints;

        double winCount = 0;
        double pointsFromTournaments = 0;
        double winPercent;

        for (int i = 1; i <= tournaments; i++) {
            String stage = scanner.nextLine();

            switch (stage) {
                case "W":
                    points += 2000;
                    pointsFromTournaments += 2000;
                    winCount++;
                    break;
                case "F":
                    points += 1200;
                    pointsFromTournaments += 1200;
                    break;
                case "SF":
                    points += 720;
                    pointsFromTournaments += 720;
                    break;
            }
        }
        double averagePoints = Math.floor(pointsFromTournaments / tournaments);
        winPercent = winCount / tournaments * 100;

        System.out.printf("Final points: %d\n", points);
        System.out.printf("Average points: %.0f\n", averagePoints);
        System.out.printf("%.2f%%", winPercent);
    }
}
