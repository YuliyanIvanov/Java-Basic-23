package ForLoopLab;

import java.util.Scanner;

public class J04EvenPowersOf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int power = 0; power <= n; power += 2) {
            int result = (int) Math.pow(2, power);
            System.out.println(result);
        }
    }
}
