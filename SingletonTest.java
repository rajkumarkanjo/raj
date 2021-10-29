


class Singleton implements Cloneable{

    // Lazy initiliazation
    public static Singleton instance;

    private Singleton(){}

    public static  Singleton getInstance(){

        if (instance == null){

            synchronized (Singleton.class){

                try {
                    if  (instance == null){
                        instance = new Singleton();
                    }
                }catch (Exception e){
                    System.out.println(e);
                }
            }

        }
        return  instance;
    }
    // for serilzation
    protected Object readResolve() {
        return getInstance();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        /*
         * Here forcibly throws the exception for preventing to be cloned
         */
        throw new CloneNotSupportedException();
        // return super.clone();                  // OR we can return the already present  :: return getInstance();
    }
}
public class SingletonTest {


    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();

        System.out.println(singleton);
        System.out.println(singleton1);

    }


}
