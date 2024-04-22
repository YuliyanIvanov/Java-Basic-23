package WhileLoopExercise;

import java.util.Scanner;

public class M07Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int freeSpaceVolume = width * length * height;

        int totalBoxesVolume = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Done")) {
                break;
            }
            int boxesCount = Integer.parseInt(input);
            totalBoxesVolume += boxesCount;
            if (totalBoxesVolume >= freeSpaceVolume) {
                System.out.printf("No more free space! You need %d Cubic meters more.",
                        totalBoxesVolume - freeSpaceVolume);
                return;
            }
        }

        int leftSpace = freeSpaceVolume - totalBoxesVolume;

        System.out.printf("%d Cubic meters left.", leftSpace);
    }
}
