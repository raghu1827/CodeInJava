package Basic;
//Java Program to Find the Largest Number Among Three Numbers

import java.util.Scanner;

public class Code3 {

    public static void main(String[] args) {
        
        //Declaring variable
        int x,y,z;

        //Scanner object
        Scanner scan=new Scanner(System.in);

        //Taking user input
        System.out.println("Enter the first number");
        x=scan.nextInt();
        System.out.println("Enter the second number");
        y=scan.nextInt();
        System.out.println("Enter the third number");
        z=scan.nextInt();

        //Logic
        if(x>y && x>z){
            System.out.println("Largest number is: "+x);
        }else if(y>z){
            System.out.println("Largest number is: "+y);
        }else{
            System.out.println("Lagest number is: "+z);
        }

        //closing scanner object
        scan.close();
    }
}