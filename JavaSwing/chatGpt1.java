package JavaSwing;
import javax.swing.*;
public class chatGpt1
{
    public static void main(String args[])
    {
        JFrame f= new JFrame("Hello");
        f.setSize(1960,1080);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel l= new JLabel("Hello World");
        l.setBounds(600, 200, 300, 100);
        f.add(l);
        f.setVisible(true);
        f.setLayout(null);
        
    }
}

