package Loops;

// Print the sum of the first 10 natural numbers using a for loop.

public class Code6 {
    public static void main(String[] args) {

        // Declare and initilize varaible
        int num = 10;
        int sum = 0;

        // iterate over 1 to num natural numbers
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("sum of natural numbers: " + sum);
    }
}
