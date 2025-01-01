package Basic;
//Java Program to Find Sum of Digits of a Number using Recursion

import java.util.Scanner;

public class Code9 {

    //Declaring and Initilizing variable
    int sum=0;

    //creating method which return integer value
    int add(int n){

       //Extracting the last digit
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

        //Create Scanner object
        Scanner scan=new Scanner(System.in);

        //Taking user input
        System.out.println("Enter the number");
        n=scan.nextInt();

        //Creating class object
        Code9 c=new Code9();

        //calling add method using object reference variable
        int sum=c.add(n);

        //printing sum value
        System.out.println("Sum of Digits "+sum);

        //closing scan object
        scan.close();
    }
}
