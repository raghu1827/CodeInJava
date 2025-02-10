package Basic;

import java.util.Scanner;

//Java Program to Find the Sum of Even and Odd Numbers

public class Code2 {
    public static void main(String[] args) {
        
        //Declare variable
        int n, sumE = 0, sumO = 0;

        //scanner object
        Scanner scan = new Scanner(System.in);

        //Take user input
        System.out.print("Enter the number of elements in array:");
        n = scan.nextInt();

        //Create and Initialize array  
        int[] a = new int[n];

        //Take user input for array elements 
        System.out.println("Enter the elements of the array:");

        //first for loop for number of elements from user
        for(int i = 0; i < n; i++)
        {
            a[i] = scan.nextInt();
        }

        //Logic
        for(int i = 0; i < n; i++)
        {
            //checking array element even or od 
            if(a[i] % 2 == 0)
            {
                //sum even element here
                sumE = sumE + a[i];
            }
            else
            {
                //sum odd element here
                sumO = sumO + a[i];
            }
        }

        //Printing two sum values of even and odd
        System.out.println("Sum of Even Numbers:"+sumE);

        System.out.println("Sum of Odd Numbers:"+sumO);

        //closing scan
        scan.close();
    }
}
