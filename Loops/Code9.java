package Loops;

//Print the sum of even numbers from 1 to 50 using a for loop.

public class Code9 {
    public static void main(String[] args) {

        // Declare and initialize variable
        int num = 50;
        int sum = 0;

        for (int i = 1; i <= num; i++) {

            // check even number and sum even number
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("sum of even number from 1 to 50: " + sum);
    }
}
