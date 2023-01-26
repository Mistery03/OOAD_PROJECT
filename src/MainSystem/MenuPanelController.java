package MainSystem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPanelController extends Controller implements ActionListener, ControllerNavigateInterface
{

    MainMenu mainMenuModel;
    MenuPanelViewer mpv;
    MainMenuViewer mmv;

    MenuPanelController(MainMenu mainMenuModel, MenuPanelViewer mpv)
    {
        this.mainMenuModel = mainMenuModel;
        this.mpv = mpv;
    }
    @Override
    protected void updateView() {
        
        mpv.btnUserLogin.addActionListener(this);
        mpv.btnUserRegister.addActionListener(this);
        mpv.btnFacultyLogin.addActionListener(this);
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == mpv.btnFacultyLogin)
        {
            mmv.cl.show(mmv.pCard, "FacultyLogin");
            
        }else if(e.getSource() == mpv.btnUserLogin)
        {
            mmv.cl.show(mmv.pCard, "");

        }else if(e.getSource() == mpv.btnUserRegister)
        {
            mmv.cl.show(mmv.pCard, "Registration");
        }
        
    }
    @Override
    public void setMenu(MainMenuViewer mmv) {
        this.mmv = mmv;
        
    }
    @Override
    public void setPanelLink(String panelName) {}

    
}
