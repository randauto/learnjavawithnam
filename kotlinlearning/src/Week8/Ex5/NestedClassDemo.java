package Week8.Ex5;

/**
 * Created by TuanLQ on 5/19/2017.
 */
public class NestedClassDemo {
    public static void main(String[] args) {
        Car car = new Car();

        car.run();
        Car.Wheel wheel = new Car.Wheel();
        wheel.test(car);
    }
}
