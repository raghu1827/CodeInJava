package Arrays;

//Write a Java program to count even and odd numbers in an array.

public class Code4 {
    public static void main(String[] args) {

        // Initialize array
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        // Initialize variable
        int evenCount = 0, oddCount = 0;

        // Iterate over array elements
        for (int num : arr) {

            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd number: " + oddCount);
    }
}
