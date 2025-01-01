package Basic;
//Java Program to Find the Number of Integers Divisible by 5

import java.util.Scanner;

public class Code6 {
    public static void main(String[] args) {
        
        //Declare variable
        int n;

        //Scanner object
        Scanner scan=new Scanner(System.in);

        //Taking user input
        System.out.println("Enter the number");
        n=scan.nextInt();

        //Logic
        if(n%5==0){
            System.out.println(n+" is divisible by 5");
        }else{
            System.out.println(n+" is not divisible by 5");
        }

        //closing scanner object
        scan.close();
    }
}
