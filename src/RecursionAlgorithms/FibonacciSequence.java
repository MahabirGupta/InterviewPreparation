package RecursionAlgorithms;

public class FibonacciSequence {

    public static void main(String[] args) {
       int num = fibonacci(3);
        System.out.println(num);

        int[] memo = new int[6]; //declaring size of array
        int memoization = fibonacci(5,memo);
        System.out.println(memoization);


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
//        0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
        return (fibonacci(n - 1) + fibonacci(n - 2));
    }

    public static int fibonacci(int n, int[] memo) {
        if (n <= 1) {
            return n;
        }
        if (memo[n] == 0) {
            memo[n] = fibonacci(n - 1, memo) + fibonacci(n - 2, memo);
        }
        return memo[n];
    }


}
