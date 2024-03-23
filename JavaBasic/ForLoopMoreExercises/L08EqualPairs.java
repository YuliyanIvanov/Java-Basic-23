package ForLoopMoreExercises;

import java.util.Scanner;

public class L08EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int maxDiff = 0;
        int prevSum = 0;
        boolean allEqual = true;

        for (int i = 0; i < n; i++) {
            int num1 = Integer.parseInt(scanner.nextLine());
            int num2 = Integer.parseInt(scanner.nextLine());

            int currentSum = num1 + num2;
            sum += currentSum;

            if (i > 0) {
                int diff = Math.abs(currentSum - prevSum);
                if (diff > maxDiff) {
                    maxDiff = diff;
                }
                if (currentSum != prevSum) {
                    allEqual = false;
                }
            }
            prevSum = currentSum;
        }

        if (allEqual) {
            System.out.printf("Yes, value=%d", sum / n);
        } else {
            System.out.printf("No, maxdiff=%d", maxDiff);
        }
    }
}
