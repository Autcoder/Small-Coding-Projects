package Hangman;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class HangMan extends JFrame implements ActionListener {

    // Add instance variables for the game logic here
    private String wordToGuess;
    private Set<Character> guessedLetters = new HashSet<>();
    private int wrongGuesses = 0;
    private JLabel label;
    private JTextField textField;
    private JTextArea textArea;
    private JButton button;

    public HangMan() {
        super("Hangman");
        // Initialize GUI components
        button = new JButton("Guess");
        button.addActionListener(this);
        label = new JLabel("Enter your guess:");
        textField = new JTextField(10);
        textArea = new JTextArea(10, 10);
        textArea.setEditable(false);
        HangMan game = new HangMan();
        JButton button = new JButton("Guess");
        button.addActionListener(this);
        JLabel label = new JLabel("Enter your guess:");
        JTextField textField = new JTextField(10);
        JTextArea textArea = new JTextArea(10, 10);
        textArea.setEditable(false);
        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(textField);
        panel.add(button);
        add(panel, BorderLayout.NORTH);
        add(textArea, BorderLayout.CENTER);
        setSize(300, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        startNewGame();
        updateTextArea();
    }

    public void startNewGame() {
        // Choose a random word
        wordToGuess = "hello"; // testing purposes
        guessedLetters.clear();
        wrongGuesses = 0;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == button) {
            String guess = textField.getText().toLowerCase();
            if (guess.length() != 1 || !Character.isLetter(guess.charAt(0))) {
                // Wrong input
                JOptionPane.showMessageDialog(this, "Please enter a single letter.");
            } else {
                char letter = guess.charAt(0);
                if (guessedLetters.contains(letter)) {
                    // Already guessed letters
                    JOptionPane.showMessageDialog(this, "You already guessed that letter.");
                } else {
                    guessedLetters.add(letter);
                    if (wordToGuess.contains(guess)) {
                        // Update display
                        updateTextArea();
                        if (isGameWon()) {
                            JOptionPane.showMessageDialog(this, "Congratulations! You won!");
                            startNewGame();
                        }
                    } else {
                        wrongGuesses++;
                        updateTextArea();
                        if (isGameLost()) {
                            JOptionPane.showMessageDialog(this, "You lost! The word was " + wordToGuess);
                            startNewGame();
                        }
                    }
                }
                textField.setText(""); // Clear the input field
            }
        }
    }

    // Update the text area
    private void updateTextArea() {
        StringBuilder display = new StringBuilder();
        for (char c : wordToGuess.toCharArray()) {
            if (guessedLetters.contains(c)) {
                display.append(c);
            } else {
                display.append('_');
            }
            display.append(' ');
        }
        textArea.setText(display.toString() + "\n\nGuessed Letters: " + guessedLetters + "\n\nWrong Guesses: " + wrongGuesses);
    }

    // Check if player won
    private boolean isGameWon() {
        for (char c : wordToGuess.toCharArray()) {
            if (!guessedLetters.contains(c)) {
                return false;
            }
        }
        return true;
    }

    // Check if player lost
    private boolean isGameLost() {
        return wrongGuesses >= 6;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new HangMan());
    }
}