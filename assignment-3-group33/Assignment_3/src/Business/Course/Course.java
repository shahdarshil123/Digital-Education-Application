/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Course;

/**
 *
 * @author anusreemohanan
 */
public class Course {
    private int CourseID;
    private String CourseName;
    private String CourseDescription;
    private String CourseSchedule; 
    private int CourseCredits;
    
    public Course(int courseID, String name){
        this.CourseID = courseID;
        this.CourseName = name;
    }

    public int getCourseID() {
        return CourseID;
    }

    public void setCourseID(int CourseID) {
        this.CourseID = CourseID;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String CourseName) {
        this.CourseName = CourseName;
    }

    public String getCourseDescription() {
        return CourseDescription;
    }

    public void setCourseDescription(String CourseDescription) {
        this.CourseDescription = CourseDescription;
    }

    public String getCourseSchedule() {
        return CourseSchedule;
    }

    public void setCourseSchedule(String CourseSchedule) {
        this.CourseSchedule = CourseSchedule;
    }

    public int getCourseCredits() {
        return CourseCredits;
    }

    public void setCourseCredits(int CourseCredits) {
        this.CourseCredits = CourseCredits;
    }
   @Override
   public String toString(){
       return(Integer.toString(CourseID));
   }
    
}
