package week11;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class swingass1 {
    public static void main(String[] args) {
        assign ass=new assign();
    }
}
class assign extends JFrame implements ActionListener{
    JTextField jt;
    JTextField jt1;
    JRadioButton jr;
    JRadioButton jr1;
    JRadioButton jr2;
    JRadioButton jr3;
    JButton but;
    JButton but1;
    ButtonGroup bg;
   assign()
   {
       this.setSize(600,600);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setLayout(new FlowLayout());
       JLabel jl=new JLabel("Student Name");
       JLabel jl1=new JLabel("Course Name");
       jr=new JRadioButton("Excellent");
       jr1=new JRadioButton("Good");
       jr2=new JRadioButton("Average");
       jr3=new JRadioButton("Poor");
        bg=new ButtonGroup();
       bg.add(jr);
       bg.add(jr1);
       bg.add(jr2);
       bg.add(jr3);
       jt=new JTextField(20);
       jt1=new JTextField(20);
       but=new JButton("Submit");
       but1=new JButton("Clear");
       this.add(jl);
      this.add(jt);
      this.add(jl1);
      this.add(jt1);
      this.add(jr);
      this.add(jr1);
      this.add(jr2);
      this.add(jr3);
      this.add(but);
      this.add(but1);
      but.addActionListener(this);
      but1.addActionListener(this);
       this.setVisible(true);
   }
    @Override
    public void actionPerformed(ActionEvent e) {
          if(e.getSource()==but)
          {
            if(!(jt.getText().isEmpty()&&jt1.getText().isEmpty())&&(jr.isSelected()||jr1.isSelected()||jr2.isSelected()))
            {
                but.setEnabled(false);
                jt.setEditable(false);
                jt1.setEditable(false);
                jr.setEnabled(false);
                jr1.setEnabled(false);
                jr2.setEnabled(false);
                jr3.setEnabled(false);
                 JPanel panel=new JPanel();
                 panel.add(jt);
                 panel.add(jt1);
                 panel.add(jr);
                 panel.add(jr1);
                 panel.add(jr2);
                 panel.add(jr3);
              JOptionPane.showConfirmDialog(null,panel,"Confirm page",JOptionPane.YES_NO_OPTION);
            }
            else{
                JOptionPane.showMessageDialog(null,"Error incomplete","ERROR",JOptionPane.ERROR_MESSAGE);
            }
          }
          else if(e.getSource()==but1)
          {
             jt.setText("");
             jt1.setText("");
             bg.clearSelection();
          }
    }

}
