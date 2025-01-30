package Arrays;

//Write a Java program to find the maximum number in a given array.

public class Code2 {

    public static void main(String[] args) {

        // initialize array
        int[] arr = { 27, 45, 7, 86, 20 };

        // Declare new Variable and assign array elements using index value
        int max = arr[0];

        // loop to iterate array elements
        for (int num : arr) {

            // Checking is current element num is greater than max element
            if (num > max) {
                max = num;
            }
        }
        System.out.println("The largest element is: " + max);
    }
}
