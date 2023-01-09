import java.awt.*; 
import javax.swing.*;  

public class Faculty {
    String facultyID, facultyName, facultyPw;

    public static void main(String[] args) {  
        JFrame f = new JFrame("Faculty");//creating instance of JFrame  
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

        JLabel labelID, labelPassword;
        JTextField tfID,tfPassword;
        JButton btnSubmit;

        labelID = new JLabel("Faculty ID : ");   
        labelPassword = new JLabel("Faculty Password : ");


        tfID = new JTextField("Faculty ID");
        tfPassword = new JTextField("Faculty Password");

        btnSubmit = new JButton("click");//creating instance of JButton  
        
        f.add(labelID); f.add(tfID);
        f.add(labelPassword);f.add(tfPassword);
        f.add(btnSubmit);//adding button in JFrame  
        
        f.setSize(800, 800);
        f.setLayout(new GridLayout(3,2,20,20)); 
        f.setVisible(true);//making the frame visible 
        
         
        }  
}
