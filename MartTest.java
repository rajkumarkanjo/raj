package GOG;


import java.util.Arrays;

public class MartTest {

    public static void main(String[] args) {


        //int arr[] = {3,1,3,7,5,1,3,9}; // 1 1 1 1 1 7 5 9

        int arr[] = {3,1,3,1,5,1,3,1}; // 1 1 1 1 1 7 5 9  [breaking]

       //  int arr[] = {3,1,3,1,5,1,3,9}; // 1 1 1 1 1 7 5 9  [breaking]

        int key = 3;

        for ( int i =0 ; i< arr.length ; i++){

            if (arr[i] == 3){

                arr[i] = 1;
            }
        }

        System.out.println(Arrays.toString(arr));

 /*       int index = 0;
        for (int i = 0 ; i < arr.length ; i++){

            if (arr[i] != 1){

                index = i ;
                break;
            }
        }
       int d = 0;
        for (int i = index ; i < arr.length ; i++){

            if (arr[i] == 1){

               d++;
            }
        }

        System.out.println("111 =" +index +" 22 =" +d);*/

        // do 'd' number fo right shift

        int outPut[] = new int[arr.length];  //
        int count1=0;
        for(int i = 0 ; i < arr.length ; i++){

            if (arr[i] == 1){
                count1++;
            }
        }

        for (int i = 0 ; i < count1 ;i++){

            outPut[i] = 1;
        }

        for (int i = 0 ; i < arr.length ; i++){

            if (arr[i] != 1){

                outPut[count1++] = arr[i];
            }

        }
       System.out.println(Arrays.toString(outPut));
    }
}
