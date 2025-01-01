
package Basic;
//Java Program to Check Whether a Given Number is Even or Odd

import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        
        //Declaring variable
        int n;

        //creating Scanner Object 
        Scanner scan=new Scanner(System.in);

        //Taking user input
        System.out.println("Enter the number");
        n=scan.nextInt();

        //Logic
        //to check whether number is even or odd
        if(n%2==0){
            System.out.println("The given number "+n+" is Even");
        }else{
            System.out.println("The given number "+n+" is Odd");
        }

        //closing scanner object
        scan.close();
    }
}
