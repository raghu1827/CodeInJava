package Loops;

//Print all numbers from 1 to 100 that are divisible by both 3 and 5.

public class Code11 {
    public static void main(String[] args) {

        // Declare and initialize variable
        int num = 100;

        // Itrate and print number which divisible by both 3 and 5
        for (int i = 1; i <= num; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Divisible by both 3 and 5 numbers: " + i);
            }
        }
    }
}
