package ForLoopLab;

import java.util.Scanner;

public class J05CharacterSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        for (int symbol = 0; symbol < text.length(); symbol++) {
            char letter = text.charAt(symbol);
            System.out.println(letter);
        }
    }
}
