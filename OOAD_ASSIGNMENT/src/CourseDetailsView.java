import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CourseDetailsView extends Viewer 
{
    JButton backBtn, applyBtn;
    JLabel lCourseName, lEntry;
    JTextArea taDesc;
    JComboBox cbCourse;
    JPanel panelBTN, panelDropdown, panelVid, panelDesc;

    String [] courses = {"EEE", "CSE", "ECE"}; 
    String name;

    String desc = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";

    public CourseDetailsView (String name, String duck, String quack)
    {
        this.name = name;
    }

    @Override
    public void viewBody() 
    {
        backBtn = new JButton("Go back");
        applyBtn = new JButton("Apply course!");
        taDesc = new JTextArea(desc, 25, 50);
        cbCourse = new JComboBox(courses);

        panelBTN = new JPanel();
        panelDropdown = new JPanel();
        panelDesc = new JPanel();

        setLayout(new FlowLayout());
        taDesc.setLineWrap(true);
        taDesc.setWrapStyleWord(true);
        taDesc.setEditable(false);
        taDesc.setAlignmentX(50);
    
    

        panelBTN.add(backBtn);
        panelDropdown.add(cbCourse);
        panelDesc.add(taDesc);
        
        this.add(panelBTN);
        this.add(panelDropdown);
        this.add(panelDesc);
        this.add(applyBtn);

        setVisible(true);

        
    }

}