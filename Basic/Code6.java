package Basic;

import java.util.Scanner;

//Swap Two Numbers in Java without using any Temporary Variable

public class Code6 {
 
    public static void main(String[] args) {
        
        //Declare variable
        int m,n;

        //scanner object
        Scanner scan=new Scanner(System.in);

        //Take user input
        System.out.println("Enter first number");
        m=scan.nextInt();
        System.out.println("Enter second number");
        n=scan.nextInt();

        //Logic
        m=m+n;
        n=m-n;
        m=m-n;

        //printing two values after swapping
        System.out.println("First number: "+m);
        System.out.println("Second number: "+n);

        //closing scan
        scan.close();
    }
}
