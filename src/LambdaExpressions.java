import java.util.function.BiFunction;
import java.util.function.Consumer;

public class LambdaExpressions {

    public static void main(String[] args) {

//        1. No Parameters
        Runnable runnable = () -> System.out.println("Hello, Lambda!");
        runnable.run();  // Output: Hello, Lambda!

//        2. One Parameter
        Consumer<String> consumer = (s) -> System.out.println(s);
        consumer.accept("Hello, World!");  // Output: Hello, World!

//        If there's a single parameter, you can omit the parentheses:
        Consumer<String> consumer1 = s -> System.out.println(s);
        consumer1.accept("Hello, World Single Parameter!");  // Output: Hello, World!

//        3. Multiple Parameters
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        int sum = add.apply(5, 3);  // sum is 8
        System.out.println("Sum = " + sum);

//        4. Multiple Statements
        BiFunction<Integer, Integer, Integer> multiply = (a, b) -> {
            int result = a * b;
            return result;
        };
        int product = multiply.apply(5, 3);  // product is 15
        System.out.println("Product = " + product);

//        Functional Interfaces with Lambda Expressions
//Let's consider a custom functional interface:
        @FunctionalInterface
        interface GreetingService {
            void sayMessage(String message);
        }
//You can implement this interface using a lambda expression:
        GreetingService greet = message -> System.out.println("Hello, " + message);
        greet.sayMessage("Mahabir");  // Output: Hello, Mahabir


//





    }
}
