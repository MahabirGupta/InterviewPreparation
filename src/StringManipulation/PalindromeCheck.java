package StringManipulation;

//Example: Check if a String is a Palindrome
public class PalindromeCheck {
    public static void main(String[] args) {
        String word = "madam";
        boolean isPalindrome = isPalindrome(word);
        System.out.println("Is palindrome: " + isPalindrome);
        word = "dog";
        isPalindrome = isPalindrome(word);
        System.out.println("Is palindrome: " + isPalindrome);
    }

    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
