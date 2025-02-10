package Basic;

import java.util.Scanner;

//Java Program to Find the Largest Number Among Three Numbers

public class Code4 {
    public static void main(String[] args) {
        
        //Declare variable
        int x, y, z;
        
        //Scanner object
        Scanner scan=new Scanner(System.in);

        //Take user input
        System.out.print("Enter the first number:");
        x = scan.nextInt();

        System.out.print("Enter the second number:");
        y = scan.nextInt();

        System.out.print("Enter the third number:");
        z = scan.nextInt();

        //Logic
        if(x > y && x > z)
        {
            System.out.println("Largest number is:"+x);
        }
        else if(y > z)
        {
            System.out.println("Largest number is:"+y);
        }
        else
        {
            System.out.println("Largest number is:"+z);
        }

        //closing scan
        scan.close();
    }
}
