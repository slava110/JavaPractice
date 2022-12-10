package ru.mirea.lab_6_1;

import java.awt.Color;
import java.awt.GridLayout;
import java.text.NumberFormat;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.text.NumberFormatter;

public class GuesserFrame extends JFrame {
    private final Random rand = new Random();
    private final JTextField guessField;
    private final JButton guessButton;
    /**
     * Число, которое надо угадать
     */
    private int toGuess = rand.nextInt(20);
    /**
     * Попытки угадывания
     */
    private int tries = 3;

    public GuesserFrame() {
        // Завершить программу после закрытия окна
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // Размер окна
        setSize(800, 500);
        // Расположение элементов в окне. Я хочу сетку размером 3 на 1
        setLayout(new GridLayout(3, 1));

        // Чёрная магия со StackOverflow
        NumberFormatter nf = new NumberFormatter(NumberFormat.getIntegerInstance());
        nf.setValueClass(Integer.class);
        nf.setMinimum(0);
        nf.setMaximum(20);
        nf.setAllowsInvalid(false);

        guessField = new JFormattedTextField(nf);
        guessField.setBackground(Color.MAGENTA); // Проверяющей понравится
        guessField.setText("0"); // Фикс пустого поля
        add(guessField);

        // Конец чёрной магии со StackOverflow

        guessButton = new JButton("Tries left: " + tries); // Создаём элемент-кнопку
        guessButton.setBackground(Color.PINK); // Пусть будет розовой
        // Добавляем обработчик события нажатия на кнопку. Т.е. то, что будет происходить при нажатии на кнопку
        // В качестве параметра передаём лямбда-выражение
        guessButton.addActionListener(e -> {
            // Парсим число из строки
            int guessed = Integer.parseInt(guessField.getText());
            if(guessed > toGuess) {
                // Сообщение на экране
                JOptionPane.showMessageDialog(null, "It's too big!", "Wrong number!", JOptionPane.WARNING_MESSAGE);
            } else if(guessed < toGuess) {
                JOptionPane.showMessageDialog(null, "It's too low!", "Wrong number!", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "You won!", "We have a winner!", JOptionPane.WARNING_MESSAGE);
                guessButton.setText("You won");
                guessField.setEnabled(false);
                guessButton.setEnabled(false);
                return;
            }
            tries--;
            if(tries == 0) {
                guessButton.setText("You lost");
                guessField.setEnabled(false);
                guessButton.setEnabled(false);
            } else {
                guessButton.setText("Tries left: " + tries);
            }
        });
        add(guessButton);

        // Кнопка перезапуска игры
        JButton restartButton = new JButton("Restart");
        restartButton.addActionListener(e -> {
            toGuess = rand.nextInt(20);
            tries = 3;
            guessField.setEnabled(true);
            guessButton.setEnabled(true);
            guessButton.setText("Tries left: " + tries);
        });
        restartButton.setBackground(Color.MAGENTA);
        add(restartButton);
    }

    public static void main(String[] args) {
        GuesserFrame frame = new GuesserFrame();
        frame.pack(); // Сжать все элементы до prefferedSize и сжать форму до минимально возможной
        frame.setLocationRelativeTo(null); // Расположить окно в центре экрана
        frame.setVisible(true); // Сделать окно видимым
    }
}
