package AccessAndStatic;

class Singleton {
    private  static Singleton one;
    private Singleton() {
    }

    public static Singleton getInstance() {
        if (one == null){
            return new Singleton();
        }else {
            return one;
        }
    }
}

public class SingletonBasic {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
    }
}
