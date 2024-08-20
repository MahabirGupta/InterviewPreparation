package StringManipulation;

public class ArraySearchingBinarySearch {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 5, 5, 6, 9};
        int target = 5;
        int index = binarySearch(numbers, target);
        if (index == -1){
            System.out.println("Target not found");
        }else {
            System.out.println("Target found at index: " + index);
        }
        target = 3;
        index = binarySearch(numbers, target);
        if (index == -1){
            System.out.println("Target not found");
        }else {
            System.out.println("Target found at index: " + index);
        }
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Target not found
    }
}
