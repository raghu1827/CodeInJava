package Patterns;

/*

      *      
     * *     
    * * *    
   * * * *   
  * * * * *  
 * * * * * * 

*/

public class Pattern16 {
    public static void main(String[] args) {

        // Initialize variable
        int n = 6;

        // Logic
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
