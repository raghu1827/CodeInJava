package Basic;

import java.util.Scanner;

// Java Program to Check if Two Numbers are Equal

public class Code8 {
    public static void main(String[] args) {
        //Declare variable
        int m,n;

        //scanner object
        Scanner scan=new Scanner(System.in);

        //Take user input
        System.out.println("Enter the first number");
        m=scan.nextInt();
        System.out.println("Enter second number");
        n=scan.nextInt();

        //Logic
        if(m==n){
            System.out.println(m+" and "+n+" are equal");
        }else{
            System.out.println(m+" and "+n+" are not equal");
        }

        //closing scan
        scan.close();
    }   
}
