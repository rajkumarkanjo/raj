package DSA;

import java.util.Arrays;

public class JPMC {


    public static void main(String[] args) {


        String str = "1496";    // 21      2 4 18 6  2 4 (1+8) 6

        char [] ch = str.toCharArray();
        int [] arr = new int[ch.length];

       int i = 0;
       boolean flag = true;
       int sum = 0 ;

       while (arr.length-1 >= i ){

           if (flag){
               int x = Integer.parseInt(String.valueOf(ch[i]));
               arr[i] = (x*2);
               flag = false;
               i++;
           }else {
               int x = Integer.parseInt(String.valueOf(ch[i]));
               arr[i] = (x);
               i++;
               flag = true;
           }
        }
       for (int x = 0 ; x < arr.length ; x++){

           int d = arr[x];
               while(d!=0){
                   sum = sum + d%10;
                   d = d/10;
           }
       }
        System.out.println(sum);
    }


}
