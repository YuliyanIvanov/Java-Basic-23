package ForLoopLab;

import java.util.Scanner;

public class J03Numbers1_NwithStep3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int n = 1; n <= num; n += 3) {
            System.out.println(n);
        }
    }
}
