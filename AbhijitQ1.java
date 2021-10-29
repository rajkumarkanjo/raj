import java.util.stream.IntStream;

public class AbhijitQ1 {


    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 9}; // 6,8

        int a = arr[0];
        int d = arr[1] - arr[0];

        for (int i = 0 ; i < arr.length-1 ; i++){

            if (arr[i] == arr[i+1]-d ){

                continue;
            }else {

                System.out.print(arr[i]+d +",");
            }
        }
    }
}
