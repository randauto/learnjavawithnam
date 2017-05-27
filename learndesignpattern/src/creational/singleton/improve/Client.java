package creational.singleton.improve;

/**
 * Created by TuanLQ on 5/27/17.
 */
public class Client {
    public static void main(String[] args) {
        Preferences.getInstance().helloSingleton();

        MyPreferences.getInstance().helloSingleton();
    }
}
