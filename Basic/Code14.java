package Basic;

//Java Program to Print Binary Equivalent of an Integer using Recursion

import java.util.Scanner;

public class Code14 {

    //Method
    String Binary(int x)
    {
        if(x > 0)
        {
            int a = x % 2;
            x = x / 2;
            return a + "" + Binary(x);
        }
        return "";
    }
    public static void main(String[] args) {
        
        //Declare variable
        int n;

        //Scanner object
        Scanner scan = new Scanner(System.in);

        //Take user input
        System.out.print("Enter the number:");
        n = scan.nextInt();

        //Creating class object
        Code14 c=new Code14();

        //calling method using object reference 
        String m = c.Binary(n);

        //printing the m value
        System.out.println("Answer:"+m);

        //closing scan
        scan.close();
    }   
}
