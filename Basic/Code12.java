package Basic;

import java.util.Scanner;

//Java Program to Increment by 1 to all the Digits of a Given Integer


public class Code12 {
    
    public static void main(String[] args) {
        
        //Declare variable
        int n,m=0,a;

        //Scanner object
        Scanner scan=new Scanner(System.in);

        //Take user input
        System.out.println("Enter any number");
        n=scan.nextInt();

        //Logic
        while(n>0){

            //extracting last digit
            a=n%10;
            a++;
            m=m*10+a;

          //Removing last digit
            n=n/10;
        }

        //Assigning m value to n
        n=m;
        m=0;

        while(n>0){
            //extracting last digit
            a=n%10;
            m=m*10+a;

            //Removing last digit
            n=n/10;
        }

        //printing value of m
        System.out.println("Result: "+m);

        //closing scan
        scan.close();
    }
}
