package ru.mirea.lab_6_2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class CompassFrame extends JFrame {

    public CompassFrame() {
        // Завершить программу после закрытия окна
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // Размер окна
        setSize(800, 500);
        // Расположение элементов в окне. Я хочу располагать элементы в определённых областях окна
        // (центр, верх, низ, etc.)
        setLayout(new BorderLayout());

        // Добавляем подпанели на основную панель
        add(createPanel(" ", Color.RED), BorderLayout.CENTER);

        add(createPanel("Джидда", Color.ORANGE), BorderLayout.WEST);
        add(createPanel("Абха", Color.GREEN), BorderLayout.EAST);
        add(createPanel("", Color.MAGENTA), BorderLayout.NORTH);
        add(createPanel("Дахране", Color.CYAN), BorderLayout.SOUTH);
    }

    private JPanel createPanel(String name, Color color) {
        // Создаём панель определённого размера и цвета
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(128, 128));
        panel.setBackground(color);

        // Добавляем название на панель
        JLabel panelName = new JLabel(name);
        panel.add(panelName);

        // Добавляем обработчик событий. Это анонимный класс (он не имеет имени и создание его происходит в момент
        // инициализации объекта - здесь)
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                // Показываем сообщение
                JOptionPane.showMessageDialog(null, "Добро пожаловать в " + name);
            }
        });

        return panel;
    }

    public static void main(String[] args) {
        CompassFrame frame = new CompassFrame();
        frame.pack(); // Сжать все элементы до prefferedSize и сжать форму до минимально возможной
        frame.setLocationRelativeTo(null); // Расположить окно в центре экрана
        frame.setVisible(true); // Сделать окно видимым
    }
}
