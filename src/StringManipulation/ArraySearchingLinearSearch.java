package StringManipulation;

public class ArraySearchingLinearSearch {

    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 5, 6};
        int target = 9;
        int index = linearSearch(numbers, target);
        if (index  == -1){
            System.out.println("Target not found");
        }else {
            System.out.println("Target found at index: " + index);
        }
        target = 4;
        index = linearSearch(numbers, target);
        if (index  == -1){
            System.out.println("Target not found");
        }
        else {
            System.out.println("Target found at index: " + index);
        }
    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1; // Target not found
    }
}
