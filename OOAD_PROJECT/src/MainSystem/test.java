package MainSystem;
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
        CourseEmploymentViewer cev = new CourseEmploymentViewer();
        CourseDurationViewer cduv = new CourseDurationViewer();
        CourseScopeViewer csv = new CourseScopeViewer();
        FacultyUploadCourseViewer fucv = new FacultyUploadCourseViewer();
        FacultyUploadLevelViewer fulv = new FacultyUploadLevelViewer();

        MainMenuController mmc= new MainMenuController(menuModel, menuViewer);
        FacultyLoginController flc = new FacultyLoginController(facultyModel, flv);
        CourseDetailsController cdc = new CourseDetailsController(courseModel, cdv);
        CourseEmploymentController cec = new CourseEmploymentController(courseModel, cev);
        CourseDurationController cduc = new CourseDurationController(courseModel,cduv);
        CourseScopeController csc = new CourseScopeController(courseModel, csv);
        FacultyUploadCourseController fucc = new FacultyUploadCourseController(facultyModel, fucv);
        FacultyUploadLevelController fulc = new FacultyUploadLevelController(facultyModel, fulv);

        mmc.addPanel(flv, "FacultyLogin");
        mmc.addPanel(cdv, "CourseDetail");
        mmc.addPanel(rv, "Registration");
        mmc.addPanel(cev, "CourseEmployment");
        mmc.addPanel(cduv, "CourseDuration");
        mmc.addPanel(csv, "CourseScope");
        mmc.addPanel(fucv, "UploadCourse");
        mmc.addPanel(fulv, "UploadLevel");

        flc.updateView();
        flc.setMenu(menuViewer);
        flc.setPanelLink("Registration");

        cdc.updateView();
        cdc.setMenu(menuViewer);

        cec.updateView();
        cec.setMenu(menuViewer);
        cec.setPanelLink("CourseEmployment");

        cduc.updateView();
        cduc.setMenu(menuViewer);
        cduc.setPanelLink("CourseDuration");

        csc.updateView();
        csc.setMenu(menuViewer);
        csc.setPanelLink("CourseScope");

        fucc.updateView();
        fucc.setMenu(menuViewer);
        fucc.setPanelLink("UploadCourse");

        fulc.updateView();
        fulc.setMenu(menuViewer);
        fulc.setPanelLink("UploadLevel");

        mmc.updateView();

       
    }
    
}
