package ForLoopMoreExercises;

import java.util.Scanner;

public class L07FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stadiumCapacity = Integer.parseInt(scanner.nextLine());
        double fans = Integer.parseInt(scanner.nextLine());

        double fansSectorA = 0, fansSectorB = 0, fansSectorV = 0, fansSectorG = 0;

        for (int i = 0; i < fans; i++) {
            String sector = scanner.nextLine();

            switch (sector) {
                case "A":
                    fansSectorA++;
                    break;
                case "B":
                    fansSectorB++;
                    break;
                case "V":
                    fansSectorV++;
                    break;
                case "G":
                    fansSectorG++;
                    break;
                default:
                    break;
            }
        }

        double percentA = fansSectorA / fans * 100;
        double percentB = fansSectorB / fans * 100;
        double percentV = fansSectorV / fans * 100;
        double percentG = fansSectorG / fans * 100;

        double totalFansPercent = fans / stadiumCapacity * 100;

        System.out.printf("%.2f%%\n",percentA);
        System.out.printf("%.2f%%\n",percentB);
        System.out.printf("%.2f%%\n",percentV);
        System.out.printf("%.2f%%\n",percentG);
        System.out.printf("%.2f%%",totalFansPercent);

    }
}
