package FirstStepsInCodingExercise;

import java.util.Scanner;

public class B03DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double depSum = Double.parseDouble(scanner.nextLine());
        int depTime = Integer.parseInt(scanner.nextLine());
        double intrest = Double.parseDouble(scanner.nextLine());

        double total = depSum + depTime * ((depSum * (intrest / 100)) / 12);

        System.out.printf("%s", total);
    }
}
