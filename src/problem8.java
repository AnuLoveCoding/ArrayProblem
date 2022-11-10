import java.util.Scanner;

public class problem8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        /* (Q.1) Write a program to input N numbers array, a number X and a number Y from user and insert an element
           Y in it at specified position X. X is based on 1-based indexing.
         */
       /* System.out.println("Enter your arr size");
        int n = scn.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter Your arr value");
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println("Enter Your Element value ");
        int x = scn.nextInt()-1;
        System.out.println("Enter Your Inserting value");
        int y= scn.nextInt();

        for (int i = 0; i < x ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.print(y+" ");

        for (int i = x; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }  */

        /* (Q.2)  Write a program to input N numbers array from user and an
              integer X and print the array by deleting element at specified position X.
         */

        /* System.out.println("Enter Your arr size");
        int n = scn.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter Your arr value");
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println("Enter your integer deleting element value");
        int x = scn.nextInt()-1;

        for (int i = 0; i < arr.length ; i++) {
            if(i==x){
                continue;
            }else{
                System.out.print(arr[i]+" ");
            }
        } */

        /* (Q.3) Given an integer array A, find the inverse of the array A and return it.
         All the elements of the given array are distinct and elements of the array lie in the range [0, |A|).
         */
       /* System.out.println("Enter Your arr size ");
         int n = scn.nextInt();
         int [] arr = new int[n];
         int [] arr1 = new int [arr.length]; // New arr of same value arr1;

        System.out.println("Enter Your arr value");
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = scn.nextInt();
        }

        for (int i = 0; i < arr.length ; i++) {
            int pos = arr[i];
            arr1[pos] = i ;
        }

        System.out.println("New indexing value ");
        for (int i = 0; i < arr1.length ; i++) {
            System.out.print(arr1[i]+" ");
        } */

//        (Q.4)



    }
}
