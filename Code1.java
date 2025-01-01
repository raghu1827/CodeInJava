package Basic;
//Java Program to Find the Sum of Even and Odd Numbers

import java.util.Scanner;

public class Code1 {
    public static void main(String[] args) {
         
        //Declare variables
        int n,sumEven=0,sumOdd=0;

        //Scanner object
        Scanner scan=new Scanner(System.in);

        //taking user input 
        System.out.println("Enter the number of element in array");
        n=scan.nextInt();

        //initializing array 
        int[] arr=new int[n];

        //taking user input for no of elements of the array
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){

            //taking and storing all user intput elements
            arr[i]=scan.nextInt();
        }

        //Logic
        for(int i=0;i<n;i++){

            //checking the element even or odd
            if(arr[i]%2==0){

                //adding if even element
                sumEven=sumEven+arr[i];
            }else{

                //adding if odd element
                sumOdd=sumOdd+arr[i];
            }
        }

        //printing them 
        System.out.println("Sum of even numbers: "+sumEven);
        System.out.println("Sum of odd number "+sumOdd);

        //closing scanner object
        scan.close();
    }
}
