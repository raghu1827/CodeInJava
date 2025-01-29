package Loops;

//Print the sum of odd numbers from 1 to 50 using a for loop.

public class Code10 {

    public static void main(String[] args) {

        // Declare and initilize varaible
        int num = 50;
        int sum = 0;

        // iterate and check num is odd and sum odd number
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }
        System.out.println("sum of odd number from 1to 50: " + sum);
    }
}
