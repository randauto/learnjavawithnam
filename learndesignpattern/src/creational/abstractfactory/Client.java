package creational.abstractfactory;

/**
 * Created by TuanLQ on 5/30/2017.
 */
public class Client {

    private static void initObject(Window window, Scrollbar scrollbar) {
        System.out.println(window.getClass().toString() + "--" + scrollbar.getClass().toString());
    }

    public static void main(String[] args) {
        Window window = new PinkWindow();
        Scrollbar scrollbar = new PinkScrollbar();
        initObject(window, scrollbar);

        window = new RedWindow();
        scrollbar = new PinkScrollbar();

        initObject(window, scrollbar);

    }
}
