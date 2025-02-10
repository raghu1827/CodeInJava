package Loops;
//Print the first 10 multiples of 5 using a for loop.

import java.util.Scanner;

public class Code4 {
    public static void main(String[] args) {

        // Declare variable
        int num;

        // Scanner object
        Scanner scan = new Scanner(System.in);

        // Take user input
        System.out.println("Enter the number");
        num = scan.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.print(5 * i + " ");
        }
        scan.close();
    }
}
