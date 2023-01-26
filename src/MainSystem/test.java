package MainSystem;

import java.sql.SQLException;

import javax.swing.SwingUtilities;

public class test 
{
    

    public static void main(String [] args) throws SQLException
    {
        Database db = new Database("localhost:3306", "courseproject", "root", "");

        MainMenu menuModel = new MainMenu();
        Faculty facultyModel = new Faculty();
        Course courseModel = new Course();

        MenuPanelViewer mpv = new MenuPanelViewer();
        MainMenuViewer menuViewer = new MainMenuViewer();
        FacultyLoginViewer flv = new FacultyLoginViewer();

        CourseDetailViewer cdv = new CourseDetailViewer();
        RegistrationViewer rv =  new RegistrationViewer();

        MenuPanelController mpc = new MenuPanelController(menuModel, mpv);
        MainMenuController mmc= new MainMenuController(menuModel, menuViewer);
        FacultyLoginController flc = new FacultyLoginController(facultyModel, flv);
       

        

        mpc.updateView();
        mpc.setMenu(menuViewer);

        mmc.addPanel(mpv, "mainMenu");
        mmc.addPanel(flv, "FacultyLogin");
        mmc.addPanel(cdv, "CourseDetail");
        mmc.addPanel(rv, "Registration");

        flc.updateView();
        flc.setMenu(menuViewer);
        flc.setPanelLink("Registration");

       
        courseModel.setCourseName(db.getColumnData("CourseName", "Course"));
        courseModel.setCourseDesc(db.getColumnData("CourseDesc", "Course"));
        courseModel.setCourseVidFilePath(db.getColumnData("CourseVidFilePath", "Course"));
        CourseDetailsController cdc = new CourseDetailsController(courseModel, cdv);
        cdc.updateView();
        cdc.setMenu(menuViewer);


        mmc.updateView();

        

       
    }
    
}
