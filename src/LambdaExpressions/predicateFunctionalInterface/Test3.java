package LambdaExpressions.predicateFunctionalInterface;

@FunctionalInterface
interface Cab3{
    public String bookCab(String source,String destination);
}

class Ryde implements Cab3{

    @Override
    public String bookCab(String source, String destination) {
        System.out.println("Gojek cab is booked from " + source + " to " + destination);
        return "Price: $6.50";
    }
}

public class Test3 {

    public static void main(String[] args) {
        Cab3 ryde = (source, destination) -> {
            System.out.println("Gojek cab is booked from " + source + " to " + destination);
            return "Price: $6.50";
        };
        System.out.println(ryde.bookCab("Toa Payoh","Clementi"));
//        ryde.bookCab("Toa Payoh","Clementi");
    }
}
