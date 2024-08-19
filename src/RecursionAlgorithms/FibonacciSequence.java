package RecursionAlgorithms;

public class FibonacciSequence {

    public static void main(String[] args) {
       int num = fibonacci(12);
        System.out.println(num);

    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        return (fibonacci(n - 1) + fibonacci(n - 2));
    }

}
