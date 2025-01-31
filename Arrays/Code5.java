package Arrays;

//Java program to check if array elements is sorted or not
public class Code5 {
    public static void main(String[] args) {

        // Initialize array
        int[] arr = { 1, 6, 3, 4, 5 };

        // Declare and initialize variable
        boolean isSorted = true;

        for (int i = 0; i < arr.length - 1; i++) {

            // checking prev element is greater than curr element
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }

        // checking is array sorted or not
        if (isSorted) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }
}
