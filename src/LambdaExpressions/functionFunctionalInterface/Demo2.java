package LambdaExpressions.functionFunctionalInterface;

import java.util.function.Function;

//2 ways to chain Function functional interface
//andThen()
//compose()
public class Demo2 {

    public static void main(String[] args) {
        Function<Integer,Integer> function = n -> n*2;
        Function<Integer,Integer> function1 = n -> n*n*n;
        System.out.println(function.andThen(function1).apply(2)); //function(2) will be excuted first 2*2=4 then function1(4) will be executed so 4*4*4=64
//        function.andThen(function1).apply(2);
        System.out.println(function.compose(function1).apply(2)); //function1(2) will be excuted first 2*2*2=8 then function(8) will be executed so 8*2=16

    }
}
