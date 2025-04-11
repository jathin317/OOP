package week11;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class swing3as {
    public static void main(String[] args) {
        last lass=new last();
    }
}
class last extends JFrame implements ActionListener{
    JTextField jt;
    JTextField jt1;
    JPasswordField jp;
    JButton jb;
    last()
    {
        this.setTitle("Login Page");
        this.setSize(550,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        JLabel jl=new JLabel("Name");
        JLabel jl1=new JLabel("Email");
        JLabel jl2=new JLabel("Password");
        jt=new JTextField(20);
        jt1=new JTextField(20);
        jp=new JPasswordField(20);
        jb=new JButton("Submit");
        this.add(jl);
        this.add(jt);
        this.add(jl1);
        this.add(jt1);
        this.add(jl2);
        this.add(jp);
        this.add(jb);
        jb.addActionListener(this);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==jb)
       {
         if(!(jt.getText().isEmpty()))
         {
            if(!(jt1.getText().isEmpty())){
            jb.setEnabled(false);
               jt.setEditable(false);
               jt1.setEditable(false);
               jp.setEditable(false);
               String s=String.valueOf(jp.getPassword());
                String p=jt1.getText();
               if(p.contains("@")&&p.contains(".com"))
               {
                if(s.length()>=6)
                {
                    JPanel panel=new JPanel();
                    panel.add(jt);
                    panel.add(jt1);
                    panel.add(jp);
                    JOptionPane.showConfirmDialog(null,panel,"Confirm page",JOptionPane.YES_NO_OPTION);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Error found in password","Error",JOptionPane.ERROR_MESSAGE);
                } 
               }
               else{
                JOptionPane.showMessageDialog(null,"Error found in Email","Error",JOptionPane.ERROR_MESSAGE);
               }
            }
            else{
                JOptionPane.showMessageDialog(null,"Error Incomplete","ERROR",JOptionPane.ERROR_MESSAGE);
             }
         }
         else{
            JOptionPane.showMessageDialog(null,"Error Incomplete","ERROR",JOptionPane.ERROR_MESSAGE);
         }
       }
    }
}
