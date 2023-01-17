import javax.swing.*; 
import java.awt.*;
import java.awt.event.*;

public class Registration extends JFrame implements ActionListener {
    JLabel l1,l2,l3,l4,l5,l6,l7,l8;
    JTextField t1,t2,t3,t4,t5;
    JButton btn1,btn2;
    JPasswordField p1,p2;
    
    Registration(){
        setVisible(true);
        setSize(700,700);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Registration");
        l1 = new JLabel("Registration Form");
        l1.setForeground(Color.blue);
        l1.setFont(new Font("Serif", Font.BOLD, 20));
        
        l2 = new JLabel("Full Name: ");
        l3 = new JLabel("Student ID: ");
        l4 = new JLabel("Email Address: ");
        l5 = new JLabel("Create Your Password: ");
        l6 = new JLabel("Confirm Password: ");
        l7 = new JLabel("Phone Number: ");
        l8 = new JLabel("Mailing Address: ");
        
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        p1 = new JPasswordField();
        p2 = new JPasswordField();
        t4 = new JTextField();
        t5 = new JTextField();
        btn1 = new JButton("Submit Form");
        btn2 = new JButton("Cancel");
        
        l1.setBounds(100, 30, 400, 30);
        l2.setBounds(80, 70, 200, 30);
        l3.setBounds(80,110,200,30);
        l4.setBounds(80, 150, 200, 30);
        l5.setBounds(80, 150, 200, 30);
        l6.setBounds(80, 190, 200, 30);
        l7.setBounds(80, 310, 200, 30);
        l8.setBounds(80, 270, 200, 30);
        t1.setBounds(300,70,200,30);
        t2.setBounds(300, 110, 200, 30);
        t3.setBounds(300, 110, 200, 30);
        p1.setBounds(300, 150, 200, 30);
        p2.setBounds(300,190,200,30);
        t4.setBounds(300, 310, 200, 30);
        t5.setBounds(300, 270, 200, 30);
        btn1.setBounds(50, 350, 100, 30);
        btn2.setBounds(170, 350, 100, 130);
        
        add(l1);
        add(l2);
        add(t1);
        add(l3);
        add(t2);
        add(l4);
        add(t3);
        add(l5);
        add(p1);
        add(l6);
        add(p2);
        add(l7);
        add(t4);
        add(l8);
        add(t5);
        add(btn1);
        add(btn2);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == btn1);
        {
            int x = 0;
            String s1 = t1.getText();
            String s2 = t2.getText();
            String s3 = t3.getText();
            char[] s4 = p1.getPassword();
            char[] s5 = p2.getPassword();
            String s8 = new String(s4);
            String s9 = new String(s5);
            String s6 = t4.getText();
            String s7 = t5.getText();
        }
    }
    public static void main(String arr[]){
        new Registration();
    }
}
