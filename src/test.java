public class test 
{
    public static void main(String [] args)
    {
        MainMenu menuModel = new MainMenu();
        Faculty facultyModel = new Faculty();
        Course courseModel = new Course();

        MainMenuViewer menuViewer = new MainMenuViewer();
        FacultyLoginViewer flv = new FacultyLoginViewer();
        CourseDetailViewer cdv = new CourseDetailViewer();
        RegistrationViewer rv =  new RegistrationViewer();

        MainMenuController mmc= new MainMenuController(menuModel, menuViewer);
        FacultyLoginController flc = new FacultyLoginController(facultyModel, flv);
        CourseDetailsController cdc = new CourseDetailsController(courseModel, cdv);

        mmc.addPanel(flv, "FacultyLogin");
        mmc.addPanel(cdv, "CourseDetail");
        mmc.addPanel(rv, "Registration");

        flc.updateView();
        flc.setMenu(menuViewer);
        flc.setPanelLink("Registration");

        cdc.updateView();
        cdc.setMenu(menuViewer);


        mmc.updateView();

       
    }
    
}
