package MainSystem;
import java.awt.*; 
import javax.swing.*;  
import java.awt.event.*;  
import java.lang.Exception; 

public class FacultyLoginViewer extends Viewer { 

    JLabel labelID, labelPassword;
    JTextField tfID,tfPassword;
    public JButton btnSubmit;
    GridBagConstraints GridBag = new GridBagConstraints();
    JPanel p1,p2, p3;

    String name, password;

    public FacultyLoginViewer()
    {
        p1 = new JPanel();
        p1.add(labelID = new JLabel("Faculty ID : "));
        p1.add(tfID = new JTextField("Faculty ID"));

        p2 = new JPanel();
        p2.add(labelPassword = new JLabel("Faculty Password : ")); 
        p2.add(tfPassword = new JPasswordField("Password"));
        
        p3 = new JPanel();
        p3.add(btnSubmit = new JButton("LogIn"));
        // p2.add(btnSubmit);

        setLayout(new FlowLayout());
        add(p1);
        add(p2);
        add(p3);

        setVisible(true);
    }
    
        
  
        
}
