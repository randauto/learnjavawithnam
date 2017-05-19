package Week8.Ex4;

import java.awt.*;

/**
 * Created by TuanLQ on 5/19/2017.
 */
public class Graphics {
    protected Color paintColor;
    protected float scale;
    protected float strokeThickness;
    protected Font font;

    protected int x;
    protected int y;

    public Graphics(float scale) {
        this.scale = scale;
    }

    public void draw(int x, int y, Rectangle rect) {
        rect.paint(x, y);
    }
}
