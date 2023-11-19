package FirstStepsInCodingMoreExercises;

import java.util.Scanner;

public class C05TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());

        // Convert the length and width to centimeters
        double lengthToCm = 100 * length;
        double widthToCm = 100 * width;

        // Convert the length and width to integers
        int valueLength = (int) lengthToCm;
        int valueWidth = (int) widthToCm;

        // Calculate the number of columns based on the length
        int lengthToColons = valueLength / 120;

        // Calculate the number of seats in each row based on the width
        int widthToSeats = (valueWidth - 100) / 70;

        // Calculate the total number of seats in the training lab
        double widthPerLength = widthToSeats * lengthToColons;

        // Subtract 3 to account for the teacher's desk
        double total = widthPerLength - 3;

        System.out.printf("%.0f", total);
    }
}
