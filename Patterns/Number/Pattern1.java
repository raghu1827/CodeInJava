package Patterns.Number;

/*
Pattern 

1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
1 2 3 4 5 6 7

 */

import java.util.Scanner;

public class Pattern1 {

    public static void main(String[] args) {

        int num;

        // Scanner object
        Scanner scan = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter the number");
        num = scan.nextInt();

        System.out.println("Pattern");
        // Logic
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        scan.close();
    }
}