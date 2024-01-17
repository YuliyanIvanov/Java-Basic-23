package ForLoopExercise;

import java.util.Scanner;

public class K07TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groups = Integer.parseInt(scanner.nextLine());

        double musala = 0;
        double monblan = 0;
        double kilimanjaro = 0;
        double k2 = 0;
        double everest = 0;

        int totalPeople = 0;

        for (int i = 1; i <= groups; i++) {
            int climbers = Integer.parseInt(scanner.nextLine());

            if (climbers <= 5) {
                musala += climbers;
            } else if (climbers <= 12) {
                monblan += climbers;
            } else if (climbers <= 25) {
                kilimanjaro += climbers;
            } else if (climbers <= 40) {
                k2 += climbers;
            } else {
                everest += climbers;
            }
            totalPeople += climbers;
        }

        musala = musala / totalPeople * 100;
        monblan = monblan / totalPeople * 100;
        kilimanjaro = kilimanjaro / totalPeople * 100;
        k2 = k2 / totalPeople * 100;
        everest = everest / totalPeople * 100;

        System.out.printf("%.2f%%\n", musala);
        System.out.printf("%.2f%%\n", monblan);
        System.out.printf("%.2f%%\n", kilimanjaro);
        System.out.printf("%.2f%%\n", k2);
        System.out.printf("%.2f%%\n", everest);

    }
}
