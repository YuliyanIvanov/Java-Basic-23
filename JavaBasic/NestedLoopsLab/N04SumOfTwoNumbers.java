package NestedLoopsLab;

import java.util.Scanner;

public class N04SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());

        int combinationsCount = 0;
        boolean found = false;

        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                combinationsCount++;
                if (i + j == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)%n",
                            combinationsCount, i, j, magicNumber);
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }
        if (!found) {
            System.out.printf("%d combinations - neither equals %d%n",
                    combinationsCount, magicNumber);
        }
    }
}
