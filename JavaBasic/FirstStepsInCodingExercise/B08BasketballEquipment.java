package FirstStepsInCodingExercise;

import java.util.Scanner;

public class B08BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tax = Integer.parseInt(scanner.nextLine());

        double shoes = tax - (tax * 0.4);
        double outfit = shoes - (shoes * 0.2);
        double ball = outfit / 4;
        double trinkets = ball / 5;

        double total = tax + shoes + outfit + ball + trinkets;

        System.out.printf("%.2f", total);
    }
}
