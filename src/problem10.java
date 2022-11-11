public class problem10 {
    static int[] fun(int[]arr) {

        int[]new_arr = {64,83,56};

        return new_arr;

    }
    public static void main(String[] args) {

        int[]arr = {10,20,30,40,50};

        arr = fun(arr);

        for(int i=0; i < arr.length;i++) {

            System.out.print(arr[i] + " ");

        }

    }

}
