package Arrays;

import java.util.Scanner;

public class Code1 {

    public static void main(String[] args) {

        // Declare variable
        int num;

        // Scanner object
        Scanner scan = new Scanner(System.in);

        // Take user input
        System.out.println("Enter the number of elements in array");
        num = scan.nextInt();

        // create and initialize array
        int[] arr = new int[num];

        // for loop to take array elements from userinput
        System.out.println("Enter the number of elements ");
        for (int i = 0; i < num; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println("Array elements are:");
        for (int nums : arr) {
            System.out.print(nums + " ");
        }

        scan.close();
    }
}
