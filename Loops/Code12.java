package Loops;

import java.util.Scanner;

public class Code12 {

    public static void main(String[] args) {

        // Declare variable
        int num;

        // Scanner object
        Scanner scan = new Scanner(System.in);

        // Take user input
        System.out.println("Enter the digit");
        num = scan.nextInt();

        // Take the absolute value of the number in case it's negative
        num = Math.abs(num);

        // intitlize variable
        int count = 0;
        for (int i = num; i > 0; i /= 10) {
            count++;
        }

        if (num == 0) {
            count = 1;
        }
        System.out.println("The number of digit is: " + count);

        scan.close();
    }
}
