package Basic;

import java.util.Scanner;

//Java Program to Find the Number of Integers Divisible by 5

public class Code7 {
    
    public static void main(String[] args) {
        
        //Declare variable
        int n;

        //Scanner object
        Scanner scan=new Scanner(System.in);

        //Take user input
        System.out.println("Enter any number");
        n=scan.nextInt();

        //Logic
        if(n%5==0){
            System.out.println(n+" is divisible by 5");
        }else{
            System.out.println(n+" is not divisible by 5");
        }

        //closing scan
        scan.close();
    }
}
