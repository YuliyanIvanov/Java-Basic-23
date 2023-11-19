package FirstStepsInCodingMoreExercises;

import java.util.Scanner;

public class C07HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //input
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        //walls

        double wall = x * y;
        double window = 1.5 * 1.5;
        double leftAndRight = (wall * 2) - (window * 2);

        double backWall = x * x;
        double door = 1.2 * 2;
        double frontAndBack = (backWall * 2) - door;

        double totalWall = leftAndRight + frontAndBack;
        double greenPaint = totalWall / 3.4;

        //roof
        double roofSides = 2 * (x * y);
        double backAndFront = 2 * (x * h /2);

        double totalRoof = roofSides + backAndFront;
        double redPaint = totalRoof / 4.3;

        System.out.printf("%.2f\n", greenPaint);
        System.out.printf("%.2f", redPaint);
    }
}
