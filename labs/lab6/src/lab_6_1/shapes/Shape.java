package lab_6_1.shapes;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public abstract class Shape extends JComponent {

    public Shape() {
        setPreferredSize(new Dimension(100, 100));
        setForeground(Color.RED);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(1.5F));
        paintShape(g2d);
    }

    protected abstract void paintShape(Graphics2D g2d);
}
