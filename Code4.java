package Basic;
//Java Program to Swap two numbers in java using temporary variable

import java.util.Scanner;

public class Code4 {
    public static void main(String[] args) {
        
        //Declare variables
        int m,n,temp=0;

        //Scanner object
        Scanner scan=new Scanner(System.in);

        //Taking user input
        System.out.println("Enter the first number");
        m=scan.nextInt();
        System.out.println("Enter the second number");
        n=scan.nextInt();

        //Logic
        //swaping two number using temp
        temp=m;
        m=n;
        n=temp;

        //printing values
        System.out.println("After swaping");
        System.out.println("M value: "+m);
        System.out.println("N value: "+n);

        //closing scanner object
        scan.close();
    }
}
