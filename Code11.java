package Basic;
// Java Program to Increment by 1 to all the Digits of a Given Integer

import java.util.Scanner;

public class Code11 {
    public static void main(String[] args) {
        
        //Declare variables
        int n,m=0,a;

        //Scanner object
        Scanner scan=new Scanner(System.in);

        //Taking user input
        System.out.println("Enter any numbers");
        n=scan.nextInt();

        //Logic
        //First while loop
        //Extract each digit from right to left
        while (n>0) {

            //Extracts the last digit of n
            a=n%10;

            //increments the digit
            a++;

            //Appends the incremented digit (a) to m in reverse order
            m=m*10+a;

            //removes the last digit of n
            n=n/10;
        }

        //Assigns the value of m back to n which is reversed incremented digits
        n=m;

        //resets m to 0 for reconstructing 
        //the final number in the correct order
        m=0;

        //Second while loop
        //Reversing the result
        while(n>0){

            //Extract the last digit of n
            a=n%10;

            //Append the digit to m
            m=m*10+a;

           //removes the last digit of n
           n=n/10;
        }

        //printing m value
        System.out.println("Result: "+m);

        //closing scan object
        scan.close();
    }
}
