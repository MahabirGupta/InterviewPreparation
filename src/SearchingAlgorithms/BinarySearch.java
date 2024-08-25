package SearchingAlgorithms;

public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int found = binarySearch(arr,2);
        System.out.println(found);
        found = binarySearch(arr,7);
        System.out.println(found);

        found = binarySearch1(arr,4);
        System.out.println(found);



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
        return -1; // Element not found
    }

    // Example: Binary Search
   public static int binarySearch1(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }


}
