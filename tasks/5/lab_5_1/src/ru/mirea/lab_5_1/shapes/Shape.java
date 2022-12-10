package ru.mirea.lab_5_1.shapes;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

/**
 * Является наследником класса JComponent
 * Т.е. является компонентом как JButton, JLabel, и прочие
 * Переопределяется метод paint, чтобы
 */
public abstract class Shape extends JComponent {

    public Shape() {
        setPreferredSize(new Dimension(100, 100));
        setForeground(Color.RED);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        // Приведение к типу Graphics2D, т.к. в метод передаётся Graphics2D
        // П-п-п-полиморфизм!
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(1.5F)); // Размер кисти
        paintShape(g2d);
    }

    /**
     * Переопределяется в классах-наследниках для рисования определённой фигуры
     * @param g2d графика
     */
    protected abstract void paintShape(Graphics2D g2d);
}
