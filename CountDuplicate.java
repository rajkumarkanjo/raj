import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountDuplicate {


    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 32, 10,49);

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < myList.size(); i++) {

            if (map.containsKey(myList.get(i))) {

                map.put(myList.get(i), myList.get(i) + 1);
            } else {
                map.put(myList.get(i), 1);
            }
        }
        for (Map.Entry<Integer, Integer> mapValue : map.entrySet()) {

            if (mapValue.getValue() > 1) {

                System.out.print(mapValue.getKey() +" ");

            }
        }
    }

}
