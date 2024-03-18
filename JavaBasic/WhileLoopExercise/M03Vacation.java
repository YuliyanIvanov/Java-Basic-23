package WhileLoopExercise;

import java.util.Scanner;

public class M03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moneyNeeded = Double.parseDouble(scanner.nextLine());
        double startingMoney = Double.parseDouble(scanner.nextLine());

        int dayCounter = 0;
        int spendingCounter = 0;

        while (startingMoney < moneyNeeded && spendingCounter < 5) {
            String command = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());
            dayCounter++;

            if ("save".equals(command)) {
                startingMoney += money;
                spendingCounter = 0;
            } else if ("spend".equals(command)) {
                startingMoney -= money;
                spendingCounter += 1;
                if (startingMoney < 0) {
                    startingMoney = 0;
                }
            }
        }
        if (spendingCounter == 5) {
            System.out.println("You can't save the money.");
            System.out.println(dayCounter);
        } else {
            System.out.printf("You saved the money for %d days.", dayCounter);
        }
    }
}
