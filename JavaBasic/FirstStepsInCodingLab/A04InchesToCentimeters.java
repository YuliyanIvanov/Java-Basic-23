package FirstStepsInCodingLab;

import java.util.Scanner;

public class A04InchesToCentimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double inch = Double.parseDouble(scanner.nextLine());

        double centimeters = inch * 2.54;

        System.out.println(centimeters);
    }
}