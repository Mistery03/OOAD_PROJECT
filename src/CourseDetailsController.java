import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CourseDetailsController extends Controller implements ActionListener, ControllerNavigateInterface, ItemListener
{
    Course courseModel;
    CourseDetailViewer detailsView;
    MainMenuViewer mmv;
    String panelName;

    CourseDetailsController(Course courseModel, CourseDetailViewer detailsView)
    {
        this.courseModel = courseModel;
        this.detailsView = detailsView;
    }



    @Override
    public void updateView() 
    {
        detailsView.backBtn.addActionListener(this);
        detailsView.cbCourse.addItemListener(this);
        
    }



    @Override
    public void setMenu(MainMenuViewer mmv) 
    {
        this.mmv = mmv;
        
    }



    @Override
    public void setPanelLink(String panelName) 
    {
        
        
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == detailsView.backBtn)
        {
            mmv.cl.first(mmv.pCard);
        }
        
    }



    @Override
    public void itemStateChanged(ItemEvent e) 
    {
        if(e.getSource() == detailsView.cbCourse)
        {
            if(detailsView.cbCourse.getSelectedItem() == "EEE")
            {
                detailsView.taDesc.setText("EEE be like");
            }else if(detailsView.cbCourse.getSelectedItem() == "CSE")
            {
                detailsView.taDesc.setText("CSE be like");
            }else if(detailsView.cbCourse.getSelectedItem() == "ECE")
            {
                detailsView.taDesc.setText("ECE be like");
            }
        }
        
    }
    
}
