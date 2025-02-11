package Patterns.Number;

/*
Pattern

7 7 7 7 7 7 7
6 6 6 6 6 6
5 5 5 5 5
4 4 4 4
3 3 3
2 2
1

*/

public class Pattern4 {
    public static void main(String[] args) {

        int n = 7;

        // Pattern Logic
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
