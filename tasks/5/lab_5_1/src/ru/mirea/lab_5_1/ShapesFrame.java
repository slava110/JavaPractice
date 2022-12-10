package ru.mirea.lab_5_1;

import java.awt.GridLayout;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import ru.mirea.lab_5_1.shapes.ShapeCircle;
import ru.mirea.lab_5_1.shapes.ShapeRectangle;
import ru.mirea.lab_5_1.shapes.ShapeTriangle;

public class ShapesFrame extends JFrame {

    public ShapesFrame() {
        // Завершить программу после закрытия окна
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(800, 500);
        // Расположение элементов в окне. Я хочу сетку размером 4 на 5
        setLayout(new GridLayout(4, 5));

        // Создание объекта случайного генератора чисел
        Random rand = new Random();

        // 20 раз генерируем случайное число в диапазоне [0..3] и добавляем на форму один из 3 элементов
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
