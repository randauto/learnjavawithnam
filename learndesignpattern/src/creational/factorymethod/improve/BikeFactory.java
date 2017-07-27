package creational.factorymethod.improve;

/**
 * Created by TuanLQ on 5/29/17.
 */
public class BikeFactory extends TransportFactory {
    @Override
    Transport create() {
        return new Bike();
    }
}
