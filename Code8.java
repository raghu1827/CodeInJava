package Basic;
//Sum of Digits program in java

import java.util.Scanner;

public class Code8 {
    
    public static void main(String[] args) {
        
        //Declare variables
        int m,n,sum=0;

        //create Scanner object
        Scanner scan=new Scanner(System.in);

        //Taking user input
        System.out.println("Enter the number");
        m=scan.nextInt();

        //Logic
        //check the condition 
        while(m>0){
            
            //Extracting the last digit
            n=m%10;

            //Add the last digit to a sum
            sum=sum+n;

            //Remove the last digit from the number
            m=m/10;
        }

        //print the sum value
        System.out.println("Sum of digits: "+sum);

        //closing scan object
        scan.close();
    }
}
