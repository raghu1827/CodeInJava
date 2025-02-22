package Patterns;

/*

   1    
  1 1   
 1 2 1  
1 3 3 1 

 */

public class Pattern29 {

    public static void main(String[] args) {

        // Initialize variable
        int n = 4;

        // Logic
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            int num = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / j;

            }
            System.out.println();
        }
    }
}
