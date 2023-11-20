package ConditionalStatementsLab;

import java.util.Scanner;

public class D07AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String figure = scanner.nextLine();
        double area = 0;

        switch (figure) {
            case "square":
                double sideA = Double.parseDouble(scanner.nextLine());
                area = sideA * sideA;
                break;
            case "rectangle":
                double a = Double.parseDouble(scanner.nextLine());
                double b = Double.parseDouble(scanner.nextLine());
                area = a * b;
                break;
            case "circle":
                double r = Double.parseDouble(scanner.nextLine());
                area = Math.PI * r * r;
                break;
            case "triangle":
                double side = Double.parseDouble(scanner.nextLine());
                double h = Double.parseDouble(scanner.nextLine());
                area = side * h / 2;
                break;
        }
        System.out.printf("%.3f", area);
    }
}
