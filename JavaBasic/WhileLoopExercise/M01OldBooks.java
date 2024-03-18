package WhileLoopExercise;

import java.util.Scanner;

public class M01OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String keyBook = scanner.nextLine();

        int bookCount = 0;
        boolean isFound = false;

        String input = scanner.nextLine();
        while (!input.equals("No More Books")) {
            if (input.equals(keyBook)) {
                isFound = true;
                break;
            }
            bookCount++;
            input = scanner.nextLine();
        }

        if (isFound){
            System.out.printf("You checked %d books and found it.", bookCount);
        } else {
            System.out.print("The book you search is not here!\n");
            System.out.printf("You checked %d books.", bookCount);
        }
    }
}
