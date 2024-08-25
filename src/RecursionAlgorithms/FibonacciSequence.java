package RecursionAlgorithms;

public class FibonacciSequence {

    public static void main(String[] args) {
       int num = fibonacci(3);
        System.out.println(num);

        int[] memo = new int[6]; //declaring size of array
        int memoization = fibonacci(5,memo);
        System.out.println(memoization);

        int iterativeApproach = fibonacciIterativeApproach(7);
        System.out.println(iterativeApproach);

        int optimiseSpaceApproach = fibonacciOptimizedSpaceApproach(9);
        System.out.println(optimiseSpaceApproach);


    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
//F(0) = 0
//F(1) = 1
//F(2) = F(1) + F(0) = 1 + 0 = 1
//F(3) = F(2) + F(1) = 1 + 1 = 2
//F(4) = F(3) + F(2) = 2 + 1 = 3
//F(5) = F(4) + F(3) = 3 + 2 = 5
//F(6) = F(5) + F(4) = 5 + 3 = 8
//F(7) = F(6) + F(5) = 5 + 8 = 13
//        0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
        return (fibonacci(n - 1) + fibonacci(n - 2));
    }

//    Memoization (Top-Down Dynamic Programming)
    public static int fibonacci(int n, int[] memo) {
        if (n <= 1) {
            return n;
        }
        if (memo[n] == 0) {
            memo[n] = fibonacci(n - 1, memo) + fibonacci(n - 2, memo);
        }
        return memo[n];
    }

//    3. Iterative Approach (Bottom-Up Dynamic Programming)
    public static int fibonacciIterativeApproach(int n) {
        if (n <= 1) {
            return n;
        }
        int[] fib = new int[n + 1];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[n];
    }

//    Optimized Space Approach
public static int fibonacciOptimizedSpaceApproach(int n) {
    if (n <= 1) {
        return n;
    }
    int a = 0, b = 1;
    for (int i = 2; i <= n; i++) {
        int temp = b;
        b = a + b;
        a = temp;
    }
    return b;
}


}
