/*1.Create a GUI form that contains the following:
    1. Text fields to input:
        ◦ Student Name
        ◦ Student ID
        ◦ Book Title
        ◦ Issue Date (as text or a date picker)
    2. A "Submit" button that:
        ◦ Displays a confirmation message using JOptionPane with the entered details.
    3.  Add basic validation to ensure no field is left empty before submitting. */

import javax.swing.*;
import java.time.LocalDate;

public class BookGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Book Issue Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(1260, 870);
        JTextField studentNameField = new JTextField("Student Name");
        JTextField studentIDField = new JTextField("Student ID");
        JTextField bookTitleField = new JTextField("Book Title");
        LocalDate currentDate = LocalDate.now();
        JTextField issueDateField = new JTextField(currentDate.toString());
        issueDateField.setEditable(false);
        JButton submitButton = new JButton("Submit");
        studentNameField.setBounds(50, 50, 200, 30);
        studentIDField.setBounds(50, 100, 200, 30);
        bookTitleField.setBounds(50, 150, 200, 30);
        issueDateField.setBounds(50, 200, 200, 30);
        submitButton.setBounds(50, 250, 100, 30);
        frame.add(studentNameField);
        frame.add(studentIDField);
        frame.add(bookTitleField);
        frame.add(issueDateField);
        frame.add(submitButton);
        frame.setVisible(true);
        JOptionPane optionPane = new JOptionPane();
        submitButton.addActionListener(e -> {
            String studentName = studentNameField.getText();
            String studentID = studentIDField.getText();
            String bookTitle = bookTitleField.getText();
            String issueDate = issueDateField.getText();

            if (studentName.isEmpty() || studentID.isEmpty() || bookTitle.isEmpty() || issueDate.isEmpty()) {
                JOptionPane.showMessageDialog(optionPane, "Please fill in all fields");
            } else {
                JOptionPane.showMessageDialog(optionPane, "Student Name: " + studentName + "\n" + "Student Id: "
                        + studentID + "\n" + "Book Title: " + bookTitle + "\n" + "Issue Date: " + issueDate);
                frame.setVisible(false);
                JFrame newFrame = new JFrame("Submitted");
                newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                newFrame.setSize(300, 200);
                newFrame.setLayout(null);
                JLabel successLabel = new JLabel("Submission Successful!");
                successLabel.setBounds(50, 50, 200, 30);
                newFrame.add(successLabel);
                newFrame.setVisible(true);
            }
        });
    }
}
