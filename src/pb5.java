import java.util.Scanner;

public class pb5 {
//    Q.5
//    public static int arr_sum(int[] arr){
//        int sum = 0;
//        for (int i = 0; i <arr.length; i++) {
//            sum+=arr[i];
//        }
//        return sum;
//    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
/*        Q.1 Write a program to print the input array A of size N in reverse order
        where you have to take integer N and further N elements as input from user.*/
//        System.out.println("Enter Your size value");
//        int n = scn.nextInt();
//        int [] arr = new int[n];
//
//        System.out.println("Enter Your arr Value");
//        for (int i = 0; i <arr.length ; i++) {
//            arr[i] = scn.nextInt();
//        }
//
//        for (int i = arr.length-1; i>=0 ; i--) {
//            System.out.println(arr[i]);
//        }

      /*  Q.4  Write a program to print maximum and minimum elements of the input array A of size N.
                The first line of the input would contain a single integer N that represents the length of the array.
        The next N lines contain elements of the input array A.*/
//        System.out.println("Enter Your size Value");
//        int n = scn.nextInt();
//        int [] arr = new int[n];
//
//        System.out.println("Enter Your arr value");
//        for (int i = 0; i <arr.length ; i++) {
//            arr[i]= scn.nextInt();
//        }
//
//        int  max = arr[0] , min = arr[0] ;
//
//        for (int j : arr) {
//            if (j > max) {
//                max = j;
//            }
//            if (j < min) {
//                min = j;
//            }
//        }
//        System.out.println(max+" "+min);

//      Q.5 Write a program to print sum of elements of the input array A of size N.
//        System.out.println("Enter Your arr size");
//        int n = scn.nextInt();
//        int [] arr = new int[n];
//
//        System.out.println("Enter Your arr value");
//        for (int i = 0; i <arr.length ; i++) {
//            arr[i] = scn.nextInt();
//        }
//
//        int sum =0;
//        for (int i = 0; i <arr.length ; i++) {
//            sum+=arr[i];
//        }
////        System.out.println(arr_sum(arr)); // Q.5
//        System.out.println(sum);

//        Q.6 Write a program that returns the product of all elements present in the list.
        System.out.println("Enter Your arr size");
        int n = scn.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter Your arr value");
        for (int i = 0; i <arr.length ; i++) {
            arr[i] =scn.nextInt();
        }

        System.out.println("Function return your product "+product(arr));

    }


    public static int product(int [] arr) {
        int prod =1;
        for (int i = 0; i <arr.length ; i++) {
            prod*=arr[i];
        }
        return prod;
    }
}
