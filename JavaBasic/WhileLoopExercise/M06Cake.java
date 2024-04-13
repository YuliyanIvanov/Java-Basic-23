package WhileLoopExercise;

import java.util.Scanner;

public class M06Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = scanner.nextInt();
        int length = scanner.nextInt();

        int cakeSize = width * length;
        int takenPieces = 0;

        while (true) {
            String input = scanner.next();
            if (input.equals("STOP")) {
                break;
            }
            int piecesTaken = Integer.parseInt(input);
            takenPieces += piecesTaken;
            if (takenPieces >= cakeSize) {
                System.out.printf("No more cake left! You need %d pieces more.",
                        takenPieces - cakeSize);
                return;
            }
        }

        int piecesLeft = cakeSize - takenPieces;
        System.out.printf("%d pieces are left.", piecesLeft);
    }
}
