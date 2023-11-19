package FirstStepsInCodingLab;

import java.util.Scanner;

public class A08PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double dogFood = Double.parseDouble(scanner.nextLine()) * 2.5;
        double catFood = Double.parseDouble(scanner.nextLine()) * 4;

        double total = dogFood + catFood;

        System.out.printf("%s lv.", total);
    }
}
