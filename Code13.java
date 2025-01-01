package Basic;

import java.util.Scanner;

//Java Program to Print Binary Equivalent of an Integer using Recursion

public class Code13 {
    
    //create method
    String binary(int x){
        if(x>0){
            int a=x%2;
            x=x/2;

            return a+" "+binary(x);
        }
        return "";
    }

    public static void main(String[] args) {
        
        //Declare variable
        int n;

        //Create Scanner object
        Scanner scan=new Scanner(System.in);

        //Take user input
        System.out.println("Enter the number");
        n=scan.nextInt();

        //Create class object
        Code13 c=new Code13();
        String m=c.binary(n);

        //print the return binary value
        System.out.println("Binary Equivalent: "+m);

        //close scan object
        scan.close();
    }
}
