package DSA;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * convert a list to a string
 * cam use rightShift ie 10*x
 */

public class Q4 {


    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();

        list.add(1); list.add(2); list.add(3);
        int value = 0 ;

        for (int x : list){

            value = (10*value) + x;
        }
      //  System.out.println(value);


        int x = 1234 ;
        int reverse = 0 ;
        while (x!=0){

            reverse = reverse + x%10;
            x = x/10;
        }
        System.out.println(reverse);
    }

}
