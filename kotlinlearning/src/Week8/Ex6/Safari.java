package Week8.Ex6;

/**
 * Created by TuanLQ on 5/21/17.
 */
public class Safari {
    public static void main(String[] args) {
        Cat cat = new Tiger();
        cat.eat();

        Tiger tiger = (Tiger) cat;
        tiger.eat("Rabbit");
    }
}
