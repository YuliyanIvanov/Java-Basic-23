package ForLoopLab;

import java.util.Scanner;

public class J09LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int firstSum = 0;
        int secondSum = 0;

        for (int i = 0; i < number; i++) {
            int firstNum = Integer.parseInt(scanner.nextLine());
            firstSum = firstSum + firstNum;
        }
        for (int i = 0; i < number; i++) {
            int secondNum = Integer.parseInt(scanner.nextLine());
            secondSum = secondSum + secondNum;
        }

        if (firstSum == secondSum) {
            System.out.printf("Yes, sum = %d", firstSum);
        } else {
            int diff = Math.abs(firstSum - secondSum);
            System.out.printf("No, diff = %d", diff);
        }
    }
}
