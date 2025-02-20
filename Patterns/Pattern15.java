package Patterns;

/*
 
 ******
  *****
   ****
    ***
     **
      *

*/

public class Pattern15 {

    public static void main(String[] args) {

        // Initialize variable
        int n = 6;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = n - i + 1; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
