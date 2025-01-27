package Numbers;

public class Code1 {
    public static void main(String[] args) {
        int sum = 0;
        int[] multiples = new int[10]; // Array to store the multiples
        int index = 0;

        // Loop through numbers below 10
        for (int i = 1; i < 10; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                multiples[index] = i; // Store the multiple in the array
                index++; // Increment the index
            }
        }

        // Sum the multiples stored in the array
        for (int i = 0; i < index; i++) {
            sum += multiples[i]; // Add the value to the sum
        }

        System.out.println("Sum of multiples of 3 or 5 below 10: " + sum);
    }
}
