package LambdaExpressions.functionFunctionalInterface;

import java.util.function.Function;

//interface Function<String,Integer>{
//    public abstract int apply(); //apply method returns any data type
//}
public class Main {

    public static void main(String[] args) {
        Function<Integer,Integer> function = i -> i*i;
        System.out.println(function.apply(5));
        System.out.println(function.apply(52));
        System.out.println(function.apply(3));
        System.out.println(function.apply(4));
//        function.apply(5);
        Function<String,Integer> stringIntegerFunction = string -> string.length();
        System.out.println("The length of the string "  + " is " + stringIntegerFunction.apply("Anish"));
        System.out.println("The length of the string "  + " is " + stringIntegerFunction.apply("Anishkaa"));
        System.out.println("The length of the string "  + " is " + stringIntegerFunction.apply("Gaytri"));
//        stringIntegerFunction.apply("Anish");
    }
}
