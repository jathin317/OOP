
/*
 * 2. Create a student feedback GUI form with the following:
    1. Text fields for:
        ◦ Student Name
        ◦ Course Name
    2. Radio buttons for:
        ◦ Overall Experience: Excellent, Good, Average, Poor
    3. A TextArea for additional comments.
    4. A "Submit" button that:
        ◦ Displays a summary of the feedback in a JOptionPane.
    • Add a "Clear" button to reset the form fields.

 */
import javax.swing.*;

public class FeedBackFormGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Feedback form");
        frame.setSize(500, 500);
        JLabel label1 = new JLabel("Student Name");
        JTextField studentName = new JTextField();
        JLabel label2 = new JLabel("Course Name");
        JTextField courseName = new JTextField();
        ButtonGroup rating = new ButtonGroup();
        JRadioButton excellent = new JRadioButton("Excellent");
        JRadioButton good = new JRadioButton("Good");
        JRadioButton average = new JRadioButton("Average");
        JRadioButton poor = new JRadioButton("Poor");
        rating.add(excellent);
        rating.add(good);
        rating.add(average);
        rating.add(poor);
        JTextArea comments = new JTextArea("Additional Comments");
        JButton submit = new JButton("Submit");
        JButton clear = new JButton("Clear");
        submit.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "Student name: " + studentName.getText() +
                    "\nCourse name: " + courseName.getText() +
                    "\nOverall Experience: "
                    + (excellent.isSelected() ? "Excellent"
                            : good.isSelected() ? "Good" : average.isSelected() ? "Average" : "Poor")
                    +
                    "\nAdditional Comments: " + comments.getText());
        });
        clear.addActionListener(e -> {
            studentName.setText("");
            courseName.setText("");
            comments.setText("");
            rating.clearSelection();
        });

        label1.setBounds(10, 10, 200, 20);
        studentName.setBounds(150, 10, 200, 20);
        label2.setBounds(10, 50, 200, 20);
        courseName.setBounds(150, 50, 200, 20);

        excellent.setBounds(10, 90, 100, 20);
        good.setBounds(120, 90, 100, 20);
        average.setBounds(230, 90, 100, 20);
        poor.setBounds(340, 90, 100, 20);

        comments.setBounds(10, 130, 460, 100);

        submit.setBounds(100, 250, 100, 30);
        clear.setBounds(250, 250, 100, 30);

        frame.add(label1);
        frame.add(label2);
        frame.add(studentName);
        frame.add(courseName);
        frame.add(excellent);
        frame.add(good);
        frame.add(average);
        frame.add(poor);
        frame.add(comments);
        frame.add(submit);
        frame.add(clear);

        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
