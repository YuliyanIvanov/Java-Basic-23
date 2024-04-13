package WhileLoopExercise;

import java.util.Scanner;

public class M05Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        if (!input.isEmpty()) {
            double change = Double.parseDouble(input);
            int coinCount = countCoins(change);
            System.out.println(coinCount);
        }
    }

    public static int countCoins(double change) {
        int[] coins = {200, 100, 50, 20, 10, 5, 2, 1};
        int coinCount = 0;
        int changeInCents = (int) (change * 100);
        
        for (int coin : coins) {
            coinCount += changeInCents / coin;
            changeInCents %= coin;
        }
        return coinCount;
    }
}