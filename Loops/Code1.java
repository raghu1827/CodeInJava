package Loops;

import java.util.Scanner;

//Write a Java program to print numbers from 1 to 10 using a for loop.

public class Code1 {

    public static void main(String[] args) {

        // Declare variable
        int num;

        // Scanner object
        Scanner scan = new Scanner(System.in);

        // user input
        System.out.println("Enter the number");
        num = scan.nextInt();

        // loop iterate from 1 to num
        for (int i = 1; i <= num; i++) {
            System.out.println("i: " + i);
        }

        scan.close();
    }
}
