package MainSystem;
import java.awt.*; 
import javax.swing.*;


public class FacultyUploadLevelViewer extends Viewer {
    JLabel labelLevelName, labelLevelDetails;
    JTextField tfLevelName,tfLevelDetails;
    public JButton btnUpload;
    GridBagConstraints GridBag = new GridBagConstraints();
    JPanel p1,p2, p3;

    String name, details;

    public FacultyUploadLevelViewer()
    {
        p1 = new JPanel();
        p1.add(labelLevelName = new JLabel("Level Name : "));
        p1.add(tfLevelName = new JTextField("Level Name"));

        p2 = new JPanel();
        p2.add(labelLevelDetails = new JLabel("Level Details : ")); 
        p2.add(tfLevelDetails = new JPasswordField("Level Details"));
        
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
