package MainSystem;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CourseEmploymentViewer extends Viewer{

    public JButton scope,dura,back;
    private JLabel lb1,lb2,lb3,lb4,lb5,lb6,lb7,lb8,lb9,lb10,lb11;
    public JComboBox cbEmploy;
    public JPanel pCard;
    public CardLayout cl;
    public JLabel lbdetail;
    String desc;

    public CourseEmploymentViewer(){
        scope = new JButton("Study Scope");
        dura = new JButton("Course Duration");
        back = new JButton("Back");

        pCard = new JPanel();
        cl = new CardLayout();
        pCard.setLayout(cl);
        String [] employ = {"Electric And Electronic Engineering", "Electric And Communication Engineering", "Computer Science Engineering", "Mechanical Engineering", "Civil Engineering"};
        cbEmploy = new JComboBox<>(employ);
        lbdetail = new JLabel();
        
        JPanel p1 = new JPanel();
        p1.add((lb1 = new JLabel("Course Future Employement")));
        
        
        JPanel p2 = new JPanel();
        p2.add(cbEmploy);
        p2.add(lbdetail);
              
       JPanel p3 = new JPanel();
       p3.add(scope);
       p3.add(dura);
       
       setLayout(new BorderLayout());
       add(p1, BorderLayout.NORTH);
       add(p2, BorderLayout.CENTER);
       add(p3, BorderLayout.SOUTH);
       
    //    scope.addActionListener(this);
    //    dura.addActionListener(this);
    //    back.addActionListener(this);
    }
    
}
