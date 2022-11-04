import java.util.Scanner;

public class pb3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Your Number arr Size  ");
        int n = scn.nextInt();

        int [] arr = new int[n];

        System.out.println("Enter number for "+ n +" arr storeing;");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= scn.nextInt();
        }

        System.out.println("Here are your Output");
        for (int j : arr) {
            System.out.print(j + " ");
        }


    }
}
