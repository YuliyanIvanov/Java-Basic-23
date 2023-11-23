package ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class F06FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int magnolias = Integer.parseInt(scanner.nextLine());
        int hyacinths = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int cacti = Integer.parseInt(scanner.nextLine());
        double giftPrice = Double.parseDouble(scanner.nextLine());

        double magnoliasPrice = magnolias * 3.25;
        double hyacinthsPrice = hyacinths * 4;
        double rosesPrice = roses * 3.50;
        double cactiPrice = cacti * 8;

        double profit = magnoliasPrice + hyacinthsPrice + rosesPrice + cactiPrice;
        double total = profit - profit * 0.05;

        if (total >= giftPrice) {
            double moneyLeft = Math.floor(total - giftPrice);
            System.out.printf("She is left with %.0f leva.%n", moneyLeft);
        } else {
            double moneyNeeded = Math.ceil(giftPrice - total);
            System.out.printf("She will have to borrow %.0f leva.%n", moneyNeeded);
        }
    }
}
