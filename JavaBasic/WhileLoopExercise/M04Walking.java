package WhileLoopExercise;

import java.util.Scanner;

public class M04Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stepsWalked = 0;
        boolean returnHome = false;

        while (stepsWalked < 10000) {
            String data = scanner.nextLine();

            if (data.equals("Going home")) {
                returnHome = true;
                int steps = Integer.parseInt(scanner.nextLine());
                stepsWalked += steps;
                break;
            } else {
                int steps = Integer.parseInt(data);
                stepsWalked += steps;
            }
        }
        int diff = Math.abs(10000 - stepsWalked);

        if (returnHome && stepsWalked < 10000) {
            System.out.printf("%d more steps to reach goal.", diff);
        } else {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", diff);
        }
    }
}
