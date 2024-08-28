package LambdaExpressions.demos;

//create a functional interface
@FunctionalInterface
interface Cab1{

//    create an abstract method
    public void bookCab(String source,String destination);
}

class Gojek implements Cab1{


//    @Override
    public void bookCab(String source, String destination) {

        System.out.println("Gojek cab is booked from " + source + " to " + destination);

    }


}
public class Test1 {

    public static void main(String[] args) {
        Cab1 gojek = new Gojek();
        gojek.bookCab("Farrer Park","Potong Pasir");

        Cab1 gojek1 = ( source,  destination) -> System.out.println("Gojek cab is booked from " + source + " to " + destination);
        gojek1.bookCab("Depot Road","Harbour Front");
    }
}
