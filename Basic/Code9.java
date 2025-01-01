package Basic;

// Sum of Digits Program in Java

import java.util.Scanner;

public class Code9 {
    public static void main(String[] args) {
        
        //Declare variable
        int m,n,sum=0;

        //Scanner object
        Scanner scan=new Scanner(System.in);

        //Take user input
        System.out.println("Enter the number");
        m=scan.nextInt();

        //Logic
        while(m>0){

            n=m%10;
            sum=sum+n;
            m=m/10;
        }

        //printing sum value
        System.out.println("Sum of digits: "+sum);

        //closing scan
        scan.close();
    }    
}
