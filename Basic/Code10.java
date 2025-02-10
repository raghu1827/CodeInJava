package Basic;

import java.util.Scanner;

//Java Program to Find Sum of Digits of a Number using Recursion

public class Code10 {

    //Declare variable
    int sum=0;

    //Method to add
    int add(int n){

        sum=n%10;

        if(n==0){
            return 0;
        }else{
            return sum+add(n/10);
        }
    }
    public static void main(String[] args) {
        
        //Declare variable
        int n;

        //Scanner object
        Scanner scan=new Scanner(System.in);

        //Take user input
        System.out.println("Enter the number");
        n=scan.nextInt();

        //Creating class object
        Code10 c=new Code10();
        
        //calling add method using object reference
        int a=c.add(n);

        //printing value
        System.out.println("Sum: "+a);

        //closing scan
        scan.close();
    }
}
