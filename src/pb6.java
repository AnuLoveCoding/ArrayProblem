import java.util.Scanner;

public class pb6 {
//    (Q.1) find the element in array function;
//    public static boolean  search(int [] arr , int k){
//        for (int i = 0; i <arr.length ; i++) {
//            if (arr[i]==k){
//                return true;
//            }
//        }
//
//        return false;
//    }

//    (Q.2)  find the frequency of element;
//    public static int frequency(int [] arr , int k){
//        int count =0;
//
//        for (int i = 0; i <arr.length ; i++) {
//            if(arr[i]==k){
//                count++;
//            }
//        }
//
//        return count;
//    }

//    (Q.3) find the consecutive duplicate number ;
//    public static boolean consecutive(int []  arr) {
//
//        for (int i = 0; i <arr.length-1 ; i++) {
//            if(arr[i]==arr[i+1]){
//                return true;
//            }
//        }
//        return false;
//    }

//    (Q.4)
//    public static int [] min_max(int [] arr ){
//        int max = arr[0];
//        int min = arr[0];
//
//        for (int i = 0; i <arr.length ; i++) {
//            if(arr[i]>max){
//                max = arr[i];
//            }
//            if(arr[i]<min){
//                min = arr[i];
//            }
//        }
//        int [] A = {max,min};
//        return A;
//    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
//        System.out.println("Enter Your arr size");
//        int  n = scn.nextInt();

//        (Q.1) find the element in array ;

//        int [] arr = new int[n];
//
//        System.out.println("Enter Your arr value");
//        for (int i = 0; i <arr.length ; i++) {
//            arr[i] = scn.nextInt();
//        }
//        System.out.println("Enter value to search");
//        int k= scn.nextInt();
//
//        System.out.println(search(arr,k));

//        (Q.2) find the frequency of element;
//        System.out.println("Enter Your arr size");
//        int  n = scn.nextInt();
//        int arr [] = new int[n];
//
//        System.out.println("Enter Your arr value");
//        for (int i = 0; i <arr.length ; i++) {
//            arr[i] = scn.nextInt();
//        }
//
//        System.out.println("Enter value to search");
//        int k = scn.nextInt();

//        int count =0;
//
//        for (int i = 0; i <arr.length ; i++) {
//            if(arr[i]==k){
//                count++;
//            }
//        }
//
//        System.out.println(count);

//        System.out.println(frequency(arr,k));

//        (Q.3) find the consecutive duplicate number ;
//        System.out.println("Enter Your arr size");
//        int  n = scn.nextInt();

//        int [] arr = new int[n];

//        System.out.println("Enter Your arr value");
//        for (int i = 0; i <arr.length ; i++) {
//            arr[i] = scn.nextInt();
//        }


//        for (int i = 0; i <arr.length-1 ; i++) {
//             if(arr[i]==arr[i+1]){
//                System.out.println("Yes");
//            }
//        }
//        System.out.println(consecutive(arr));

//        (Q.4) find the max,min in arr ;
//        System.out.println("Enter Your arr size");
//        int  n = scn.nextInt();
//
//        int [] arr = new int[n];
//
//        System.out.println("Enter Your arr value");
//        for (int i = 0; i <arr.length ; i++) {
//            arr[i] = scn.nextInt();
//        }
//
//        int[]  ans = min_max(arr);
//
//        System.out.println("Min = "+ans[0]);
//        System.out.println("Max = "+ans[1]);

//        (Q.5) Bar-chart print question;
//        System.out.println("Enter Your arr size");
//        int  n = scn.nextInt();
//
//        int [] arr = new int[n];
//
//        System.out.println("Enter Your arr value");
//        for (int i = 0; i <arr.length ; i++) {
//            arr[i] = scn.nextInt();
//        }
//
//        int max = arr[0] ;
//        for (int i = 0; i <arr.length ; i++) {
//           if(arr[i]>max){
//               max = arr[i];
//           }
//        }
//
//        for (int floor = max; floor>=1 ; floor--) {
//            for (int i = 0; i <arr.length ; i++) {
//                if(arr[i]>=floor){
//                    System.out.print("*\t");
//                }else{
//                    System.out.print("\t");
//                }
//            }
//            System.out.println();
//        }

//        (Q.6) sum of Two arrays ;

        System.out.println("Enter Your arr1 size");
        int  n1 = scn.nextInt();
        int [] arr1 = new int[n1];
        System.out.println("Enter Your arr1 value");
        for (int i = 0; i <arr1.length ; i++) {
            arr1[i] = scn.nextInt();
        }

        System.out.println("Enter Your arr2 size");
        int  n2 = scn.nextInt();
        int [] arr2 = new int[n2];
        System.out.println("Enter Your arr value");
        for (int i = 0; i <arr2.length ; i++) {
            arr2[i] = scn.nextInt();
        }

        int [] sum = new int [Math.max(n1, n2)]; //[n1>n2 ? n1 : n2];
        int c =0 ;

        int  i = arr1.length-1;
        int j = arr2.length-1;
        int  k= sum.length-1;

        while(k>= 0){
            int d =c;
            if(i>=0){
                d+=arr1[0];
            }
            if(j>=0){
                d+=arr2[0];
            }
             c= d/10;
            d = d%10;

            sum[k] =d;
            i--;
            j--;
            k--;
        }
        if()









    }
}
