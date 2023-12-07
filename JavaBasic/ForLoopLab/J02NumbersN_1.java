package ForLoopLab;

import java.util.Scanner;

public class J02NumbersN_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int n = num; n >= 1; n--) {
            System.out.println(n);
        }
    }
}
