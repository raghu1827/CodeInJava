package Numbers;

//Java program find the given number is prime or not
import java.util.Scanner;

public class Code3 {

    public static boolean isPrime(int num) {

        // Checking is num less than or equal to 1
        if (num <= 1) {
            return false;
        }

        // checking is num divisble by 2 or not
        if (num % 2 == 0) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int number;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number");
        number = scan.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " is prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }

        scan.close();
    }
}
