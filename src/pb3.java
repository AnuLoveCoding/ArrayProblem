import java.sql.SQLOutput;
import java.util.Scanner;

public class pb3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

//       Q. 1 Take n values from user denoting marks of n students. Store these values
//         in array and then find the average score.

            System.out.println("Enter Your Marks  size ");
            int n = scn.nextInt();
            int [] arr = new int[n];

            System.out.println("Enter Your marks");
            for (int i = 0; i < arr.length ; i++)  arr[i] = scn.nextInt();

            double  sum =0 ;

            for (int j : arr) sum += j;

            double  ans  = (double) sum/arr.length;
            System.out.println(ans);



//        Q.2  print the array and declare the array;

//        System.out.println("Enter Your Number arr Size  ");
//
//        int n = scn.nextInt() ; int [] arr = new int[n] ;
//
//        System.out.println("Enter number for "+ n +" arr storing;");
//        for (int i = 0; i < arr.length; i++) arr[i] = scn.nextInt();
//
//        for (int j : arr) System.out.println("arr["+j+"] = "+j+";");






    }
}
