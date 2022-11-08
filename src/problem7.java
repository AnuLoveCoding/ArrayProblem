import java.util.Scanner;

public class problem7 {
//    (Q.1) sorted array; check array increasing manner or not
    public static boolean check_increasing(int [] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            if(arr[i] < arr[i+1]){
                continue;
            } else  {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner  scn = new Scanner(System.in);
//    (Q.1) sorted array; check array increasing manner or not
        int [] arr = {1,2,3,4,5,6,7,8,9,};
        System.out.println(check_increasing(arr));

//        (Q.2)

    }
}
