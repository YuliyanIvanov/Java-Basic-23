package WhileLoopLab;

import java.util.Scanner;

public class M05AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double sum = 0;

        //четът се входни данни до получаване на командата

        while (!input.equals("NoMoreMoney")) {
            double myMoney = Double.parseDouble(input);

            //Проверка дали парите са повече от 0
            //Принтира съобщение ако се въведе грешна сума

            if (myMoney < 0) {
                System.out.println("Invalid operation");
                break;
            }

            //принтира се колко пари са постъпили

            sum += myMoney;
            System.out.printf("Increase: %.2f\n", myMoney);

            //продължава да чете входни данни при не въведена команда

            input = scanner.nextLine();
        }

        //принтира се крайният баланс по сметката

        System.out.printf("Total: %.2f", sum);
    }
}
