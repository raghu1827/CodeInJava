package Basic;

//Java Program to Extract Digits from a Given Number

import java.util.Scanner;

public class Code11 {
    public static void main(String[] args) {
        
        //Declare variable
        int n,m,a,counter=0;

        //Scanner object
        Scanner scan=new Scanner(System.in);

        //Take user input
        System.out.println("Enter any number");
        n=scan.nextInt();

        //Logic
        //Here assign n value to m 
        m=n;

        //Checking n is zero or not
        while(n>0){

            // removing its last digit
            n=n/10;
            counter++;
        }

        //Checking m is zero or not
        while(m>0){

            //Extract Last Digit
            a=m%10;
            System.out.println("Digit at postion "+counter+":"+a);
           
            // removing its last digit
            m=m/10;
            counter--;
        }

        //closing scan
        scan.close();
    }    
}
