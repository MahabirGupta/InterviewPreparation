package LambdaExpressions.demos;

//interface Predicate<Type>{
//    public abstract boolean test(Type t); // the test() method will take one parameter as the argument of any type and return a boolean
//}

import java.util.function.Predicate; //pre-defined functionalinterface

public class Main {

    public static void main(String[] args) {
//        Ex1: check if the number is greater than 10
        Predicate<Integer> predicate = (i) -> (i>10);
        System.out.println(predicate.test(12));
//        predicate.test(10);
        System.out.println(predicate.test(2));
////        Ex2: check if the length of the given string is greater than 4
        Predicate<String> predicate1 = (string) -> (string.length() > 4);
        System.out.println(predicate1.test("Anish"));
//        predicate1.test("Anish");
        System.out.println(predicate1.test("Boy"));

    }
}
