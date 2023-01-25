package MainSystem;
import java.awt.*; 
import javax.swing.*;  
import java.awt.event.*;  
import java.lang.Exception; 

public class CourseDurationViewer extends Viewer{
    public JButton scope,employ,back;
    public JLabel lb;
    private JLabel lbTitle, lbDiploma, lbUdg, lbPgd, lbPHD;
    public JTable tb, table;
    public JComboBox cbCourseLevel;
    public JScrollPane sp;
    public JPanel pCard, p2;
    public CardLayout cl;
    public String a;
    public CourseDurationViewer(){
        scope = new JButton("Study Scope");
        employ = new JButton("Course Employement");
        back = new JButton("Back");
        
        
        pCard = new JPanel();
        cl = new CardLayout();
        pCard.setLayout(cl);

        //DATA
        String [] coursesLevel = {"Diploma", "Undergraduate", "Postgraduate", "PHD"};
        cbCourseLevel = new JComboBox<>(coursesLevel);

        String columnDiploma[] = {"Course Name", "Course Duration"};
        String Diploma[][] ={
            {"Electric And Electronic Engineering", "2.5 Years"},
            {"Electric And Communication Engineering", "1.5 Years"},
            {"Computer Science Engineering", "2.5 Years"},
            {"Mechanical Engineering", "2.5 Years"},
            {"Civil Engineering", "2.5 Years"}
        };

        String columnUdg[] = {"Course Name", "Course Duration"};
        String Undergraduate[][] ={
            {"Electric And Electronic Engineering", "2.5 Years"},
            {"Electric And Communication Engineering", "4 Years"},
            {"Computer Science Engineering", "3 Years"},
            {"Mechanical Engineering", "4 Years"},
            {"Civil Engineering", "4 Years"}
        };

        String columnPgd[] = {"Course Name", "Course Duration"};
        String Postgraduate[][] ={
            {"Electric And Electronic Engineering", "2 Years"},
            {"Electric And Communication Engineering", "2 Years"},
            {"Computer Science Engineering", "3 Years"},
            {"Mechanical Engineering", "2 Years"},
            {"Civil Engineering", "1 Years"}
        };

        String columnPHD[] = {"Course Name", "Course Duration"};
        String PHD[][] ={
            {"Electric And Electronic Engineering", "5.5 Years"},
            {"Electric And Communication Engineering", "3 Years"},
            {"Computer Science Engineering", "4 Years"},
            {"Mechanical Engineering", "3 Years"},
            {"Civil Engineering", "4 Years"}
        };

        JTable tbDiploma = new JTable (Diploma, columnDiploma);
        // JTable tbUdg = new JTable (Undergraduate, columnUdg);
        // JTable tbPgd = new JTable (Postgraduate,columnPgd);
        // JTable tbPHD = new JTable (PHD, columnPHD); 

        JPanel p1 = new JPanel();
        p1.add((lbTitle = new JLabel("Course Duration")));
        

        JPanel p2 = new JPanel();
        p2.add(cbCourseLevel);
        createTable(Diploma, columnDiploma);
        p2.add(this.sp);
        
        
        
        
        JPanel p3 = new JPanel();
        p3.add(scope);
        p3.add(employ);
        // p3.add(back);
        
        setLayout(new BorderLayout());
        add(p1, BorderLayout.NORTH);
        add(p2, BorderLayout.CENTER);
        add(p3, BorderLayout.SOUTH);
        
        // employ.addActionListener(this);
        // scope.addActionListener(this);
        // back.addActionListener(this);
    }

    public void createTable(String[][] course, String[] column){

        this.table = new JTable (course, column);
        this.sp = new JScrollPane(table);
        this.sp.setPreferredSize(new Dimension(500, 150));
        
    }

    
}
