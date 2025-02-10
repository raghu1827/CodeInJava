package Basic;

//Swap Two Numbers in Java using Temporary Variable

import java.util.Scanner;

public class Code5 {
   
    public static void main(String[] args) {
        
        //Declare variable
        int m,n, temp;

        //Scanner object
        Scanner scan=new Scanner(System.in);

        //Take user input
        System.out.println("Enter first number");
        m=scan.nextInt();
        System.out.println("Enter the second number");
        n=scan.nextInt();

        //Logic
        temp=m;
        m=n;
        n=temp;

        //printing two values after swapping
        System.out.println("First number: "+m);
        System.out.println("Second number: "+n);

        //closing scan
        scan.close();
    }
}
