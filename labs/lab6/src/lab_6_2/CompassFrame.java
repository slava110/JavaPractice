package lab_6_2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.NumberFormat;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.text.NumberFormatter;

import lab_6_1.GuesserFrame;

public class CompassFrame extends JFrame {

    public CompassFrame() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(800, 500);
        setLayout(new BorderLayout());

        add(createPanel("A ", Color.RED), BorderLayout.CENTER);

        add(createPanel("Джидда", Color.ORANGE), BorderLayout.WEST);
        add(createPanel("Абха", Color.GREEN), BorderLayout.EAST);
        add(createPanel("B", Color.MAGENTA), BorderLayout.NORTH);
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

        // Добавляем обработчик событий. Это анонимный класс (не имеет имени и создание его происходит в момент
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
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
