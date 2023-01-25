package MainSystem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class CourseScopeController extends Controller implements ActionListener, ControllerNavigateInterface, ItemListener{
    Course courseScopeModel;
    CourseScopeViewer courseScopeViewer;
    MainMenuViewer mmv;
    String panelName;

    CourseScopeController(Course courseScopeModel, CourseScopeViewer courseScopeViewer)
    {
        this.courseScopeModel = courseScopeModel;
        this.courseScopeViewer = courseScopeViewer;
    }

    @Override
    protected void updateView() {
        // TODO Auto-generated method stub
        courseScopeViewer.dura.addActionListener(this);
        courseScopeViewer.employ.addActionListener(this);
        courseScopeViewer.cbScope.addItemListener(this);
    }
    @Override
    public void setMenu(MainMenuViewer mmv) 
    {
        this.mmv = mmv;
    }

    @Override
    public void setPanelLink(String panelName) {
       this.panelName = panelName;
        
    }

    public void navigate(String name)
   {
        mmv.cl.show(mmv.pCard, name);
   }

   @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getSource() == courseScopeViewer.cbScope)
        {
            JComboBox cb = (JComboBox)e.getSource();
            String msg = (String)cb.getSelectedItem();
            
            courseScopeViewer.lbscope.setText("Control Systems,Power Systems,Integrated Circuits,Communication Systems, Etc");

            if(msg == "Electric And Electronic Engineering")
            {
                courseScopeViewer.lbscope.setText("Control Systems,Power Systems,Integrated Circuits,Communication Systems, Etc");
            }
            else if(msg == "Electric And Communication Engineering")
            {
                courseScopeViewer.lbscope.setText("Digital Electronics, Fundamental of Electronics Engineering, Signal & Circuit, Electronic Circuits, Etc");
            }
            else if(msg == "Computer Science Engineering")
            {
                courseScopeViewer.lbscope.setText("Database systems, Web Applications, Computer Graphics, Ethical Hacking, Etc");
            }
            else if(msg == "Mechanical Engineering")
            {
                courseScopeViewer.lbscope.setText("Thermodynamics, Engineering Skills, Control And Fluid Power, Mathematical Modelling And Simulation, Etc");
            }
            else if(msg == "Civil Engineering")
            {
                courseScopeViewer.lbscope.setText("Advanced Construction, Structural Engineering, Geotechnical Engineering, Etc");
            }
        }
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == courseScopeViewer.employ){
        this.navigate("CourseEmployment");
    //    Employement frame = new Employement(); 
    //    frame.setSize(520,520);
    //    frame.setTitle("OOAD"); 
    //    frame.setVisible(true);
    //    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
        if(e.getSource() == courseScopeViewer.dura){
            this.navigate("CourseDuration");
    //    Duration frame = new Duration(); 
    //    frame.setSize(520,520);
    //    frame.setTitle("OOAD"); 
    //    frame.setVisible(true);
    //    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
        // if(e.getSource() == courseScopeViewer.back){
        // this.setVisible(false);
    //    Choice frame = new Choice(); 
    //    frame.setSize(520,520);
    //    frame.setTitle("OOAD"); 
    //    frame.setVisible(true);
    //    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    
}

