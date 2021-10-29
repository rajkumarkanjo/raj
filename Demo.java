import java.io.IOException;

/*class Abhijit {

    public Object test()  {

        return null;
    }
}*/

interface Demo2 {

    default void add_sum(int i, int j) {
        System.out.println("SUM Demo " + i + j);
    }
}

class Demo3 {

    public void add_sum(int i, int j) {
        System.out.println("SUM Demo1 " + i + j);
    }
}

class Demo extends Demo3  implements   Demo2 {

    public static void main(String[] args) {
        Demo test1 = new Demo();
        test1.add_sum(12, 12);
    }

}

