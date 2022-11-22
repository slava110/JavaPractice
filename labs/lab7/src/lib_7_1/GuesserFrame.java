package lib_7_1;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;
import javax.swing.text.NumberFormatter;

public class GuesserFrame extends JFrame {
    private final Random rand = new Random();
    private final JTextField guessField;
    private final JButton guessButton;
    private int toGuess = rand.nextInt(20);
    private int tries = 3;

    public GuesserFrame() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(800, 500);
        setLayout(new GridLayout(3, 1));

        NumberFormatter nf = new NumberFormatter(NumberFormat.getIntegerInstance());
        nf.setValueClass(Integer.class);
        nf.setMinimum(0);
        nf.setMaximum(20);
        nf.setAllowsInvalid(false);

        guessField = new JFormattedTextField(nf);
        guessField.setBackground(Color.MAGENTA);
        add(guessField);

        guessButton = new JButton("Tries left: " + tries);
        guessButton.setBackground(Color.PINK);
        guessButton.addActionListener(e -> {
            int guessed = Integer.parseInt(guessField.getText());
            if(guessed > toGuess) {
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
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
