import java.util.Arrays;

public class LongestNumber {


    public static void main(String[] args) {

      int  N = 5, S = 12;
      largestNumber(N,S);
    }


    static void largestNumber(int n, int sum)
    {
        // add your code here

        StringBuilder sbf = new StringBuilder();
        int x = 9 ;

        if(x*n < sum){

            System.out.println(-1);
        }
       while (sum > 0 ){

            if (sum >= x){

                sbf.append(x);
                sum = sum-x;

            }else  if (sum < 9){

                sbf.append(sum);
                sum = sum - x;
            }
        }
        while (sbf.length() < n ){

                 sbf.append(0);
        }
        System.out.println(sbf.toString());
}}
