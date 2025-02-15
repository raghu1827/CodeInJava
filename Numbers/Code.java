package Numbers;

/*
If we list all the natural numbers below 10 that are multiples of 3 or 5, 
we get 3, 5, 6, and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.

METHOD 1:Normal way
*/
public class Code {

    public static void main(String[] args) {

        // We have to check number from 1 to 999 below 1000 is the limit.
        int limit = 1000;
        int sum = 0;

        for (int i = 1; i < limit; i++) {

            // Checking that is i multiple of 3 or 5 number
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }

        // printing sum all of 3 or 5
        System.out.println("Sum of all multiples of 3 or 5 : " + sum);
    }
}
