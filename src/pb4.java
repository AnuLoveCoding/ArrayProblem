import java.util.Scanner;

public class pb4 {

    public static boolean Search_value(int[] arr , int k) {
           int ans = arr.length;
        for (int i = 0; i < ans; i++) {
            if(arr[i]==k){
                System.out.println(i);
                return  true;
            }
        }
        return false;
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
        int k = 12;
//         int [] arr = {20,15,12,6,10};
        System.out.println(Search_value(arr,k));



    }
}
