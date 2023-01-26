package MainSystem;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenuController extends Controller implements ActionListener
{
    MainMenu menuModel;
    MainMenuViewer menuViewer;
    int panelCounter = 0;

   public MainMenuController (MainMenu menuModel, MainMenuViewer menuViewer)
   {
        this.menuModel = menuModel;
        this.menuViewer = menuViewer;
   }

   public void addPanel(JPanel panelObj, String panelName)
   {  
        
        menuViewer.pCard.add(panelObj, panelName);
        //menuModel.storePanel(panelName, panelObj);

        
   }

   public void navigate(String name)
   {
        menuViewer.cl.show(menuViewer.pCard, name);
   }



    @Override
    protected void updateView() 
    {
        
       menuViewer.display();
       menuViewer.btnNext.addActionListener(this);
       menuViewer.btnPrevious.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource() == menuViewer.btnNext)
        {
            this.navigate("CourseDetail");
        }else if(e.getSource() == menuViewer.btnPrevious)
        {
            menuViewer.cl.first(menuViewer.pCard);
        }

        
    }



}