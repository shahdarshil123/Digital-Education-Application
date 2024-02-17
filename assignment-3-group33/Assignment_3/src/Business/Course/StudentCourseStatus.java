/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Course;

import Business.Profiles.StudentProfile;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author Darshil Shah
 */
public class StudentCourseStatus {
    private String courseStatus;
    private double proffesorRating = 0;
    private StudentBrowseCourses studentBrowseCourses;
    
    public StudentCourseStatus(StudentBrowseCourses studentBrowseCourse){
        this.courseStatus = "In Progress";
        this.studentBrowseCourses = studentBrowseCourse;
        
    }

    public String getCourseStatus() {
        return courseStatus;
    }

    public void setCourseStatus(String courseStatus) {
        this.courseStatus = courseStatus;
    }

    public StudentBrowseCourses getStudentBrowseCourses() {
        return studentBrowseCourses;
    }

    public double getProffesorRating() {
        return proffesorRating;
    }

    public void setProffesorRating(double proffesorRating) {
        this.proffesorRating = proffesorRating;
    }
    
   @Override
   public String toString(){
       return courseStatus;
   }
}
