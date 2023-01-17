
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
public class Scope extends JFrame implements ActionListener{
    private JButton employ,dura,back;
    private JLabel lb1,lb2,lb3,lb4,lb5,lb6,lb7,lb8,lb9,lb10,lb11;
    
    public static void main(String[] args){
      Scope frame = new Scope();
       frame.setSize(520,520);
       frame.setTitle("OOAD");
       frame.setVisible(true);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }
        public Scope(){
            employ = new JButton("Course Employement");
            dura = new JButton("Course Duration");
            back = new JButton("Back");
            
            JPanel p1 = new JPanel();
            p1.add((lb1 = new JLabel("Course Study Scope")));
            
            JPanel p2 = new JPanel();
            p2.add((lb2 = new JLabel("Electric And Electronic Engineering")));
            p2.add((lb3 = new JLabel("Control Systems,Power Systems,Integrated Circuits,Communication Systems, Etc")));
            p2.add((lb4 = new JLabel("Electric And Communication Engineering ")));
            p2.add((lb5 = new JLabel("Digital Electronics, Fundamental of Electronics Engineering, Signal & Circuit, Electronic Circuits, Etc")));
            p2.add((lb6 = new JLabel("Computer Science Engineering ")));
            p2.add((lb7 = new JLabel("Database systems, Web Applications, Computer Graphics, Ethical Hacking, Etc")));
            p2.add((lb8 = new JLabel("Mechanical Engineering ")));
            p2.add((lb9 = new JLabel("Thermodynamics, Engineering Skills, Control And Fluid Power, Mathematical Modelling And Simulation, Etc")));
            p2.add((lb10 = new JLabel("Civil Engineering ")));
            p2.add((lb11 = new JLabel("Advanced Construction, Structural Engineering, Geotechnical Engineering, Etc")));
            
            JPanel p3 = new JPanel();
            p3.add(employ);
            p3.add(dura);
            p3.add(back);
            
            setLayout(new BorderLayout());
            add(p1, BorderLayout.NORTH);
            add(p2, BorderLayout.CENTER);
            add(p3, BorderLayout.SOUTH);
            
            employ.addActionListener(this);
            dura.addActionListener(this);
            back.addActionListener(this);
            
        }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == employ){
        this.setVisible(false);
       Employement frame = new Employement(); 
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