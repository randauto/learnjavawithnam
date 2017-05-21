package Week8.Ex6;

/**
 * Created by TuanLQ on 5/20/17.
 */
public class Dragon implements Animal {
    protected String name = "A";

    public Dragon(String name) {
        this.name = name;
    }

    @Override
    public void move() {
        System.out.println("The dragon " + name + " is flying");
    }

    public static void main(String[] args) {
        new Dragon("B").move();
    }
}
