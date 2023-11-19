package FirstStepsInCodingLab;

import java.util.Scanner;

public class A09YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double yard = Double.parseDouble(scanner.nextLine());

        double price = yard * 7.61;
        double priceDiscount = price * 0.18;
        double total = price - priceDiscount;

        System.out.printf("The final price is: %.2f lv.\n", total);
        System.out.printf("The discount is: %.2f lv.", priceDiscount);
    }
}
