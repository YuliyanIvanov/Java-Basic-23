package ForLoopExercise;

import java.util.Scanner;

public class K02HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers = Integer.parseInt(scanner.nextLine());

        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 1; i <= numbers; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            sum += num;

            if (num > max) {
                max = num;
            }
        }
        int sumWithOutTaxNumber = sum - max;

        if (max == sumWithOutTaxNumber) {
            System.out.println("Yes");
            System.out.println("Sum = " + max);
        } else {
            int diff = Math.abs(max - sumWithOutTaxNumber);
            System.out.println("No");
            System.out.println("Diff = " + diff);
        }
    }
}
