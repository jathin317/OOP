/*3. Create a Swing application for user registration. The form should include:
    • JTextField for Name
    • JTextField for Email
    • JPasswordField for Password
    • JButton for Submit
Validation Requirements:
    • Name must not be empty
    • Email must contain "@" and ".com"
    • Password must be at least 6 characters
On clicking Submit, show a JOptionPane:
    • If all fields are valid: “Registration Successful”
    • Otherwise, show an appropriate error message.
     */


import javax.swing.*;

public class RegistrationGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("User Registration");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(50, 50, 100, 30);
        JTextField nameField = new JTextField();
        nameField.setBounds(150, 50, 200, 30);
        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(50, 100, 100, 30);
        JTextField emailField = new JTextField();
        emailField.setBounds(150, 100, 200, 30);
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 150, 100, 30);
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(150, 150, 200, 30);
        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(150, 200, 100, 30);
        submitButton.addActionListener(e -> {
            if (nameField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Name cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (!emailField.getText().contains("@") || !emailField.getText().endsWith(".com")) {
                JOptionPane.showMessageDialog(frame, "Email must contain '@' and end with '.com'", "Error",
                        JOptionPane.ERROR_MESSAGE);
            } else if (passwordField.getPassword().length < 6) {
                JOptionPane.showMessageDialog(frame, "Password must be at least 6 characters", "Error",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                frame.setVisible(false);
                JOptionPane.showMessageDialog(frame, "Registration Successful", "Success",
                        JOptionPane.INFORMATION_MESSAGE);

            }
        });
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(emailLabel);
        frame.add(emailField);
        frame.add(passwordLabel);
        frame.add(passwordField);
        frame.add(submitButton);
        frame.setVisible(true);
    }
}