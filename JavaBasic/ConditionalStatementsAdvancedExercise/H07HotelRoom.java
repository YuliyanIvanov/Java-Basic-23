package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class H07HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double apartmentPrice = 0;
        double studioPrice = 0;

        double discount;

        switch (month) {
            case "May":
            case "October":
                studioPrice = nights * 50;
                apartmentPrice = nights * 65;

                if (nights > 7 && nights < 14) {
                    discount = studioPrice * 0.05;
                    studioPrice -= discount;
                } else if (nights > 14) {
                    discount = studioPrice * 0.3;
                    studioPrice -= discount;
                }
                break;

            case "June":
            case "September":
                studioPrice = nights * 75.2;
                apartmentPrice = nights * 68.7;

                if (nights > 14) {
                    discount = studioPrice * 0.2;
                    studioPrice -= discount;
                }
                break;

            case "July":
            case "August":
                studioPrice = nights * 76;
                apartmentPrice = nights * 77;
                break;
        }

        if (nights > 14) {
            discount = apartmentPrice * 0.1;
            apartmentPrice -= discount;
        }

        System.out.printf("Apartment: %.2f lv.\n", apartmentPrice);
        System.out.printf("Studio: %.2f lv.", studioPrice);
    }
}