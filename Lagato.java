import java.util.*;

public class Lagato {

    public static void main(String[] args) {


        int a[] = {1,2,4,5};  // 1 2 4 5 6 7
        int b[] = {2,5,6,7};

       List<Integer> temp = new ArrayList<>();

       List<int[]> list = new ArrayList<>();

       list.add(a);
       list.add(b);

       for (int i = 0 ; i <list.size() ; i++) {

           int c[] = list.get(i);

              for (int j = 0 ; j< c.length ; j++){

                  temp.add(c[j]);
              }
        }

       Collections.sort(temp);

       System.out.println(temp);

    }

}
