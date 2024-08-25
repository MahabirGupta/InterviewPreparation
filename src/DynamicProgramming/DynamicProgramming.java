package DynamicProgramming;

public class DynamicProgramming {

    public static void main(String[] args) {

        int dp = fibonacci(5);
        System.out.println(dp);

    }

    // Example: Fibonacci with DP
   public static int fibonacci(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

}
