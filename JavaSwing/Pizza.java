package JavaSwing;
import java.awt.Color;

import javax.swing.*;
public class Pizza {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Pizza");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1960,1080);
        frame.setLayout(null);
        JLabel label = new JLabel("ENTER YOUR NAME");
        label.setBounds(100,100,500,50);
        JTextField textField = new JTextField();
        textField.setBounds(100,150,500,50);
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem("small");
        comboBox.addItem("medium");
        comboBox.addItem("large");
        comboBox.setBounds(100,200,500,50);
        JRadioButton radioButton1 = new JRadioButton("Thin crust");
        JRadioButton radioButton2 = new JRadioButton("Thick crust");
        JRadioButton radioButton3 = new JRadioButton("Cheese burst");
        radioButton1.setBounds(100,250,200,50);
        radioButton2.setBounds(300,250,200,50);
        radioButton3.setBounds(500,250,200,50);
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
        buttonGroup.add(radioButton3);
        JButton button = new JButton("Order now");
        button.setBounds(100,300,500,50);
        button.addActionListener(e->{
            String message="Name: " + textField.getText() + "\n" +
                    "Size: " + comboBox.getSelectedItem() + "\n" +
                    "Crust: ";
            if (radioButton1.isSelected()) {
                message += "Thin crust";
            } else if (radioButton2.isSelected()) {
                message += "Thick crust";
            } else if (radioButton3.isSelected()) {
                message += "Cheese burst";
            }
            JOptionPane.showMessageDialog(frame, message);
        });
        frame.add(label);
        frame.add(textField);
        frame.add(comboBox);
        frame.add(radioButton1);
        frame.add(radioButton2);
        frame.add(radioButton3);
        frame.add(button);
        label.setForeground(Color.GREEN);
        textField.setBackground(Color.YELLOW);
        comboBox.setBackground(Color.YELLOW);
        radioButton1.setBackground(Color.YELLOW);
        radioButton2.setBackground(Color.YELLOW);
        radioButton3.setBackground(Color.YELLOW);
        button.setBackground(Color.YELLOW);
        frame.getContentPane().setBackground(Color.RED);
        frame.setVisible(true);
        
    }
}
