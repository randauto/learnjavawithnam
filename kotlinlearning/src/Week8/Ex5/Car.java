package Week8.Ex5;

/**
 * Created by TuanLQ on 5/19/2017.
 */
public class Car {
    private int weight;
    private static String brand;

    public void run() {
        System.out.println("Run Car!!!");
    }

    static class Wheel {
        private static int spokes;
        private String name;

        public void test(Car car) {
            car.weight = 5000;
            System.out.println("car's weight is: " + car.weight);
        }
    }

}
