package swing_link;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class swing_example {


    private JPanel panel1;
    private JButton registerButton;
    private JButton loginButton;
    private JLabel password;
    private JLabel user;
    private JTextField username_field;
    private JTextField password_field;

    public swing_example() {
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        password_field.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello World");
        frame.setContentPane(new swing_example().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }




}
