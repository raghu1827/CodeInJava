package Basic;

//Java Program to Check Whether a Given Number is Even or Odd

import java.util.Scanner;

public class Code1 {
    public static void main(String[] args) {
        
        //Declare variable
        int n;

        //Scanner object
        Scanner scan=new Scanner(System.in);

        //Take user input
        System.out.println("Enter the number");
        n=scan.nextInt();

        //Logic
        if(n%2==0){
            System.out.println("The given number "+n+" is Even");
        }
        else{
            System.out.println("The given number "+n+" is Odd");
        }

        //close scan
        scan.close();
    }
}
