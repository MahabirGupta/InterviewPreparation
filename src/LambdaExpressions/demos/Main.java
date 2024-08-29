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

        System.out.println();

//        Ex3: check if the array of the given string is greater than 4
        String[] array = {"Apple","Boy","Car"};
        for (int i = 0; i <array.length ; i++) {

            Predicate<String> predicate2 = (string) -> (string.length() > 4);
            System.out.println(predicate2.test(array[i]));

        }
        System.out.println();
        //        Ex4: print array elements whose size is  greater than 4 in the given array
        String names[] = {"David","Scott","Smith","John","Mary"};
        for (int i = 0; i <names.length ; i++) {

            Predicate<String> predicate2 = (string) -> (string.length() > 4);
//            System.out.println(predicate2.test(names[i]));
            if ((predicate2.test(names[i]))){
                System.out.println(names[i]);
            }

        }
        System.out.println();
//        using for-each loop
        for (String name:names){
            Predicate<String> predicate2 = (string) -> (string.length() > 4);
            if (predicate2.test(name)){
                System.out.println(name);
            }
        }

    }
}
