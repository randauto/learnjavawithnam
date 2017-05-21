package Week8.Ex5;

/**
 * Created by TuanLQ on 5/21/17.
 */
public abstract class AbstractCar {
    private String name;
    private int length;
    private int width;
    private String color;
    private int maxSpeed;
    private int seats;

    abstract void start();
    abstract void stop();
    abstract void brake();
    abstract void accelerate();
    abstract void goAhead();
    abstract void turnLeft();
    abstract void turnRight();



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    class Engine {
        private int version;
        private String manufactuner;
        private String power;
        private int cylinders;

        public void start() {

        }

        public void stop() {

        }

        public void gearUp() {

        }

        public void gearDown() {

        }

    }
}
