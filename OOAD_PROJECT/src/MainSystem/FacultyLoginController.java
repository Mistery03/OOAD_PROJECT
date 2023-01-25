package MainSystem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FacultyLoginController extends Controller implements ActionListener, ControllerNavigateInterface
{
    Faculty facultyLoginModel;
    FacultyLoginViewer facultyLoginViewer;
    MainMenuViewer mmv;
    String panelName;

    FacultyLoginController(Faculty facultyLoginModel, FacultyLoginViewer facultyLoginViewer)
    {
        this.facultyLoginModel = facultyLoginModel;
        this.facultyLoginViewer = facultyLoginViewer;
    }
    @Override
    protected void updateView() 
    {
        facultyLoginViewer.btnSubmit.addActionListener(this);
        
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
        if(e.getSource() == facultyLoginViewer.btnSubmit)
        {
            System.out.print("login liao");
            this.mmv.cl.show(mmv.pCard,this.panelName);
        
        }
        
    }

    
}
