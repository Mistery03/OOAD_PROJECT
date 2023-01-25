package MainSystem;
import java.awt.*; 
import javax.swing.*;  
import java.awt.event.*;  
import java.lang.Exception; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FacultyUploadCourseController extends Controller implements ActionListener, ControllerNavigateInterface{ 

    Faculty facultyModel;
    FacultyUploadCourseViewer facultyUploadCourseViewer;
    MainMenuViewer mmv;
    String panelName;

    FacultyUploadCourseController(Faculty facultyModel, FacultyUploadCourseViewer facultyUploadCourseViewer)
    {
        this.facultyModel = facultyModel;
        this.facultyUploadCourseViewer = facultyUploadCourseViewer;
    }
    
    @Override
    protected void updateView() 
    {
        facultyUploadCourseViewer.btnUpload.addActionListener(this);
        
    }
    
    @Override
    public void setMenu(MainMenuViewer mmv) {
        this.mmv = mmv;
        
    }
    @Override
    public void setPanelLink(String panelName) {
       this.panelName = panelName;
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == facultyUploadCourseViewer.btnUpload)
        {
            System.out.print("login liao");
            this.mmv.cl.show(mmv.pCard,this.panelName);
        
        }

        
  
    }     
}
