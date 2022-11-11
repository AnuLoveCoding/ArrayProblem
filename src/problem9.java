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
        
//        int n = scn.nextInt();
//        int m = scn.nextInt();
//
//        int [] [] col = new int[n][m];
//
//        for (int i = 0; i < n ; i++) {
//            for (int j = 0; j < m ; j++) {
//                col[i][j] = scn.nextInt();
//            }
//        }
//
//
//        for (int j = 0; j < m ; j++) {
//            for (int i = 0; i < n ; i++) {
//                System.out.print(col[i][j]+" ");
//            }
//            System.out.println();
//        }

//        (Q.3)  Write a program to input an integer N and a N*N matrix Mat from user
//             and print the matrix in wave form (column wise)

      /*  System.out.println("Enter your 2D arr size");
        int n = scn.nextInt();
        int [][] arr = new  int[n][n];

        System.out.println("Enter Your arr value");
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                arr[i] [j] = scn.nextInt();
            }
        }

        for (int j = 0; j <n ; j++) {
            if(j%2==0){
                for (int i = 0; i <n ; i++) {
                    System.out.print(arr[i][j]+" ");
                }
            }else{
                for (int i = n-1; i >=0 ; i--) {
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }  */

//        (Q.4)  You are given an integer matrix mat and you have to print
//        the elements of the matrix in wave form (row wise)
         /*   System.out.println("Enter your 2D arr size");
            int n = scn.nextInt();
            int [][] arr = new  int[n][n];

            System.out.println("Enter Your arr value");
            for (int i = 0; i <n ; i++) {
                for (int j = 0; j <n ; j++) {
                    arr[i] [j] = scn.nextInt();
                }
            }

            for (int i = 0; i <n ; i++) {
                if(i%2==0){
                    for (int j = 0; j <n ; j++) {
                        System.out.println(arr[i][j]+" ");
                    }
                }else{
                    for (int j = n-1; j>=0 ; j--) {
                        System.out.println(arr[i][j]+" ");
                    }
                }
            } */


//        (Q.5)  You are given a 2D integer matrix A,
//        return a 1D integer array containing row-wise sums of original matrix.

     /*   System.out.println("Enter your 2D arr size");
        int n = scn.nextInt();
        int [][] arr = new  int[n][n];
        int[] Single_array = new int[arr.length];

        System.out.println("Enter Your arr value");
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                arr[i] [j] = scn.nextInt();
            }
        }

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[0].length ; j++) {
                Single_array[i] += arr[i][j];
            }
        }  */


//        (Q.6) You are given two matrices A & B of same size,
//        you have to return another matrix which is the sum of A and B.

        System.out.println("Enter your 2D arr size");
        int n = scn.nextInt();
        int [][] a = new  int[n][n];
        int[] [] b = new int[n][n];
        int [][] c = new int[a.length][b[0].length];

        System.out.println("Enter first Your arr value");
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                a[i][j] = scn.nextInt();
            }
        }

        System.out.println("Enter second Your arr value");
        for (int i = 0; i< n ; i++) {
            for (int j = 0; j< n ; j++) {
                b[i][j] = scn.nextInt();
            }
        }

        System.out.println("This 2D array add both first and second 2D array ");
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <b[0].length ; j++) {
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+" "); // for print new 2D array ;
            }
            System.out.println(); // this is for changing new line;
        }



    }
}
