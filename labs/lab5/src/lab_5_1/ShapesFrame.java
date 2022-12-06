package lab_5_1;

import java.awt.GridLayout;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import lab_5_1.shapes.ShapeCircle;
import lab_5_1.shapes.ShapeRectangle;
import lab_5_1.shapes.ShapeTriangle;

public class ShapesFrame extends JFrame {

    public ShapesFrame() {
        // Чтобы выходило нормально из программы при нажатии на крестик
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(800, 500);
        setLayout(new GridLayout(4, 5));

        Random rand = new Random();

        for(int i = 0; i < 20; i++) {
            switch (rand.nextInt(3)) {
                case 0:
                    add(new ShapeCircle());
                    break;
                case 1:
                    add(new ShapeRectangle());
                    break;
                case 2:
                    add(new ShapeTriangle());
                    break;
            }
        }
    }

    public static void main(String[] args) {
        ShapesFrame frame = new ShapesFrame();
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
