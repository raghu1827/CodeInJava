package Basic;

import java.util.Scanner;

//Java Program to Print Multiplication Table

public class Code15 {
    public static void main(String[] args) 
    {
        //Scanner object
        Scanner scan = new Scanner(System.in);
        
        //Take user input
        System.out.println("Enter number");        
        int n=scan.nextInt();

        //Logic
        for(int i=1; i <= 10; i++)
        {
            System.out.println(n+" * "+i+" = "+n*i);
        }

        //closing scan
        scan.close();
    }
}
