package ConditionalStatementsExercise;

import java.util.Scanner;

public class E06WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double worldRecord = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());
        double timePerMeter = Double.parseDouble(scanner.nextLine());

        //calculate the time he will need to swim the distance
        double timeNeeded = length * timePerMeter;

        //calculate the slowing by length and time
        double resistance = Math.floor(length / 15);
        double timeResistance = resistance * 12.5;

        //total time he did
        double finalResult = timeNeeded + timeResistance;

        //check if he beat the record or not
        if (finalResult < worldRecord) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds. ", finalResult);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", Math.abs(finalResult - worldRecord));
        }
    }
}
