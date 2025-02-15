package Numbers;

/*
If we list all the natural numbers below 10 that are multiples of 3 or 5, 
we get 3, 5, 6, and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.

METHOD 2:Using array
*/

import java.util.Scanner;

public class Code1 {
    public static void main(String[] args) {
        int sum = 0;
        int n;

        // Scanner object
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number");
        n = scan.nextInt();
        int[] multiples = new int[n]; // Array to store the multiples
        int index = 0;

        // Loop through numbers below 10
        for (int i = 1; i < n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                multiples[index] = i; // Store the multiple in the array
                index++; // Increment the index
            }
        }

        // Sum the multiples stored in the array
        for (int i = 0; i < index; i++) {
            sum += multiples[i]; // Add the value to the sum
        }

        System.out.println("Sum of multiples of 3 or 5 below 10: " + sum);
        scan.close();
    }
}
