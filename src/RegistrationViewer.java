import javax.swing.*; 
import java.awt.*;
import java.awt.event.*;

public class RegistrationViewer extends Viewer {
    JLabel lRegistrationForm,lFullName,lStudentID, lEmailAddress, lPassword, lConfirmPassword, lPhoneNumber, lMailAddress;
    JTextField t1,t2,t3,t4,t5;
    JButton btn1,btn2;
    JPasswordField p1,p2;
    
    RegistrationViewer(){
       
        setSize(700,700);
        setLayout(null);
        lRegistrationForm = new JLabel("Registration Form");
        lRegistrationForm.setForeground(Color.blue);
        lRegistrationForm.setFont(new Font("Serif", Font.BOLD, 20));
        
        lFullName = new JLabel("Full Name: ");
        lStudentID = new JLabel("Student ID: ");
        lEmailAddress = new JLabel("Email Address: ");
        lPassword = new JLabel("Create Your Password: ");
        lConfirmPassword = new JLabel("Confirm Password: ");
        lPhoneNumber = new JLabel("Phone Number: ");
        lMailAddress = new JLabel("Mailing Address: ");
        
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        p1 = new JPasswordField();
        p2 = new JPasswordField();
        t4 = new JTextField();
        t5 = new JTextField();
        btn1 = new JButton("Submit Form");
        btn2 = new JButton("Cancel");
        
        lRegistrationForm.setBounds(100, 30, 400, 30);
        lFullName.setBounds(80, 70, 200, 30);
        lStudentID.setBounds(80,110,200,30);
        lEmailAddress.setBounds(80, 150, 200, 30);
        lPassword.setBounds(80, 150, 200, 30);
        lConfirmPassword.setBounds(80, 190, 200, 30);
        lPhoneNumber.setBounds(80, 310, 200, 30);
        lMailAddress.setBounds(80, 270, 200, 30);
        t1.setBounds(300,70,200,30);
        t2.setBounds(300, 110, 200, 30);
        t3.setBounds(300, 110, 200, 30);
        p1.setBounds(300, 150, 200, 30);
        p2.setBounds(300,190,200,30);
        t4.setBounds(300, 310, 200, 30);
        t5.setBounds(300, 270, 200, 30);
        btn1.setBounds(50, 350, 100, 30);
        btn2.setBounds(170, 350, 100, 130);
        
        add(lRegistrationForm);
        add(lFullName);
        add(t1);
        add(lStudentID);
        add(t2);
        add(lEmailAddress);
        add(t3);
        add(lPassword);
        add(p1);
        add(lConfirmPassword);
        add(p2);
        add(lPhoneNumber);
        add(t4);
        add(lMailAddress);
        add(t5);
        add(btn1);
        add(btn2);
        setVisible(true);
    }
    /* 
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
    }*/
}
