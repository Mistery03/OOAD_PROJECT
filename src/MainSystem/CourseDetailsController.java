package MainSystem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class CourseDetailsController extends Controller implements ActionListener, ControllerNavigateInterface, ItemListener
{
    Course courseModel;
    CourseDetailViewer detailsView;
    MainMenuViewer mmv;
    String panelName;
    String [] desc, vidFilePath;

    CourseDetailsController(Course courseModel, CourseDetailViewer detailsView)
    {
        this.courseModel = courseModel;
        this.detailsView = detailsView;
    }



    @Override
    public void updateView() 
    {
        detailsView.dropDown(this.courseModel.getCourseName());
        desc = this.courseModel.getCourseDesc().toArray(new String [0]);
        vidFilePath = this.courseModel.getCourseVidFilePath().toArray(new String [0]);
        detailsView.videoPanel(vidFilePath[0]);
        detailsView.taDesc.setText(desc[0]);
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
            for(int i =0; i < detailsView.courses.length;i++)
            {
                    if(detailsView.cbCourse.getSelectedItem() == detailsView.courses[i])
                {
                    detailsView.taDesc.setText(desc[i]);
                    detailsView.videoPanel(vidFilePath[i]);
                    detailsView.pCentre.revalidate();
                    detailsView.pCentre.repaint();
                    

                }
            }
            /*if(detailsView.cbCourse.getSelectedItem() == detailsView.courses[0])
            {
                detailsView.taDesc.setText("EEE be like");
                detailsView.videoPanel("vid/Hutaoed.mp4");
                detailsView.pCentre.revalidate();
                detailsView.pCentre.repaint();
                

            }else if(detailsView.cbCourse.getSelectedItem() == detailsView.courses[1])
            {
                detailsView.taDesc.setText("CSE be like");
                detailsView.videoPanel("vid/Birb.mp4");
                detailsView.pCentre.revalidate();
                detailsView.pCentre.repaint();
       
               
            }else if(detailsView.cbCourse.getSelectedItem() == detailsView.courses[2])
            {
                detailsView.taDesc.setText("ECE be like");
                detailsView.videoPanel("vid/Heart.mp4");
                detailsView.pCentre.revalidate();
                detailsView.pCentre.repaint();
            }*/
        }
        
    }
    
}
