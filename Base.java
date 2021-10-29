public class Base {

    Base(){
        this("1");
    }

    Base(String s){

        System.out.println("super-"+s);
    }
}

class Child extends  Base {


    Child(String s) {


        System.out.println("sub-" + s);

    }

    public static void main(String[] args) {

        Child obj = new Child("2");

    }

}
