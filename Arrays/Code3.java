package Arrays;

public class Code3 {

    public static void main(String[] args) {

        // Initialize array
        int[] arr = { 1, 2, 3, 4, 5 };

        // Initialize variable
        int sum = 0;

        // iterate over array elements
        for (int num : arr) {
            sum += num;
        }

        System.out.println("sum of the array elements are: " + sum);
    }
}
