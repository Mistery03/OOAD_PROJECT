package MainSystem;
public class Course 
{
   String courseName, courseDuration, courseLvlEntry, courseDesc, courseVidFilePath; 

    public String getCourseName() {return this.courseName;}
    public String getCourseDuration(){return this.courseDuration;}
    public String getCourseLvlEntry() {return this.courseLvlEntry;}
    public String getCourseDesc() {return this.courseDesc;}
    public String getCourseVidFilePath() {return this.courseVidFilePath;}

    public void setCourseName(String courseName){ this.courseName = courseName;}
    public void setCourseDuration(String courseDuration){this.courseDuration = courseDuration; }
    public void setCourseLvlEntry(String courseLvlEntry){ this.courseLvlEntry = courseLvlEntry;}
    public void setCourseDesc(String courseDesc){ this.courseDesc = courseDesc;}
    public void setCourseVidFilePath(String courseVidFilePath){ this.courseVidFilePath = courseVidFilePath;}

}
