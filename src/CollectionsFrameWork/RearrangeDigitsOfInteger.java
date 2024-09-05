package CollectionsFrameWork;

import java.util.Arrays;
import java.util.Collections;

public class RearrangeDigitsOfInteger {
    public static void main(String[] args) {
        int number = 2439;

        // Step 1: Convert the number to a string to extract each digit
        String numberStr = Integer.toString(number);

        // Step 2: Convert the string to a character array (digits)
        Character[] digits = new Character[numberStr.length()];
        for (int i = 0; i < numberStr.length(); i++) {
            digits[i] = numberStr.charAt(i);
        }

        // Step 3: Sort the digits in descending order
        Arrays.sort(digits, Collections.reverseOrder());

        // Step 4: Convert the sorted character array back to a string
        StringBuilder greatestNumberStr = new StringBuilder();
        for (char digit : digits) {
            greatestNumberStr.append(digit);
        }

        // Step 5: Convert the string back to an integer
        int greatestNumber = Integer.parseInt(greatestNumberStr.toString());

        // Output the result
        System.out.println("The greatest possible number is: " + greatestNumber);
    }
}


