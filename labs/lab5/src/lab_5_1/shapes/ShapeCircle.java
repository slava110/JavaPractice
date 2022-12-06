package lab_5_1.shapes;

import java.awt.Graphics2D;

public class ShapeCircle extends Shape {

    @Override
    public void paintShape(Graphics2D g2d) {
        g2d.drawOval(4, 4, getWidth() - 4, getHeight() - 4);
    }
}
