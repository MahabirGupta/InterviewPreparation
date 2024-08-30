package LambdaExpressions.consumerFunctionalInterface;

import java.util.function.Consumer;

//Consumer chaining
public class Demo2 {

    public static void main(String[] args) {
        Consumer<String> consumer = string -> System.out.println(string + " is smart");
        Consumer<String> consumer1 = string -> System.out.println(string + " has long legs");
        Consumer<String> consumer2 = string -> System.out.println(string + " is handsome");


//        consumer.accept("Mahabir");
//        consumer1.accept("Mahabir");
//        consumer2.accept("Mahabir");
//        or
        consumer.andThen(consumer1).andThen(consumer2).accept("Mahabir");
//        or
        Consumer<String> consumer3 = consumer.andThen(consumer1).andThen(consumer2);
        consumer3.accept("Anish");
    }
}
