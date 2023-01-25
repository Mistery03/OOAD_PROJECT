package MainSystem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CourseEmploymentController extends Controller implements ActionListener, ControllerNavigateInterface, ItemListener{
    Course courseEmploymentModel;
    CourseEmploymentViewer courseEmploymentViewer;
    MainMenuViewer mmv;
    String panelName;

    CourseEmploymentController(Course courseEmploymentModel, CourseEmploymentViewer courseEmploymentViewer)
    {
        this.courseEmploymentModel = courseEmploymentModel;
        this.courseEmploymentViewer = courseEmploymentViewer;
    }

    @Override
    protected void updateView() {
        // courseEmploymentViewer.courseEmploymentViewer();
        courseEmploymentViewer.scope.addActionListener(this);
        courseEmploymentViewer.dura.addActionListener(this);
        courseEmploymentViewer.cbEmploy.addItemListener(this);
    }

    @Override
    public void setMenu(MainMenuViewer mmv) 
    {
        this.mmv = mmv;
    }

    @Override
    public void setPanelLink(String panelName) 
    {
        this.panelName = panelName;
        
    }

    public void navigate(String name)
   {
        mmv.cl.show(mmv.pCard, name);
   }

   @Override
    public void itemStateChanged(ItemEvent e){
        if(e.getSource() == courseEmploymentViewer.cbEmploy)
        {
            JComboBox cb = (JComboBox)e.getSource();
            String msg = (String)cb.getSelectedItem();
            
            courseEmploymentViewer.lbdetail.setText("Control Systems,Power Systems,Integrated Circuits,Communication Systems, Etc");

            if(msg == "Electric And Electronic Engineering")
            {
                courseEmploymentViewer.lbdetail.setText("Control Systems,Power Systems,Integrated Circuits,Communication Systems, Etc");
            }
            else if(msg == "Electric And Communication Engineering")
            {
                courseEmploymentViewer.lbdetail.setText("Digital Electronics, Fundamental of Electronics Engineering, Signal & Circuit, Electronic Circuits, Etc");
            }
            else if(msg == "Computer Science Engineering")
            {
                courseEmploymentViewer.lbdetail.setText("Database systems, Web Applications, Computer Graphics, Ethical Hacking, Etc");
            }
            else if(msg == "Mechanical Engineering")
            {
                courseEmploymentViewer.lbdetail.setText("Thermodynamics, Engineering Skills, Control And Fluid Power, Mathematical Modelling And Simulation, Etc");
            }
            else if(msg == "Civil Engineering")
            {
                courseEmploymentViewer.lbdetail.setText("Advanced Construction, Structural Engineering, Geotechnical Engineering, Etc");
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == courseEmploymentViewer.scope){
            this.navigate("CourseScope");
            
        //    Scope frame = new Scope(); 
        //    frame.setSize(520,520);
        //    frame.setTitle("OOAD"); 
        //    frame.setVisible(true);
        //    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        if(e.getSource() == courseEmploymentViewer.dura){
            this.navigate("CourseDuration");
        //    Duration frame = new Duration(); 
        //    frame.setSize(520,520);
        //    frame.setTitle("OOAD"); 
        //    frame.setVisible(true);
        //    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        //     if(e.getSource() == back){
        //     this.setVisible(false);
        // //    Choice frame = new Choice(); 
        // //    frame.setSize(520,520);
        // //    frame.setTitle("OOAD"); 
        // //    frame.setVisible(true);
        // //    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // }
    }

    

}
