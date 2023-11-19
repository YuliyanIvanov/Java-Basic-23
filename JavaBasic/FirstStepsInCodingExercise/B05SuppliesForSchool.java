package FirstStepsInCodingExercise;

import java.util.Scanner;

public class B05SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int detergent = Integer.parseInt(scanner.nextLine());
        double discount = Double.parseDouble(scanner.nextLine());

        double penPrice = pens * 5.80;
        double markerPrice = markers * 7.20;
        double detergentPrice = detergent * 1.20;

        double total = penPrice + markerPrice + detergentPrice;
        double finalPrice = total - (total * (discount / 100));

        System.out.printf("%s", finalPrice);
    }
}
