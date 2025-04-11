import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class swingass {
    public static void main(String[] args) {
        asss as=new asss();
    }
   
}
class asss extends JFrame implements ActionListener{
    JButton but;
    JTextField jt;
    JTextField jt1;
    JTextField jt2;
    JTextField jt3;
     asss()
     {
        this.setTitle("Title");
       this.setSize(600,600);
       this.setLayout(new FlowLayout());
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       JLabel lab=new JLabel("StudentName");
       JLabel lab1=new JLabel("StudentId");
       JLabel lab2=new JLabel("Book title");
       JLabel lab3=new JLabel("Issue date");
       jt=new JTextField(null,20);
     jt1=new JTextField(null,20);
       jt2=new JTextField(null,20);
      jt3=new JTextField(null,20);
      but=new JButton("Submit");
      this.add(lab);
       this.add(jt);
       this.add(lab1);
       this.add(jt1);
       this.add(lab2);
       this.add(jt2);
       this.add(lab3);
       this.add(jt3);
       this.add(but);
       but.addActionListener(this);
       this.setVisible(true);
     }
    
    public void actionPerformed(ActionEvent e) {
      if(e.getSource()==but)
      {
       
         if(!(jt.getText().isEmpty()&&jt1.getText().isEmpty()&&jt2.getText().isEmpty()&&jt3.getText().isEmpty()))
         {
            but.setEnabled(false);
            jt.setEditable(false);
            jt1.setEditable(false);
            jt2.setEditable(false);
            jt3.setEditable(false);
             JPanel jp=new JPanel();
             JLabel lab=new JLabel("StudentName");
             JLabel lab1=new JLabel("StudentId");
             JLabel lab2=new JLabel("Book title");
             JLabel lab3=new JLabel("Issue date");
             jp.add(lab);
             jp.add(jt);
             jp.add(lab1);
             jp.add(jt1);
             jp.add(lab2);
             jp.add(jt2);
             jp.add(lab3);
             jp.add(jt3);
             JOptionPane.showConfirmDialog(null, jp,"Conformation page",JOptionPane.YES_NO_OPTION);
         }
         else{
            JOptionPane.showMessageDialog(null,"Incomplete","Error",JOptionPane.ERROR_MESSAGE);
         }
      }
    }

}