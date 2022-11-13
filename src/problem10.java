//import java.util.Scanner;
//
//public class problem10 {
//
//    public static  int [] [] transpose_matrix(int[][]arr){
//        int n = arr.length;
//        int m = arr[0].length;
//        int [][] transpose = new int[m][n];
//
//        for (int i = 0; i <n ; i++) {
//            for (int j = 0; j <m ; j++) {
//               transpose[j][i] = arr[i][j];
//            }
//        }
//
//
//
//        return transpose;
//    }
//    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        /* (Q.1) Transpose Matrix:- */
//        int n = scn.nextInt();
//        int m = scn.nextInt();
//        int[][] arr = new int[n] [m];
//
//        for (int i = 0; i <n ; i++) {
//            for (int j = 0; j <m ; j++) {
//                arr[i][j] = scn.nextInt();
//            }
//        }
//
//
//        int[][] ans = transpose_matrix(arr);
//
//        for (int i = 0; i < ans.length ; i++) {
//            for (int j = 0; j <ans.length ; j++) {
//                System.out.print(ans[i][j]+" ");
//            }
//            System.out.println();
//        }
//
//    }
//
//}
