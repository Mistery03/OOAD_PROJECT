package MainSystem;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CourseScopeViewer extends Viewer{
    public JButton employ,dura,back;
    public JLabel lb1,lb2,lb3,lb4,lb5,lb6,lb7,lb8,lb9,lb10,lb11;
    public JPanel pCard;
    public JLabel lbscope;
    public JComboBox cbScope;
    public CardLayout cl;

    public CourseScopeViewer(){
            employ = new JButton("Course Employement");
            dura = new JButton("Course Duration");
            back = new JButton("Back");
            
            pCard = new JPanel();
            cl = new CardLayout();
            pCard.setLayout(cl);
            String [] scope = {"Electric And Electronic Engineering", "Electric And Communication Engineering", "Computer Science Engineering", "Mechanical Engineering", "Civil Engineering"};
            cbScope = new JComboBox<>(scope);
            lbscope = new JLabel();

            JPanel p1 = new JPanel();
            p1.add((lb1 = new JLabel("Course Study Scope")));
            
            JPanel p2 = new JPanel();
            p2.add(cbScope);
            p2.add(lbscope);

            JPanel p3 = new JPanel();
            p3.add(employ);
            p3.add(dura);
            // p3.add(back);
            
            setLayout(new BorderLayout());
            add(p1, BorderLayout.NORTH);
            add(p2, BorderLayout.CENTER);
            add(p3, BorderLayout.SOUTH);
            
            // employ.addActionListener(this);
            // dura.addActionListener(this);
            // back.addActionListener(this);
    }
}
