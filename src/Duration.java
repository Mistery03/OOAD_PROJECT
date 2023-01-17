
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
public class Duration extends JFrame implements ActionListener{
    private JButton scope,employ,back;
    private JLabel lb1,lb2,lb3,lb4,lb5,lb6,lb7,lb8,lb9,lb10,lb11,lb12,lb13,lb14,lb15,lb16,lb17,lb18,lb19,lb20,lb21,lb22,lb23,lb24,lb25;
    
    
     public static void main(String[] args){
      Duration frame = new Duration();
       frame.setSize(520,520);
       frame.setTitle("OOAD");
       frame.setVisible(true);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }
       
    public Duration(){
       scope = new JButton("Study Scope");
       employ = new JButton("Course Employement");
       back = new JButton("Back");
       
       JPanel p1 = new JPanel();
       p1.add((lb1 = new JLabel("Course Duration")));
       
       JPanel p2 = new JPanel();
       p2.add((lb2 = new JLabel("DIPLOMA ")));
       p2.add((lb3 = new JLabel("Electric And Electronic Engineering: 2.5 Years")));
       p2.add((lb4 = new JLabel("Electric And Communication Engineering: 1.5  Years")));
       p2.add((lb5 = new JLabel("Computer Science Engineering: 2.5 Years")));
       p2.add((lb6 = new JLabel("Mechanical Engineering: 2.5 Years ")));
       p2.add((lb7 = new JLabel("Civil Engineering 2.5 Years")));
       p2.add((lb8 = new JLabel("UNDERGRADUATE")));
       p2.add((lb9 = new JLabel("Electric And Electronic Engineering: 2.5 Years")));
       p2.add((lb10 = new JLabel("Electric And Communication Engineering: 4  Years")));
       p2.add((lb11 = new JLabel("Computer Science Engineering: 3 Years")));
       p2.add((lb12 = new JLabel("Mechanical Engineering: 4 Years ")));
       p2.add((lb13 = new JLabel("Civil Engineering 4 Years")));
       p2.add((lb14 = new JLabel("POSTGRADUATE")));
       p2.add((lb15 = new JLabel("Electric And Electronic Engineering: 2 Years")));
       p2.add((lb16 = new JLabel("Electric And Communication Engineering: 2  Years")));
       p2.add((lb17 = new JLabel("Computer Science Engineering: 3 Years")));
       p2.add((lb18 = new JLabel("Mechanical Engineering: 2 Years ")));
       p2.add((lb19 = new JLabel("Civil Engineering 1 Years")));
       p2.add((lb20 = new JLabel("PHD")));
       p2.add((lb21 = new JLabel("Electric And Electronic Engineering: 5.5 Years")));
       p2.add((lb22 = new JLabel("Electric And Communication Engineering: 3  Years")));
       p2.add((lb23 = new JLabel("Computer Science Engineering: 4 Years")));
       p2.add((lb24 = new JLabel("Mechanical Engineering: 3 Years ")));
       p2.add((lb25 = new JLabel("Civil Engineering 4 Years")));
       
       JPanel p3 = new JPanel();
       p3.add(scope);
       p3.add(employ);
       p3.add(back);
       
       setLayout(new BorderLayout());
       add(p1, BorderLayout.NORTH);
       add(p2, BorderLayout.CENTER);
       add(p3, BorderLayout.SOUTH);
       
       employ.addActionListener(this);
       scope.addActionListener(this);
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
        if(e.getSource() == scope){
        this.setVisible(false);
       Scope frame = new Scope(); 
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