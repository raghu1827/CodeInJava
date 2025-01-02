package Basic;

import java.util.Scanner;

//Java Program to Perform Arithmetic Operations

public class Code13 {
    public static void main(String[] args) {
        
        //Declare variable
        int m,n,opt,add,sub,mul;
        double div;

        //Scanner object
        @SuppressWarnings("resource")
        Scanner scan=new Scanner(System.in);

        //Take user input
        System.out.println("Enter first number");
        m=scan.nextInt();
        System.out.println("Enter second number");
        n=scan.nextInt();

        //Logic
        while(true){
            System.out.println("Enter 1 for addition");

            System.out.println("Enter 2 for subtraction");

            System.out.println("Enter 3 for multiplication");

            System.out.println("Enter 4 for division");

            System.out.println("Enter 5 to Exit");

            //take user input for opt
            opt = scan.nextInt();

            //switch statement
            switch(opt)
            {
                case 1:
                add = m + n;
                System.out.println("Result:"+add);
                break;

                case 2:
                sub = m - n;
                System.out.println("Result:"+sub);
                break; 

                case 3:
                mul = m * n;
                System.out.println("Result:"+mul);
                break;

                case 4:
                div = (double)m / n;
                System.out.println("Result:"+div);
                break;    

                case 5:
                System.exit(0);
            }
        }
    }
}
