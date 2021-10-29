
public class SecondHeighest {


    public static void main(String[] args) {


        int arr[] = {8, 5, 10, 11, 12, 12, 11,15};  // 10 12

        int max1 = arr[0]; // 8
        int max2 = arr[0]; // 5

        for (int i = 0; i < arr.length; i++) {

            if (max1 < arr[i]) {
                max1 = arr[i];
            }

        }

        for (int i = 0; i < arr.length; i++) {

            if (max2 < max1 && max2 < arr[i] && arr[i] < max1) {

                max2 = arr[i];
            }
        }
        System.out.println("2nd max = " + max2);
    }

}

