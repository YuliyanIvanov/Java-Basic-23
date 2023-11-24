package ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class G06NumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());

        // boolean isInRange = number >= -100 && number <= 100 && number != 0;
        // if (isInRange) {
        //            System.out.println("Yes");
        //        } else {
        //            System.out.println("No");
        //        }

        if (number >= -100 && number <= 100 && number != 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}