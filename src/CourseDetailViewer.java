import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;  
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class CourseDetailViewer extends Viewer 
{
    JButton backBtn, applyBtn;
    JLabel lCourseName, lEntry;
    JTextArea taDesc;
    JComboBox cbCourse;
    JPanel panelBTN, panelDropdown, panelVid, panelDesc;

    String [] courses = {"EEE", "CSE", "ECE"}; 

    String name;
    String desc;

    public CourseDetailViewer()
    {setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();


        backBtn = new JButton("Go back");
        
        applyBtn = new JButton("Apply course!");
        taDesc = new JTextArea(desc, 25, 50);
        cbCourse = new JComboBox(courses);

        panelBTN = new JPanel();
        panelDropdown = new JPanel();
        panelDesc = new JPanel();

        taDesc.setLineWrap(true);
        taDesc.setWrapStyleWord(true);
        taDesc.setEditable(false);
        taDesc.setAlignmentX(50);
        c.gridx = 0;
        c.gridy = 0;
        panelBTN.add(backBtn, c);
    
        panelDropdown.add(cbCourse);
        panelDesc.add(taDesc);
        
        this.add(panelBTN);
        this.add(panelDropdown);
        this.add(panelDesc);
        this.add(applyBtn);

        setVisible(true);


    }

   

}
    

