package creational.abstractfactory.improve;

/**
 * Created by TuanLQ on 5/30/2017.
 */
public class PinkFactory extends AbstractFactory {
    @Override
    Window createWindow() {
        return new PinkWindow();
    }

    @Override
    Scrollbar createScrollbar() {
        return new PinkScrollbar();
    }
}
