package creational.singleton.improved;

/**
 * Created by TuanLQ on 5/27/17.
 */
public class Preferences {
    private static Preferences instance = null;

    protected Preferences(){}

    private synchronized static void createInstance() {
        if (instance == null) {
            instance = new Preferences();
        }
    }

    public static Preferences getInstance() {
        if (instance == null) {
            createInstance();
        }

        return instance;
    }

    public void helloSingleton() {
        System.out.println("I'm Preferences singleton class");
    }


}
