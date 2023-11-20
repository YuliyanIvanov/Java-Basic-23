package ConditionalStatementsLab;

import java.util.Scanner;

public class D02GreaterNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOne = Integer.parseInt(scanner.nextLine());
        int numTwo = Integer.parseInt(scanner.nextLine());

        System.out.println(Math.max(numOne, numTwo));
    }
}
