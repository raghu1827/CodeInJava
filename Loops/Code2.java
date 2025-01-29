package Loops;

import java.util.Scanner;

//Print all even numbers from 1 to 20 using a for loop.

public class Code2 {
    public static void main(String[] args) {

        // Declare varaible
        int num;

        // Scanner object
        Scanner scan = new Scanner(System.in);

        // taking user input
        System.out.println("Enter the number ");
        num = scan.nextInt();

        // iterate over 1 to num
        for (int i = 1; i <= num; i++) {

            // checking num is even or odd
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        scan.close();
    }
}
