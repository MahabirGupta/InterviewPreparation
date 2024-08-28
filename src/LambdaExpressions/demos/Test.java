package LambdaExpressions.demos;

//Create an interface
@FunctionalInterface
interface Cab{
//        create an abstract method
    public void bookCab();
        }

//        class Grab implements Cab{
//
//            @Override
//            public void bookCab() {
//
//                System.out.println("Grab cab is booked..");
//
//            }
////            using lambda expression
////            ()-> System.out.println("Grab cab is booked..");
//        }
public class Test {

    public static void main(String[] args) {

//        Grab grab = new Grab();
//        grab.bookCab();
//        using interface to create an object
//        Cab grab1 = new Grab();
//        grab1.bookCab();

//        calling the lambda expressions using functional interface
        Cab grab2 = ()-> System.out.println("Grab cab is booked..");
        grab2.bookCab();



    }
}
