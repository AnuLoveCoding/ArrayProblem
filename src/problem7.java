import java.util.Scanner;

public class problem7 {
//    (Q.1) sorted array; check array increasing manner or not
//    public static boolean check_increasing(int [] arr){
//        for (int i = 0; i <arr.length-1 ; i++) {
//            if(arr[i] > arr[i+1]){
//                continue; // you can skip to continue
//            } else  {
//                return false;
//            }
//        }
//        return true;
//    }
//    (Q.2) find the single element in arr1;
//    public static int single_element(int [] arr1){
//
//        for (int i = 0; i < arr1.length ; i++) {
//            int val = arr1[i];
//            int freq = 0;
//            for (int j = 0; j < arr1.length ; j++) {
//                if(arr1[j]==val){
//                    freq++;
//                }
//            }
//            if(freq==1){
//                return val;
//            }
//        }
//
//        return -1;
//    }

//    (Q.3) concatination of two array;
    public static int [] getConcatenation(int[] nums) {
        int [] concatenation_array = new int [ 2* nums.length];

        for(int i=0;i < nums.length;i++){
            concatenation_array[i+nums.length] = concatenation_array[i]=nums[i];
        }
        return concatenation_array;
    }
    public static void main(String[] args) {
        Scanner  scn = new Scanner(System.in);
//        (Q.1) sorted array; check array increasing manner or not
//        int [] arr = {1,2,3,4,5,6,7,8,9,};
//        System.out.println(check_increasing(arr));

//        (Q.2) given an array
//        int [] arr1 = {3,9,14,16,3,14,16};

//        (Q.3) concatination of two array;
            int [] nums = {1,2,1};
            System.out.println(getConcatenation(nums));

    }
}
