package ForLoopMoreExercises;

import java.util.Scanner;

public class L04Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int students = Integer.parseInt(scanner.nextLine());

        int topStudents = 0;
        int excellentStudents = 0;
        int goodStudents = 0;
        int failStudents = 0;
        double totalGrades = 0;

        for (int i = 0; i < students; i++) {
            double grade = Double.parseDouble(scanner.nextLine());
            totalGrades += grade;

            if (grade >= 5.00) {
                topStudents++;
            } else if (grade >= 4.00) {
                excellentStudents++;
            } else if (grade >= 3.00) {
                goodStudents++;
            } else {
                failStudents++;
            }
        }

        double topStudentsPercentage = (topStudents * 100.0) / students;
        double excellentStudentsPercentage = (excellentStudents * 100.0) / students;
        double goodStudentsPercentage = (goodStudents * 100.0) / students;
        double failStudentsPercentage = (failStudents * 100.0) / students;
        double averageGrade = totalGrades / students;

        System.out.printf("Top students: %.2f%%\n", topStudentsPercentage);
        System.out.printf("Between 4.00 and 4.99: %.2f%%\n", excellentStudentsPercentage);
        System.out.printf("Between 3.00 and 3.99: %.2f%%\n", goodStudentsPercentage);
        System.out.printf("Fail: %.2f%%\n", failStudentsPercentage);
        System.out.printf("Average: %.2f", averageGrade);
    }
}
