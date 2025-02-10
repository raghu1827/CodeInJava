package Basic;

import java.util.Scanner;

//Java Program to Read a Grade and Display the Equivalent Description

public class Code16 {
        public static void main(String[] args) 
        {
            //Declare variable
            char ch;
            
            //Scanner object
            Scanner scan=new Scanner(System.in);

            //Take user input
            System.out.println("Enter grade of the student");
            ch=scan.next().charAt(0);

            //Logic
            if(ch== 'A' || ch == 'a')
            {

                System.out.println("Student has got marks between above 80 out of 100.");
            }
            else if(ch == 'B' ||ch == 'b')
            {
                System.out.println("Student has got marks above 60 but less than equal to 80 out of 100.");
            }
            else if(ch == 'C' || ch == 'c')
            {
                System.out.println("Student has got marks above 40 but less than equal to 60 out of 100.");
            }
            else
            {
                System.out.println("Student has failed");
            }

            //closing scan
            scan.close();
    }
}
