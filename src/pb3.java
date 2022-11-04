import java.util.Scanner;

public class pb3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Your Number arr Size  ");
        int n = scn.nextInt();

        int [] arr = new int[n];

        System.out.println("Enter number for+ "+n+"+ arr storeing;");
        for (int i = 0; i < n ; i++) {

            arr[i] = scn.nextInt();
            System.out.print(arr[i]+" ");
        }


    }
}
