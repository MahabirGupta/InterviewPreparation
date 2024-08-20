package StringManipulation;

public class ReverseString {

//    Example 1: Reversing a String
public static void main(String[] args) {
    String original = "hello";
    String reversed = reverseString(original);
    System.out.println("Reversed String: " + reversed);
}

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
