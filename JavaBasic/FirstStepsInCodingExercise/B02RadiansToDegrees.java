package FirstStepsInCodingExercise;

import java.util.Scanner;

public class B02RadiansToDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radians = Double.parseDouble(scanner.nextLine());
        double degrees = radians * 180 / Math.PI;

        System.out.printf("%s", degrees);
    }
}
