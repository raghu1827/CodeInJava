package Patterns.Star;

/*

* * * * * 
* * * * * 
* * * * * 
* * * * * 

 */

public class Pattern1 {

    public static void main(String[] args) {

        // Initilize variable
        int n = 5;

        // Logic here
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
