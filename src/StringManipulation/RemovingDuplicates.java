package StringManipulation;

import java.util.HashSet;
import java.util.Set;

public class RemovingDuplicates {

    public static void main(String[] args) {
        String original = "hello";
        String result = removeDuplicates(original);
        System.out.println("String without duplicates: " + result);
    }

    public static String removeDuplicates(String str) {
        Set<Character> seen = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (!seen.contains(c)) {
                seen.add(c);
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
