package GOG;

import java.util.Arrays;
import java.util.Optional;

public class Solution2 {

    public static void main(String[] args) {

        int N = 5, S = 12;
        String str =   largestNumber(N,S);

        Optional<String> optional = Optional.empty();

        System.out.println(optional.isPresent() ? optional.get() : "empty");

    }

    static String largestNumber(int n, int sum)
    {
        // add your code here
           int arr[] = new int[n];
           Arrays.fill(arr,0);

           for (int i = 0 ; i < arr.length ; i++){

               for (int j = 9 ; j >=1 ; j++){

                       if (sum > j){    // 12 > 9

                           arr[i] = j;
                           sum = sum-j;      // 3
                           break;
                       }else {



                       }
               }
           }
            System.out.println("test "+ Arrays.toString(arr));

            return null;
    }
}
