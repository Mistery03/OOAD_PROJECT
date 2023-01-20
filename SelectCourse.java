import javax.swing.*;  
import java.awt.event.*;  
public class SelectCourse extends JFrame implements ActionListener{  
    JLabel l;  
    JCheckBox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9;  
    JButton b;  
    SelectCourse(){  
        l=new JLabel("Selecting Course");  
        l.setBounds(25,20,300,20);  
        cb1=new JCheckBox("Foundation in Management");  
        cb1.setBounds(50,50,500,20);  
        cb2=new JCheckBox("Diploma in Management");  
        cb2.setBounds(50,75,500,20);  
        cb3=new JCheckBox("Bachelor of Digital Enterprise Management(Hons.) ");  
        cb3.setBounds(50,100,500,20); 
        cb4=new JCheckBox("Diploma in Mechanical Engineering");  
        cb4.setBounds(50,125,500,20); 
        cb5=new JCheckBox("Bachelor of Engineering(Hons.) Electrical");  
        cb5.setBounds(50,150,500,20);  
        cb6=new JCheckBox("Diploma in Information Technology");  
        cb6.setBounds(50,175,500,20);  
        cb7=new JCheckBox("Bachelor of Computer Science(Hons.) in Software Engineering");  
        cb7.setBounds(50,200,500,20);  
        cb8=new JCheckBox("Bachelor of Multimedia(Hons.)(Media Arts)");  
        cb8.setBounds(50,225,500,20);  
        cb9=new JCheckBox("Bachelor of Cinematic Arts(Hons.)");  
        cb9.setBounds(50,250,500,20);  
        b=new JButton("Submit");  
        b.setBounds(50,280,80,30);  
        b.addActionListener(this);  
        add(l);add(cb1);add(cb2);add(cb3);add(cb4);add(cb5);add(cb6);add(cb7);add(cb8);add(cb9);add(b);  
        setSize(400,400);  
        setLayout(null);  
        setVisible(true);  
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
    }  
    public void actionPerformed(ActionEvent e){  
        String course="";  
        String msg="";  
        if(cb1.isSelected()){  
            course="Foundation in Management";  
              
        }  
        if(cb2.isSelected()){  
            course="Diploma in Management";  
             
        }  
        if(cb3.isSelected()){  
            course="Bachelor of Digital Enterprise Management(Hons.)";  
             
        } 
        if(cb4.isSelected()){  
            course="Diploma in Mechanical Engineering";
              
        } 
        if(cb5.isSelected()){  
            course="Bachelor of Engineering(Hons.) Electrical";  
             
        } 
        if(cb6.isSelected()){  
            course="Diploma in Information Technology";  
             
        } 
        if(cb7.isSelected()){  
            course="Bachelor of Computer Science(Hons.) in Software Engineering"; 
              
        } 
        if(cb8.isSelected()){  
            course="Bachelor of Multimedia(Hons.)(Media Arts)";  
             
        } 
        if(cb9.isSelected()){  
            course="Bachelor of Cinematic Arts(Hons.)";  
              
        } 
          msg+="Register successfully.\n";
        JOptionPane.showMessageDialog(this,msg+"Your selected course: "+course);  
    }  
    public static void main(String[] args) {  
        new SelectCourse();  
    }  
}  
