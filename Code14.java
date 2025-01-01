package Basic;
//Java program to print multiplication table

import java.util.Scanner;

public class Code14 {
    
    public static void main(String[] args) {
        
        //Declare variable
        int n;

        //Create Scanner object
        Scanner scan =new Scanner(System.in);

        //Take user input
        System.out.println("Enter the number");
        n=scan.nextInt();

        //displaying which multiplication table
        System.out.println("Multiplication Table of "+n);
        
        //Logic
        for(int i=1;i<=10;i++){
            System.out.println(n+" * "+i+" = "+n*i);
        }

        //closing scan object
        scan.close();
    }
}
