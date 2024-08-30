package LambdaExpressions.consumerFunctionalInterface;

import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        Consumer<String> consumer = string -> System.out.println(string);
        consumer.accept("Mahabir");
    }
}
