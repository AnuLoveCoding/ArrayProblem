import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class pb4 {
//    Q.1
//    public static boolean Search_value(int[] arr , int k) {
//           int ans = arr.length;
//        for (int i = 0; i < ans; i++) {
//            if(arr[i]==k){
//                System.out.println(i);
//                return  true;
//            }
//        }
//        return false;
//    }

//    Q.2
    public static int count_freq(int [] arr , int k){
        int count =0;

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==k){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
//        System.out.println("Enter Your Number");
//        int n = scn.nextInt();
//        int [] arr = new int[n];

//        System.out.println("Enter Your arr Value");
//        for (int i = 0; i < arr.length ; i++) {
//            arr[i] = scn.nextInt();
//        }
//        Q.1;
//        int k = 12;
//         int [] arr = {20,15,12,6,10};
//        System.out.println(Search_value(arr,k));

//        Q.2;
        int [] arr = {12,6,15,6,12,8,16,87,25,66};
         int k = 8;
        System.out.println("count of count_freq"+count_freq(arr,k));



    }
}
