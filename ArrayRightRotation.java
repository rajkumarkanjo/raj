import java.util.Arrays;

public class ArrayRightRotation {


    public static void main(String[] args) {


        int arr[] = {1,2,3,4,5};

        int d = 2;    //  [5,1,2,3,4] , [4,5,1,2,3]


        while(d-- != 0 ) {

            int temp = arr[arr.length-1];

            for (int i = arr.length-1; i >0 ; i--) {

                 arr[i] = arr[i-1];
            }

            arr[0] = temp;

        }
    }
}
