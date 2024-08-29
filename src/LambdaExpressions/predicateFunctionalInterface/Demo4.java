package LambdaExpressions.predicateFunctionalInterface;

import java.util.function.Predicate;

//3 ways to join Predicates – and, or, negate(negation)
//predicate 1 -check if number is even
//predicate 2 -check number is greater than 50 or not
public class Demo4 {

    public static void main(String[] args) {

        int[] array = {5,15,25,30,35,40,45,50,55,60,65};
        Predicate<Integer> predicate = (i) -> ((i%2 == 0) && (i>50));
        for (int num:array) {
            if (predicate.test(num)){
                System.out.println(num + " is an even number and is greater than 50 ");
            }
        }
        System.out.println();
        Predicate<Integer> predicate1 = (i) -> (i%2 == 0);
        for (int num:array) {
            if (predicate1.test(num)){
                System.out.println(num + " is an even number  ");
            }
        }
        System.out.println();
        Predicate<Integer> predicate2 = (i) -> (i>50);
        for (int num:array) {
            if (predicate2.test(num)){
                System.out.println(num + " is greater than 50  ");
            }
        }
        System.out.println();
        for (int num:array) {
            if (predicate1.test(num) && predicate2.test(num)){
                System.out.println(num + " is an even number and is greater than 50 ");
            }
        }
        System.out.println();
        for (int num:array) {
//            using and operator on 2 predicates
            if (predicate1.and(predicate2).test(num)){
                System.out.println(num + " is an even number and is greater than 50 ");
            }
        }
        System.out.println();
        for (int num:array) {
//            using or operator on 2 predicates
            if (predicate1.or(predicate2).test(num)){
                System.out.println(num + " is an even number or is greater than 50 ");
            }
        }
        System.out.println();
        for (int num:array) {
//            using not operator on 2 predicates
            if (predicate1.negate().test(num)){
                System.out.println(num + " is not an even number  ");
            }
        }
    }
}
