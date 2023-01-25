package MainSystem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FacultyUploadLevelController extends Controller implements ActionListener, ControllerNavigateInterface{
    Faculty facultyModel;
    FacultyUploadLevelViewer facultyUploadLevelViewer;
    MainMenuViewer mmv;
    String panelName;
    
    FacultyUploadLevelController(Faculty facultyModel, FacultyUploadLevelViewer facultyUploadLevelViewer)
    {
        this.facultyModel = facultyModel;
        this.facultyUploadLevelViewer = facultyUploadLevelViewer;
    }
    
    @Override
    protected void updateView() 
    {
        facultyUploadLevelViewer.btnUpload.addActionListener(this);
        
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
        if(e.getSource() == facultyUploadLevelViewer.btnUpload)
        {
            System.out.print("login liao");
            this.mmv.cl.show(mmv.pCard,this.panelName);
        
        }

        
  
    }     
}
