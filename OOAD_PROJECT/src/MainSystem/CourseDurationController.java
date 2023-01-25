package MainSystem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.*; 
import javax.swing.*;  

public class CourseDurationController extends Controller implements ActionListener, ControllerNavigateInterface, ItemListener{
    Course courseDurationModel;
    CourseDurationViewer courseDurationViewer;
    MainMenuViewer mmv;
    String panelName;

    CourseDurationController(Course courseDurationModel, CourseDurationViewer courseDurationViewer)
    {
        this.courseDurationModel = courseDurationModel;
        this.courseDurationViewer = courseDurationViewer;
    }

    @Override
    protected void updateView() {
        courseDurationViewer.scope.addActionListener(this);
        courseDurationViewer.employ.addActionListener(this);
        courseDurationViewer.back.addActionListener(this);
        courseDurationViewer.cbCourseLevel.addItemListener(this);    
    }

    @Override
    public void setMenu(MainMenuViewer mmv) 
    {
        this.mmv = mmv;
    }

    public void navigate(String name)
   {
        mmv.cl.show(mmv.pCard, name);
   }

    @Override
    public void setPanelLink(String panelName) {
       this.panelName = panelName;
    }

    @Override
    public void itemStateChanged(ItemEvent e){
        if(e.getSource() == courseDurationViewer.cbCourseLevel)
        {
            if(courseDurationViewer.cbCourseLevel.getSelectedItem() == "Diploma")
            {
                String columnDiploma[] = {"Course Name", "Course Duration"};
                String Diploma[][] ={
                    {"Electric And Electronic Engineering", "2.5 Years"},
                    {"Electric And Communication Engineering", "1.5 Years"},
                    {"Computer Science Engineering", "2.5 Years"},
                    {"Mechanical Engineering", "2.5 Years"},
                    {"Civil Engineering", "2.5 Years"}
                };
                
                courseDurationViewer.table.setValueAt("test", 1, 1);
                // courseDurationViewer.createTable(Diploma, columnDiploma);

                
            }
            else if(courseDurationViewer.cbCourseLevel.getSelectedItem() == "Undergraduate")
            {
                String columnUdg[] = {"Course Name", "Course Duration"};
                String Undergraduate[][] ={
                    {"Electric And Electronic Engineering", "2.5 Years"},
                    {"Electric And Communication Engineering", "4 Years"},
                    {"Computer Science Engineering", "3 Years"},
                    {"Mechanical Engineering", "4 Years"},
                    {"Civil Engineering", "4 Years"}
                };
                courseDurationViewer.createTable(Undergraduate, columnUdg);
                
            }
            else if(courseDurationViewer.cbCourseLevel.getSelectedItem() == "Postgraduate")
            {
                String columnPgd[] = {"Course Name", "Course Duration"};
                String Postgraduate[][] ={
                    {"Electric And Electronic Engineering", "2 Years"},
                    {"Electric And Communication Engineering", "2 Years"},
                    {"Computer Science Engineering", "3 Years"},
                    {"Mechanical Engineering", "2 Years"},
                    {"Civil Engineering", "1 Years"}
                };
            }
            else if(courseDurationViewer.cbCourseLevel.getSelectedItem() == "PHD")
            {
                String columnPHD[] = {"Course Name", "Course Duration"};
        String PHD[][] ={
            {"Electric And Electronic Engineering", "5.5 Years"},
            {"Electric And Communication Engineering", "3 Years"},
            {"Computer Science Engineering", "4 Years"},
            {"Mechanical Engineering", "3 Years"},
            {"Civil Engineering", "4 Years"}
        };
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == courseDurationViewer.employ){
            this.navigate("CourseEmployment");
    //    Employement frame = new Employement(); 
    //    frame.setSize(520,520);
    //    frame.setTitle("OOAD"); 
    //    frame.setVisible(true);
    //    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
        if(e.getSource() == courseDurationViewer.scope){
            this.navigate("CourseScope");
    //    Scope frame = new Scope(); 
    //    frame.setSize(520,520);
    //    frame.setTitle("OOAD"); 
    //    frame.setVisible(true);
    //    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
        if(e.getSource() == courseDurationViewer.back){
        // this.setVisible(false);
    //    Choice frame = new Choice(); 
    //    frame.setSize(520,520);
    //    frame.setTitle("OOAD"); 
    //    frame.setVisible(true);
    //    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    }
}
