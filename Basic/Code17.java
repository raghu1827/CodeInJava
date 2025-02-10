package Basic;

import java.util.Scanner;

//Java Program to Check Whether a Given Alphabets are Uppercase or Lowercase or Digits

public class Code17 {
    
    public static void main(String[] args) {
        
        //Declare variable
        char m;

        //Scanner object
        Scanner scan=new Scanner(System.in);

        //Take user input
        System.out.println("Enter any alphabet");
        m=scan.next().charAt(0);

        //Logic
        if(m >= 97 && m <= 123)
        {
            System.out.println("Lower Case");
        }
        else if(m >= 65 && m <= 96)
        {
            System.out.println("Upper Case");
        }
        else if(m >= 48 && m <= 57)
        {
            System.out.println("Digit");
        }

        //closing scan
        scan.close();
    }
}
