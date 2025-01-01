package Basic;
//Java Program to Extract Digits from a Given Number

import java.util.Scanner;

public class Code10 {
    public static void main(String[] args) {
        
        //Declare variable
        int n,m,a,counter=0;

        //Scanner object
        Scanner scan=new Scanner(System.in);

        //Taking user input
        System.out.println("Enter any number");
        n=scan.nextInt();

        //Assign n value to m
        m=n;

        //Logic
        // Counting the Digits 
        while(n>0){
            n=n/10;
            counter++;
        }

        //Extracting and Printing Digits 
        while(m>0){
            a=m%10;
            System.out.println("Digits at postion "+counter+":"+a);
            m=m/10;
            counter--;
        }

        //closing scan object
        scan.close();
    }
}
