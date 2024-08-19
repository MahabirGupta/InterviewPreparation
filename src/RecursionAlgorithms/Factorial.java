package RecursionAlgorithms;

public class Factorial {

    public static void main(String[] args) {

        int ans = factorial(3);
        System.out.println(ans);

    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }

        return n * factorial(n - 1);
    }

}
