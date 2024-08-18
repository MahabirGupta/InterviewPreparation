package SearchingAlgorithms;

public class LinearSearch {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4};
      int found = linearSearch(arr,2);
        System.out.println(found);
        found = linearSearch(arr,5);
        System.out.println(found);


    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1; // Element not found
    }

}
