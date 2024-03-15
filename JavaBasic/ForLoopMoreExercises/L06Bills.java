package ForLoopMoreExercises;

import java.util.Scanner;

public class L06Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int months = Integer.parseInt(scanner.nextLine());

        double electricity = 0;
        double water = months * 20;
        double internet = months * 15;

        for (int month = 0; month < months; month++) {
            double electricBill = Double.parseDouble(scanner.nextLine());
            electricity += electricBill;
        }

        double totalBills = electricity + water + internet;
        double totalEtc = totalBills * 1.2;

        double totalExpenses = totalBills + totalEtc;
        double average = totalExpenses / months;

        System.out.printf("Electricity: %.2f lv%n", electricity);
        System.out.printf("Water: %.2f lv%n", water);
        System.out.printf("Internet: %.2f lv%n", internet);
        System.out.printf("Other: %.2f lv%n", totalEtc);
        System.out.printf("Average: %.2f lv%n", average);
    }
}
