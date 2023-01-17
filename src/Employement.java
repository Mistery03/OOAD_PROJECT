
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ezry
 */
public class Employement extends JFrame implements ActionListener{
    private JButton scope,dura,back;
    private JLabel lb1,lb2,lb3,lb4,lb5,lb6,lb7,lb8,lb9,lb10,lb11;
    
    
     public static void main(String[] args){
      Employement frame = new Employement();
       frame.setSize(520,520);
       frame.setTitle("OOAD");
       frame.setVisible(true);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }
       
    public Employement(){
       scope = new JButton("Study Scope");
       dura = new JButton("Course Duration");
       back = new JButton("Back");
       
       JPanel p1 = new JPanel();
       p1.add((lb1 = new JLabel("Course Future Employement")));
       
       JPanel p2 = new JPanel();
       p2.add((lb2 = new JLabel("Electric And Electronic Engineering: ")));
       p2.add((lb3 = new JLabel("Electrical Engineer, Electric Technician, CAD Technician,Aerospace engineer,Controls engineer, Etc.")));
       p2.add((lb4 = new JLabel("Electric And Communication Engineering: ")));
       p2.add((lb5 = new JLabel("Communication Engineer, Telecom Engineer, R&D Software Engineer,Customer Support Engineer,Electronics Technician, Etc.")));
       p2.add((lb6 = new JLabel("Computer Science Engineering: ")));
       p2.add((lb7 = new JLabel("Software Developer, Web Developer, AI Engineer,Data Analyst,Full Stack Developer, Etc.")));
       p2.add((lb8 = new JLabel("Mechanical Engineering: ")));
       p2.add((lb9 = new JLabel("Material Engineer, Mechanical Engineer, Nuclear Engineer,Automotive,Manufacturing, Etc.")));
       p2.add((lb10 = new JLabel("Mechanical Engineering: ")));
       p2.add((lb11 = new JLabel("Construction Manager, Quantity Surveyor, Structural Engineer,Water Engineer, Site Engineer, Etc.")));
       
       JPanel p3 = new JPanel();
       p3.add(scope);
       p3.add(dura);
       p3.add(back);
       
       setLayout(new BorderLayout());
       add(p1, BorderLayout.NORTH);
       add(p2, BorderLayout.CENTER);
       add(p3, BorderLayout.SOUTH);
       
       scope.addActionListener(this);
       dura.addActionListener(this);
       back.addActionListener(this);
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == scope){
        this.setVisible(false);
       Scope frame = new Scope(); 
       frame.setSize(520,520);
       frame.setTitle("OOAD"); 
       frame.setVisible(true);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
        if(e.getSource() == dura){
        this.setVisible(false);
       Duration frame = new Duration(); 
       frame.setSize(520,520);
       frame.setTitle("OOAD"); 
       frame.setVisible(true);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
        if(e.getSource() == back){
        this.setVisible(false);
       Choice frame = new Choice(); 
       frame.setSize(520,520);
       frame.setTitle("OOAD"); 
       frame.setVisible(true);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    }
}