package ForLoopExercise;

import java.util.Scanner;

public class K06Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int judges = Integer.parseInt(scanner.nextLine());

        double allPoints = academyPoints;

        for (int i = 1; i <= judges; i++) {
            String judge = scanner.nextLine();
            double points = Double.parseDouble(scanner.nextLine());

            int length = judge.length();
            double calculatedPoints = length * points / 2;
            allPoints += calculatedPoints;

            if (allPoints > 1250.50) {
                break;
            }
        }

        double diff = 1250.5 - allPoints;

        if (allPoints > 1250.5) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!\n", actorName, allPoints);
        } else {
            System.out.printf("Sorry, %s you need %.1f more!\n", actorName, diff);
        }
    }
}
