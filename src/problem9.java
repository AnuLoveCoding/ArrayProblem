import java.util.Scanner;

public class problem9 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // print row by row  printing in 2D array;
      /*  System.out.println("Enter Your row value;");
        int n = scn.nextInt();
        System.out.println("Enter your column value;");
        int m = scn.nextInt();
       int [] [] matrix = new int [n] [m];

        System.out.println("Enter your matrix value");
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m  ; j++) {
                matrix [i][j] = scn.nextInt();
            }
        }

        for (int i = 0; i <n ; i++) {
            System.out.println(i+" row-> ");
            for (int j = 0; j < m  ; j++) {
                System.out.print(matrix[i][j]+" ");
            }

            System.out.println();
        } */

        
//        (Q.2) print 2D array in col by col;
        
        int n = scn.nextInt();
        int m = scn.nextInt();
        
        int [] [] col = new int[n][m];

        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m ; j++) {
                col[i][j] = scn.nextInt();
            }
        }


        for (int j = 0; j < m ; j++) {
            for (int i = 0; i < n ; i++) {
                System.out.print(col[i][j]+" ");
            }
            System.out.println();
        }






    }
}
