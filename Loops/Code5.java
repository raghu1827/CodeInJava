package Loops;

//Print all odd numbers from 1 to 20 using a for loop.

public class Code5 {
    public static void main(String[] args) {

        // Declare and initialize variable
        int num = 20;

        // iterate over from 1to 20
        for (int i = 1; i <= num; i++) {

            // check and print odd number
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
    }
}
