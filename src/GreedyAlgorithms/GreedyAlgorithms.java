package GreedyAlgorithms;

import java.util.Arrays;

public class GreedyAlgorithms {

    public static void main(String[] args) {

        int[] coins = new int[5];
        coins = new int[]{2, 4, 6};
        int num = coinChange(coins,2);
        System.out.println(num);

    }

    // Example: Coin Change Problem (Greedy)
   public static int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int count = 0;
        for (int i = coins.length - 1; i >= 0; i--) {
            while (amount >= coins[i]) {
                amount -= coins[i];
                count++;
            }
        }
        return count;
    }

}
