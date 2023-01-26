package MainSystem;

import java.util.ArrayList;

public class Course 
{
    String courseLvlEntry, courseDuration;
    ArrayList <String>  courseName, courseDesc,courseVidFilePath; 

    Course()
    {
        courseName = new ArrayList<String>();
    }

    public ArrayList<String> getCourseName() {return this.courseName;}
    public String getCourseLvlEntry() {return this.courseLvlEntry;}
    public ArrayList<String> getCourseDesc() {return this.courseDesc;}
    public ArrayList<String> getCourseVidFilePath() {return this.courseVidFilePath;}

    public void setCourseName(ArrayList<String> courseName){ this.courseName = courseName;}
    public void setCourseLvlEntry(String courseLvlEntry){ this.courseLvlEntry = courseLvlEntry;}
    public void setCourseDesc(ArrayList<String> courseDesc){ this.courseDesc = courseDesc;}
    public void setCourseVidFilePath(ArrayList<String> courseVidFilePath){ this.courseVidFilePath = courseVidFilePath;}

   


}
