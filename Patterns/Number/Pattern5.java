package Patterns.Number;

/*
 Pattern

7 
7 6 
7 6 5         
7 6 5 4       
7 6 5 4 3     
7 6 5 4 3 2   
7 6 5 4 3 2 1 

 */
public class Pattern5 {

    public static void main(String[] args) {

        int n = 7;

        for (int i = n; i >= 1; i--) {
            for (int j = n; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}