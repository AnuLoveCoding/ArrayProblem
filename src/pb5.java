import java.util.Scanner;

public class pb5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
/*        Q.1 Write a program to print the input array A of size N in reverse order
        where you have to take integer N and further N elements as input from user.*/

        System.out.println("Enter Your size value");
        int n = scn.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter Your arr Value");
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = scn.nextInt();
        }

        for (int i = arr.length-1; i>=0 ; i--) {
            System.out.println(arr[i]);
        }


    }
}
