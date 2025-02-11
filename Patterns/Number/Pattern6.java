package Patterns.Number;

/*
 Pattern

7 6 5 4 3 2 1 
7 6 5 4 3 2   
7 6 5 4 3     
7 6 5 4       
7 6 5         
7 6 
7

 */
public class Pattern6 {

    public static void main(String[] args) {

        int n = 7;

        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}