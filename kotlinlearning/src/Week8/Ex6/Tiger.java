package Week8.Ex6;

/**
 * Created by TuanLQ on 5/21/17.
 */
public class Tiger extends Cat {
    private String name;
    @Override
    public void eat() {
        System.out.println("I eat buffer, cow and deer.");
    }

    public void eat(String food) {
        super.eat();
        System.out.println("Beside I eat " + food);
    }
}
