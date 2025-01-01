package Basic;
//Java Program to Check if Two Numbers are Equal

import java.util.Scanner;

public class Code7 {
    public static void main(String[] args) {
        
        //Declare Variable
        int m,n;

        //Create Scanner object
        Scanner scan=new Scanner(System.in);

        //Taking user input
        System.out.println("Enter first number");
        m=scan.nextInt();
        System.out.println("Enter second number");
        n=scan.nextInt();

        //Logic
        //if two numbers are equal
        if(m==n){
            System.out.println(m+" and "+n+" are equal");
        }else{
            System.out.println(m+" and "+n+" are not equal");
        }

        //closing scanner object
        scan.close();
    }
}
