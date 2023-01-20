import javax.swing.*; 
import java.awt.*;
import java.awt.event.*;

public class Subject extends JFrame implements ActionListener{
    JButton courseduebtn, nextbtn;
    JLabel title,EEeng, ECeng, CSeng, MEeng, Ceng, EEsub, ECsub, CSsub, MEsub, Csub;

Subject(){
        setVisible(true);
        setSize(700,700);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Subject");
        
        courseduebtn = new JButton("Course Duration");
        nextbtn = new JButton("Next");
        
        JPanel ttlp = new JPanel();
        ttlp.add((title = new JLabel("Subject List")));
        
        JPanel subP = new JPanel();
        subP.add((EEeng = new JLabel("Electric & Electronic Engineering : ")));
        subP.add((EEsub = new JLabel("Control Systems, Power Systems, Integrated Circuits, Communication Systems")));
        subP.add((ECeng = new JLabel("Electric & Communication Engineering : ")));
        subP.add((ECsub = new JLabel("Digital Electronics, Fundamental of Electronics Engineering, Signal & Circuit, Electronic Circuits")));
        subP.add((CSeng = new JLabel("Computer Science Engineering : ")));
        subP.add((CSsub = new JLabel("Database System, Web Applications, Computer Graphics, Ethical Hacking")));
        subP.add((MEeng = new JLabel("Mechanical Engineering : ")));
        subP.add((MEsub = new JLabel("Thermodynamic, Engineering Skills, Control & Fluid Power, Mathematical Modelling & Simulation")));
        subP.add((Ceng = new JLabel("Civil Engineering : ")));
        subP.add((Csub = new JLabel("Advanced Construction, Structural Engineering, Geotechnical Engineering")));
        
        title.setBounds(100, 30, 400, 30);
        EEeng.setBounds(80, 70, 200, 30);
        EEsub.setBounds(300, 70, 200, 30);
        ECeng.setBounds(80, 110, 200, 30);
        ECsub.setBounds(300, 110, 200, 30);
        CSeng.setBounds(80, 150, 200, 30);
        CSsub.setBounds(300, 150, 200, 30);
        MEeng.setBounds(80, 190, 200, 30);
        MEsub.setBounds(300, 190, 200, 30);
        Ceng.setBounds(80, 270, 200, 30);
        Csub.setBounds(300, 270, 200, 30);
        nextbtn.setBounds(50, 350, 100, 30);
        courseduebtn.setBounds(170, 350, 100, 130);
        
 }
public static void main(String arr[]){
        new Subject();
    }
}
