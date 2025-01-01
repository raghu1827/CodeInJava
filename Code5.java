package Basic;
//Swap Two Numbers in Java without using any Temporary Variable

import java.util.Scanner;

public class Code5 {
    
    public static void main(String[] args) {
        
        //Declare variable
        int m,n;

        //Scanner object
        Scanner scan=new Scanner(System.in);

        //Taking user input
        System.out.println("Enter the first number");
        m=scan.nextInt();
        System.out.println("Enter the second number");
        n=scan.nextInt();

        //Logic
        //swap two number without temp
        m=m+n;
        n=m-n;
        m=m-n;

        //printing values
        System.out.println("M value: "+m);
        System.out.println("N value: "+n);

        //closing scanner object
        scan.close();
    }
}
