package Basic;
//Java Program to Accept the Height of a Person and Categorize as Taller, Dwarf & Average

import java.util.Scanner;

public class Code18 {
 
    public static void main(String[] args) {
        
        //Declare variable
        int m;

        //Scanner object
        Scanner scan=new Scanner(System.in);

        //Take user input
        System.out.println("Enter the height");
        m=scan.nextInt();

        //Logic
        if(m>175){
            System.out.println("Person is tall");
        }else if(m>155 && m<=175){
            System.out.println("The person has average height");
        }else{
            System.out.println("The person is dwarf");
        }

        //closing scan object
        scan.close();
    }
}

