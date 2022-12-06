package lab_5_1.shapes;

import java.awt.Graphics2D;

public class ShapeRectangle extends Shape {

    @Override
    protected void paintShape(Graphics2D g2d) {
        g2d.drawRect(4, 4, getWidth() - 4, getHeight() - 4);
    }
}
