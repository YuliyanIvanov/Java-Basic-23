package WhileLoopLab;

import java.util.Scanner;

public class M08Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String student = scanner.nextLine();
        int goodGrades = 0;
        int poorGrades = 0;
        int gradeCount = 1;
        double allGradesSum = 0;

        boolean isFailed = false;

        while (goodGrades < 12) {
            if (poorGrades == 2) {
                isFailed = true;
                break;
            }
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade < 4) {
                poorGrades++;
                continue;
            }
            gradeCount++;
            goodGrades++;
            allGradesSum += grade;
        }
        double avr = allGradesSum / 12;
        if (isFailed) {
            System.out.printf("%s has been excluded at %d grade", student, gradeCount);
        } else {
            System.out.printf("%s graduated. Average grade: %.2f", student, avr);
        }
    }
}
