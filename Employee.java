

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Employee {


}
class Accountant extends Employee{


}

class Main{

    public static void main(String[] args) {

       // List<Employee> enmp = new ArrayList<Accountant>();


        Integer[] arr = new Integer[]{10,3,10,2,20};
        List<Integer> list = Arrays.asList(arr);

        OptionalDouble avg = list.stream().mapToInt(n-> n*n).filter(n -> n >=10).average();

        if (avg.isPresent()){
            System.out.println(avg.getAsDouble());
        }

    }

}