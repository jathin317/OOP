import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ColorChange {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Color Change");
        frame.setLayout(null);
        JButton button = new JButton("Change Color");
        button.setBounds(50, 50, 150, 50);
        frame.add(button);
        JColorChooser colorChooser = new JColorChooser();
        colorChooser.setBounds(50, 120, 450, 300);
        colorChooser.setVisible(false);
        frame.add(colorChooser);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                colorChooser.setVisible(true);
            }
        });
        colorChooser.getSelectionModel().addChangeListener(e -> {
            Color selectedColor = colorChooser.getColor();
            frame.getContentPane().setBackground(selectedColor);
        });
        frame.setSize(600, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
