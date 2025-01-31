package Arrays;

import java.util.Arrays;

public class Code6 {

    public static void main(String[] args) {

        // Create and initialize array elements
        int[] arr = { 1, 2, 2, 3, 4, 9, 6, 7, 5, 4 };

        // Sort the array elements
        Arrays.sort(arr);

        // Create a new array to store unique elements
        int[] temp = new int[arr.length];

        // Initialize variable to track the position in the temp array
        int j = 0;

        // Iterate over elements one by one
        for (int i = 0; i < arr.length - 1; i++) {
            // Check if previous element and current element are not equal
            if (arr[i] != arr[i + 1]) {
                temp[j] = arr[i]; // Add the unique element to the temp array
                j++;
            }
        }

        // Storing the last element (it's guaranteed to be unique or different from
        // previous element)
        temp[j] = arr[arr.length - 1];
        j++;

        // Print all unique elements
        for (int i = 0; i < j; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
