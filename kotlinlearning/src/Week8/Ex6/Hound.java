package Week8.Ex6;

/**
 * Created by TuanLQ on 5/20/17.
 */
public class Hound extends Dog {
    public Hound(String name) {
        super(name);
    }

    public void bark() {
        System.out.println("Gruh Gruh...");
    }

    public void hunt() {
        System.out.println("Hunting...");
    }
}
