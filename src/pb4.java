

import java.util.Scanner;

public class pb4 {
//    Q.1
//    public static boolean Search_value(int[] arr , int k) {
//
//        for (int i = 0; i <arr.length; i++) {
//            if(arr[i]==k){
//                System.out.println(i);
//                return  true;
//            }
//        }
//        return false;
//    }

//    Q.2
//    public static int count_freq(int [] arr , int k){
//        int count =0;
//
//        for (int i = 0; i <arr.length ; i++) {
//            if(arr[i]==k){
//                count++;
//            }
//        }
//        return count;
//    }

//    Q.3
//    public static  boolean consecutive(int[] arr){ //consecutive means side by side duplicate;
//        for (int i = 0; i < arr.length-1 ; i++) {
//            if(arr[i]==arr[i+1]){
//                return true;
//            }
//        }
//        return false;
//    }

    public static  int arr_sum(int [] arr ){
        int sum =0;
        for (int i = 0; i < arr.length ; i++) {
            sum+=arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Your Number");
        int n = scn.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter Your arr Value");
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println(arr_sum(arr));
//        Q.1;
//        int k = 12;
//         int [] arr = {20,15,12,6,10};
//        System.out.println(Search_value(arr,k));

//        Q.2;
//        int [] arr = {12,6,15,6,12,8,16,87,25,66};
//         int k = 8;
//        System.out.println("count of count_freq"+count_freq(arr,k));


//        Q.3;
//          int [] arr = {4,19,117,8,81,114 ,56 ,98};
//          System.out.println(consecutive(arr));


    }
}
