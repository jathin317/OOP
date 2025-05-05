package JavaSwing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class greeting {
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Greeting");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        
        JTextField textField = new JTextField("Enter your name here");
        textField.setBounds(50, 50, 200, 30);
        frame.add(textField);
        frame.setLayout(null);
        JButton button = new JButton("Greet me");
        button.setBounds(50, 80, 100, 30);
        frame.add(button);
        frame.setVisible(true);

        button.addActionListener(e -> {
            JLabel label = new JLabel("Hello, " + textField.getText() + "!");
            label.setBounds(50, 100, 200, 30);
            frame.repaint();
            frame.add(label);
        });
    }
}
