package MainSystem;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JPanel;

public class MainMenu
{
    JPanel panelObj;
    HashMap <String, JPanel> panelList;

    public MainMenu()
    {
        this.panelList = new HashMap<String, JPanel>();
    }
    
    public void setPanel(JPanel panelObj){this.panelObj = panelObj;}
    public JPanel getPanel(){return this.panelObj;}

    public void storePanel(String panelName, JPanel panelObj)
    {
        panelList.put(panelName, panelObj);
        //System.out.print(panelList);
    }

    public void getPanelListSize()
    {
        System.out.print(panelList.size());
    }
}