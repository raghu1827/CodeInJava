package Patterns.Number;

/*
Pattern

7 6 5 4 3 2 1 
6 5 4 3 2 1   
5 4 3 2 1     
4 3 2 1       
3 2 1         
2 1 
1 

*/
public class Pattern10 {
    public static void main(String[] args) {

        int n = 7;

        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
