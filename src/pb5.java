import java.util.Scanner;

public class pb5 {
//    Q.7
//public static String arri(int [] arr){
//    String store ="";
//    for (int i = 0; i <arr.length ; i++) {
//        if(arr[i]<0){
//            store += arr[i]+",";
//        }
//    }
//    return store;
//}
//    Q.5
//    public static int arr_sum(int[] arr){
//        int sum = 0;
//        for (int i = 0; i <arr.length; i++) {
//            sum+=arr[i];
//        }
//        return sum;
//    }

//     Q.6
//     public static int product(int [] arr) {
//        int prod =1;
//        for (int i = 0; i <arr.length ; i++) {
//            prod*=arr[i];
//        }
//        return prod;
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
//        System.out.println("Enter Your arr size");
//        int n = scn.nextInt();
//        int [] arr = new int[n];
//
//        System.out.println("Enter Your arr value");
//        for (int i = 0; i <arr.length ; i++) {
//            arr[i] =scn.nextInt();
//        }
//
//        System.out.println("Function return your product "+product(arr));

//        (Q.7) Write a program to print all negative numbers from input array A of size N.
//        Take integer N and N elements of the array as input from user. Input 1: (5 1 -5 2 -8 -4);
//        System.out.println("Enter Your arr size");
//          int n = scn.nextInt();
//          int [] arr = new int[n];
//
//        System.out.println("Enter Your arr value");
//        for (int i = 0; i <arr.length ; i++) {
//            arr[i] = scn.nextInt();
//        }
//
//        String store ="";
//        for (int i = 0; i <arr.length ; i++) {
//            if(arr[i]<0){
//                store += arr[i]+",";
//            }
//        }
//        System.out.println("New Array of "+"["+store+"]");
//        System.out.println("Function return new negative array "+"["+arri(arr)+"]");

//        (Q.8) You are given a constant array A and an integer B.
//           You are required to return another array where outArr[i] = A[i] + B.

//           System.out.println("Enter Your arr size");
//            int  n= scn.nextInt();
//            int [] arr = new int[n];
//
//            System.out.println("Enter Your arr value");
//            for (int i = 0; i <arr.length ; i++) {
//                arr[i] = scn.nextInt();
//            }
//
//            System.out.println("Enter your new value to add");
//            int b = scn.nextInt();
//
//            int [] A = new int[arr.length];
//
//            for (int i = 0; i <arr.length ; i++) {
//                A[i] = arr[i] +b;
//            }
//
//            String store = "";
//            for (int i = 0; i <A.length ; i++) {
//                store+=A[i]+",";
//            }
//            System.out.println("This is Your new Dupicate array "+"["+store+"]");

//        (Q.9) You are given T(number of test cases) integer arrays.
//        For each array A, you have to find the value of absolute difference
//        between the counts of even and odd elements in the array.
//        System.out.println("Enter Your Test case Value");
//          int T = scn.nextInt();
//
//          while(T>0){
//              System.out.println("Enter Your arr size");
//              int n = scn.nextInt();
//              int [] arr = new int[n];
//
//              System.out.println("Enetr Your arr value");
//              for (int i = 0; i <arr.length ; i++) {
//                  arr[i] = scn.nextInt();
//              }
//
//              int count_even = 0 ,count_odd=0;
//
//              for (int j : arr) {
//                  if (j % 2 == 0) {
//                      count_even++;
//                  } else {
//                      count_odd++;
//                  }
//              }
//              if(count_even > count_odd){
//                  System.out.println(count_even-count_odd);
//              }else{
//                  System.out.println(count_odd-count_even);
//              }
//              T--;
//          }

//        (Q.10) Write a program to find the difference between the sum of all even elements
//        and the sum of all odd elements from the given list.
        System.out.println("Enter Your arr size");
         int n = scn.nextInt();
         int [] ls = new int[n];


        System.out.println("Enter Your arr value");
        for (int i = 0; i <ls.length ; i++) {
            ls[i] = scn.nextInt();
        }

        int sum_even = 0, sum_odd =0 ;

        for (int i = 0; i <ls.length ; i++) {
            if(ls[i]%2==0){
                sum_even+=ls[i];
            }else{
                sum_odd+=ls[i];
            }
        }

        if(sum_even>sum_odd){
            System.out.println(sum_even-sum_odd);
        }else {
            System.out.println(sum_odd -sum_even);
        }


    }

}
