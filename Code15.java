package Basic;
//Java Program to Read a Grade and Display the Equivalent Description

import java.util.Scanner;

public class Code15 {
    public static void main(String[] args) {
        
        //Declare variable
        char c;

        //Scanner object 
        Scanner scan=new Scanner(System.in);

        //Take user input
        System.out.println("Enter grade of the student (A,B,C)");
        c=scan.next().charAt(0);

        //Logic
        if(c=='A'||c=='a'){
            System.out.println("Student got a marks between 90 to 100");
        }else if(c=='B'||c=='b'){
            System.out.println("Student has got marks above 60 but less than equal to 80 out of 100 ");
        }else if(c=='C'||c=='c'){
            System.out.println("Student has got marks above 40 but less than equal to 60 out of 100");
        }else{
            System.out.println("Student has failed");
        }

        //closing scan object
        scan.close();
    }
}
 