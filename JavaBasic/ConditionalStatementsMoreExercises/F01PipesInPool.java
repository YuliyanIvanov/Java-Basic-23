package ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class F01PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int poolVolume = Integer.parseInt(scanner.nextLine());
        int pipeOneFlow = Integer.parseInt(scanner.nextLine());
        int pipeTwoFlow = Integer.parseInt(scanner.nextLine());
        double unmanned = Double.parseDouble(scanner.nextLine());

        double pipeOne = pipeOneFlow * unmanned;
        double pipeTwo = pipeTwoFlow * unmanned;
        double totalFilled = pipeOne + pipeTwo;

        double percentFull = totalFilled / poolVolume * 100;
        double pipeOnePercent = pipeOne / totalFilled * 100;
        double pipeTwoPercent = pipeTwo / totalFilled * 100;

        if (totalFilled <= poolVolume) {
            System.out.printf("The pool is %.2f", percentFull);
            System.out.print("%. Pipe 1: ");
            System.out.printf("%.2f", pipeOnePercent);
            System.out.print("%. Pipe 2: ");
            System.out.printf("%.2f", pipeTwoPercent);
            System.out.print("%.");
        } else {
            double diff = Math.abs(totalFilled - poolVolume);
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", unmanned, diff);
        }
    }
}
