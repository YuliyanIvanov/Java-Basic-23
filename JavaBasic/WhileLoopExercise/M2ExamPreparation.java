package WhileLoopExercise;

import java.util.Scanner;

public class M2ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int badGradesLimit = Integer.parseInt(scanner.nextLine());

        int badGradesCount = 0;
        double totalScore = 0;
        int problemsSolved = 0;
        String lastProblem = "";

        while (badGradesCount < badGradesLimit) {
            String problemName = scanner.nextLine();
            if (problemName.equals("Enough")) {
                break;
            }
            int grade = Integer.parseInt(scanner.nextLine());

            totalScore += grade;
            problemsSolved++;
            lastProblem = problemName;

            if (grade <= 4) {
                badGradesCount++;
            }
        }

        if (badGradesCount == badGradesLimit) {
            System.out.printf("You need a break, %d poor grades.%n",
                    badGradesCount);
        } else {
            double averageScore = totalScore / problemsSolved;
            System.out.printf("Average score: %.2f%n", averageScore);
            System.out.printf("Number of problems: %d%n", problemsSolved);
            System.out.printf("Last problem: %s%n", lastProblem);
        }
    }
}
