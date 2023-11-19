package FirstStepsInCodingMoreExercises;

import java.util.Scanner;

public class C04VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vegetablesPrice = Double.parseDouble(scanner.nextLine());
        double fruitPrice = Double.parseDouble(scanner.nextLine());
        int kgVegetables = Integer.parseInt(scanner.nextLine());
        int kgFruit = Integer.parseInt(scanner.nextLine());

        double totalVeg = vegetablesPrice * kgVegetables;
        double totalFruit = fruitPrice * kgFruit;

        double totalBgn = totalFruit + totalVeg;
        double totalEuro = totalBgn / 1.94;

        System.out.printf("%.2f", totalEuro);
    }
}
