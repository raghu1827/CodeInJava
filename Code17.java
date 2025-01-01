package Basic;
//Java Program to Check Whether a Given Alphabets are Uppercase or Lowercase or Digits

import java.util.Scanner;

public class Code17 {
    public static void main(String[] args) {
        
        //Declare variable
        char ch;

        //Scanner object
        Scanner scan=new Scanner(System.in);

        //Take user input
        System.out.println("Enter the character");
        ch=scan.next().charAt(0);

        //Logic
        
        //checking for lower case
        if(ch>=97&&ch<=123){
            System.out.println(ch+" is lower case");
        //checking for upper case
        }else if(ch>=65&&ch<=96){
            System.out.println(ch+" is upper case");
        }else if(ch>=48&&ch<=57){
            System.out.println(ch+" is digit");
        }else{
            System.out.println(ch+" is an invalid character");
        }

        //closing scan object
        scan.close();
    }
}
