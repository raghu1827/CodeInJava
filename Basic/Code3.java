package Basic;

import java.util.Scanner;

//Java Program to Check Whether a Number is Positive or Negative

public class Code3 {
    
    public static void main(String[] args) {
        
        //Declare variable
        int n;

        //Scanner object
        Scanner scan = new Scanner(System.in);

        //Take user input
        System.out.print("Enter the number you want to check:");
        n = scan.nextInt();

        //Logic
        
        //checking n is postive or not
        if(n > 0)
        {
            System.out.println("The given number "+n+" is Positive");
        }

        //checking n is negative or not
        else if(n < 0)
        {
            System.out.println("The given number "+n+" is Negative");
        }
        else
        {
            System.out.println("The given number "+n+" is neither Positive nor Negative ");
        }

        //closing scan
        scan.close();
    }
}
