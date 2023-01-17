
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame; 
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Choice extends JFrame implements ActionListener{
    JLabel lb1,lb2,lb3;
    JButton btn1, btn2, btn3;
    JPanel p1, p2, p3;
    
    public static void main(String[] args){
       Choice frame = new Choice(); 
       frame.setSize(520,520);
       frame.setTitle("OOAD"); 
       frame.setVisible(true);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public Choice(){

        btn1 = new JButton("Course Duration"); 
        btn2 = new JButton("Course Employement");
        btn3 = new JButton("Study Scope");        
        
        p1 = new JPanel(); 
        p1.add((lb1 = new JLabel("Student Portal"))); 
     
        p2 = new JPanel();
        p2.add((lb2 = new JLabel("Course Duration: Displays Each Study Duration For Each Course Provided.")));
        p2.add((lb3 = new JLabel("Course Employement: Displays Each Job Scope For Each Course Provided.")));
        p2.add((lb3 = new JLabel("Study Scope: Displays Each Study Scope For Each Course Provided.")));

        
        p3 = new JPanel();
        p3.add(btn1);
        p3.add(btn2);
        p3.add(btn3);
        
        setLayout(new BorderLayout());
        add(p1, BorderLayout.NORTH);
        add(p2, BorderLayout.CENTER);
        add(p3, BorderLayout.SOUTH);
        
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e){
       if(e.getSource()== btn1){
                Duration frame = new Duration();
                frame.setSize(520,520);
                frame.setTitle("OOAD");
                frame.setVisible(true);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
        if(e.getSource()== btn2){
                  Employement frame = new Employement();
                frame.setSize(520,520);
                frame.setTitle("OOAD");
                frame.setVisible(true);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
         if(e.getSource()== btn3){
                  Scope frame = new Scope();
                frame.setSize(520,520);
                frame.setTitle("OOAD");
                frame.setVisible(true);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
}
}
    