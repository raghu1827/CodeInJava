package Basic;
//Java Program to Check Whether a Number is Positive or Negative

import java.util.Scanner;

public class Code2 {

    public static void main(String[] args) {
        
        //Declare variable
        int n;

        //Scanner object
        Scanner scan=new Scanner(System.in);

        //Taking user input
        System.out.println("Enter the number you want to check");
        n=scan.nextInt();

        //Logic
        //to check given number is positive or negative
        if(n>0){
            System.out.println("The given number "+n+" is positive");
        }else if(n<0){
            System.out.println("The given number "+" is Negative");
        }else{
            System.out.println("The given number "+n+" is neither positive nor negative");
        }

        scan.close();
    }
}