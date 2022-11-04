import java.util.Scanner;

public class pb2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Your n number");
//        int n = scn.nextInt();
           int [] arr = new int[5];
//        int [] arr= new int[n];


        for (int i = 0; i < 5 ; i++) {
            arr[i] = scn.nextInt();
        }
        for (int i = 0; i < 5 ; i++) {
            System.out.println(arr[i]);
        }

//        System.out.println(Arrays);
    }
}
