package MainSystem;
import java.awt.*; 
import javax.swing.*;  
import java.awt.event.*;  
import java.lang.Exception; 

public class FacultyUploadCourseViewer extends Viewer { 

    JLabel labelCourseName, labelCourseDetails;
    JTextField tfCourseName,tfCourseDetails;
    public JButton btnUpload;
    GridBagConstraints GridBag = new GridBagConstraints();
    JPanel p1,p2, p3;

    String name, details;

    public FacultyUploadCourseViewer()
    {
        p1 = new JPanel();
        p1.add(labelCourseName = new JLabel("Course Name : "));
        p1.add(tfCourseName = new JTextField("Course Name"));

        p2 = new JPanel();
        p2.add(labelCourseDetails = new JLabel("Course Details : ")); 
        p2.add(tfCourseDetails = new JPasswordField("Course Details"));
        
        p3 = new JPanel();
        p3.add(btnUpload = new JButton("Upload"));
        // p2.add(btnSubmit);

        setLayout(new BorderLayout());

        add(p1, BorderLayout.NORTH);
        add(p2, BorderLayout.CENTER);
        add(p3, BorderLayout.SOUTH);

        setVisible(true);
    }
    
        
  
        
}
