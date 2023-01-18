import java.awt.*; 
import javax.swing.*;  
import java.awt.event.*;  
import java.lang.Exception; 

public class FacultyLoginViewer extends Viewer { 

    JLabel labelID, labelPassword;
    JTextField tfID,tfPassword;
    JButton btnSubmit;
    GridBagConstraints GridBag = new GridBagConstraints();
    JPanel p1,p2, p3;

    String name, password;

    public FacultyLoginViewer(String name, String password){
        this.name = name;
        this.password = password;
    }
    
        
    @Override
    public void viewBody(){

        // JFrame f = new JFrame("Faculty Login");

        // labelID = new JLabel("Faculty ID : ");   
        // labelPassword = new JLabel("Faculty Password : ");

        // tfID = new JTextField("Faculty ID");
        // tfPassword = new JPasswordField("Faculty Password");

        // btnSubmit = new JButton("LogIn");

        //Panel p = new Panel();

        p1 = new JPanel();
        p1.add(labelID = new JLabel("Faculty ID : "));
        p1.add(tfID = new JTextField("Faculty ID"));

        p2 = new JPanel();
        p2.add(labelPassword = new JLabel("Faculty Password : ")); 
        p2.add(tfPassword = new JPasswordField("Password"));
        
        p3 = new JPanel();
        p3.add(btnSubmit = new JButton("LogIn"));
        // p2.add(btnSubmit);

        setLayout(new BorderLayout());

        add(p1, BorderLayout.NORTH);
        add(p2, BorderLayout.CENTER);
        add(p3, BorderLayout.SOUTH);

        setVisible(true);
            
    }
        
}
