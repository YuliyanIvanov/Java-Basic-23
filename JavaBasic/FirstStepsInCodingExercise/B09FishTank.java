package FirstStepsInCodingExercise;

import java.util.Scanner;

public class B09FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double persent = Double.parseDouble(scanner.nextLine());

        double capacity = length * width * height;
        double bulk = capacity / 1000;

        double neededSpace = bulk * (1 - (persent / 100));

        System.out.println(neededSpace);
    }
}
