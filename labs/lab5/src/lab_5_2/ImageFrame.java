package lab_5_2;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

import lab_5_1.ShapesFrame;
import lab_5_1.shapes.ShapeCircle;
import lab_5_1.shapes.ShapeRectangle;
import lab_5_1.shapes.ShapeTriangle;

public class ImageFrame extends JFrame {

    public ImageFrame(String imagePath) {
        // Чтобы выходило нормально из программы при нажатии на крестик
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(800, 500);
        setLayout(new BorderLayout());

        // Создаём imageIcon объект и передаём путь к изображению в качестве аргумента
        ImageIcon imageIcon = new ImageIcon(imagePath);

        // Создаём JLabel. Да, он умеет показывать не только текст, но и изображения
        JLabel imageLabel = new JLabel(imageIcon);

        add(imageLabel);
    }

    public static void main(String[] args) {
        // Первый аргумент должен быть путём к изображению
        if(args.length < 1) {
            System.out.println("Expected image path as first argument!");
            return;
        }

        File imageFile = new File(args[0]);

        // Проверка на существование и доступность файла
        if(!imageFile.exists() || !imageFile.canRead()) {
            System.out.println("Image not found!");
            return;
        }

        ImageFrame frame = new ImageFrame(args[0]);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
