package Loops;

import java.util.Scanner;

//Print the factorial of a number using a for loop.

public class Code7 {
    public static void main(String[] args) {

        // Declare variable
        int num;
        int fact = 1;

        // Scanner object
        Scanner scan = new Scanner(System.in);

        // Take user input
        System.out.println("Enter the number");
        num = scan.nextInt();

        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("factorial of number: " + fact);

        scan.close();
    }
}
