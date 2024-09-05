package RecursionAlgorithms;

import java.lang.*;
import java.io.*;
import java.util.*;

public class StringPermutation
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");

        String sampleInput;
        sampleInput = sc.next();

        // Convert String to List of Characters
        char[] charArray = sampleInput.toCharArray();  // Convert String to char array
        ArrayList<Character> characterList = new ArrayList<>();  // Initialize ArrayList

        // Add characters to ArrayList
        for(char c : charArray) {
            characterList.add(c);
        }

        // Generate permutations of the characters
        ArrayList<String> permutations = new ArrayList<>();
        permute(characterList, 0, permutations);

        // Print all permutations
        for(String permutation : permutations) {
            System.out.println(permutation);
        }
    }

    // Helper method to generate permutations
    public static void permute(ArrayList<Character> chars, int start, ArrayList<String> result) {
        if (start == chars.size() - 1) {
            // Convert list of characters to string
            StringBuilder sb = new StringBuilder();
            for (Character c : chars) {
                sb.append(c);
            }
            result.add(sb.toString());
        } else {
            for (int i = start; i < chars.size(); i++) {
                Collections.swap(chars, i, start); // Swap characters
                permute(chars, start + 1, result);  // Recursively generate permutations
                Collections.swap(chars, i, start); // Backtrack
            }
        }
    }
}

