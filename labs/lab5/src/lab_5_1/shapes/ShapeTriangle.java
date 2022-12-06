package lab_5_1.shapes;

import java.awt.Graphics2D;

public class ShapeTriangle extends Shape {

    @Override
    protected void paintShape(Graphics2D g2d) {
        g2d.drawPolygon(
                new int[] { (getWidth() - 4) / 2, 4, getWidth() - 4 },
                new int[] { 4, getHeight() - 4, getHeight() - 4 },
                3
        );
    }
}
