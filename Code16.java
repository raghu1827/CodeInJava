package Basic;
//Java Program to Check Whether a Character is a Vowel, Consonant or Digit

import java.util.Scanner;

public class Code16 {
    
    public static void main(String[] args) {
        
        //Declare variable
        char ch;

        //Create Scanner object
        Scanner scan=new Scanner(System.in);

        //Take user input
        System.out.println("Enter the character");
        ch=scan.next().charAt(0);

        //Logic
        //checking ch is digit or not
        if(Character.isDigit(ch)){
            System.out.println(ch+" is digit");
        }
        //checking ch is vowel or not
        else if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='o'||ch=='O'||ch=='u'||ch=='U'){
            System.out.println(ch+" is vowel");
        }
        //checking ch is constonant or not
        else if(ch>='a'&& ch<='z'||ch>='A'&&ch<='Z'){
            System.out.println(ch+" is constonant");
        }else{
            System.out.println(ch+" is an invalid character");
        }

        //closing scan object
        scan.close();
    }
}
