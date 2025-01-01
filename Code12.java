package Basic;
//Java Program to Perform Arithmetic Operations

import java.util.Scanner;

public class Code12 {
    public static void main(String[] args) {
        
        //Declare varables
        int m,n,opt,add,sub,mul;
        double div;

        try (//Scanner object
        Scanner scan = new Scanner(System.in)) {
            //Take user input
            System.out.println("Enter first number");
            m=scan.nextInt();
            System.out.println("Enter second number");
            n=scan.nextInt();

            
            //Logic
            //selecting number for which operation to do in switch statement 
            while(true){

                System.out.println("Enter 1 for addtion");
                System.out.println("Enter 2 for subtraction");
                System.out.println("Enter 3 for multiplication");
                System.out.println("Enter 4 for division");
                System.out.println("Enter 5 Exit");

                //selecting number and opt variable will hold selected number
                System.out.println("Select the operations number");
                opt=scan.nextInt();

                //switch statement to do arithmetic operations
                switch(opt){

                    case 1:
                    add=m+n;
                    System.out.println("Result: "+add);
                    break;

                    case 2:
                    sub=m-n;
                    System.out.println("Result: "+sub);
                    break;

                    case 3:
                    mul=m*n;
                    System.out.println("Result: "+mul);
                    break;

                    case 4:
                    div=(double)m/n;
                    System.out.println("Result: "+div);
                    break;

                    case 5:
                    System.exit(0);
                }
            }
        }
    }
}
