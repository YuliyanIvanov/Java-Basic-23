package WhileLoopLab;

import java.util.Scanner;

public class M04Sequence2kPlus1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        int number = 1;

        while (number <= num) {
            System.out.println(number);
            number = number * 2 + 1;
        }
    }
}
