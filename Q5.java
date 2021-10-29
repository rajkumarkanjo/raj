package DSA;


import sun.nio.cs.ext.MacArabic;

import java.util.HashMap;
import java.util.Map;

/**
 * count number of same integer on mibile
 * eg : 94333-00995
 * 9 > count = 3
 *
 */
public class Q5 {

    public static void main(String[] args) {
        String number = "9433300995";


        Map<Character,Integer> map = new HashMap<>();

       for (char ch : number.toCharArray()){

           if (map.containsKey(ch)){

               map.put(ch,map.get(ch)+1);
           }
           else {
               map.put(ch,1);
           }

       }
       for(Map.Entry<Character,Integer> entry : map.entrySet()){

           System.out.print(entry.getKey()+" count= ");
           System.out.println(entry.getValue());;

       }


    }











}
