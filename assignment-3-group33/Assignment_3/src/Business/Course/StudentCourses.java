/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Course;

import Business.Profiles.ProfessorProfile;
import Business.Profiles.StudentProfile;
import java.util.ArrayList;

/**
 *
 * @author Darshil Shah
 */
public class StudentCourses {
    private StudentProfile student;
    private ArrayList<StudentCourseStatus> studentCoursesList;
    
    public StudentCourses(StudentProfile student){
       this.studentCoursesList = new ArrayList<StudentCourseStatus>();
       this.student = student;
    }

    public StudentProfile getStudent() {
        return student;
    }

    public ArrayList<StudentCourseStatus> getStudentCourses() {
        return studentCoursesList;
    }

    
    public StudentCourseStatus addStudentCourseStatus(StudentBrowseCourses studentBrowseCourses){
        StudentCourseStatus studentCourseStatus = new StudentCourseStatus(studentBrowseCourses);
        studentCoursesList.add(studentCourseStatus); 
        return studentCourseStatus;
    }
    
    public void removeProfessorCourse(StudentBrowseCourses studentBrowseCourses){
        for(StudentCourseStatus studentCourseStatus: studentCoursesList){
            if(studentCourseStatus.getStudentBrowseCourses() == studentBrowseCourses){
               studentCoursesList.remove(studentCourseStatus); 
            }
        }
        
    }
    
    public StudentCourseStatus findStudentCourseStatus(StudentBrowseCourses studentBrowseCourses){
        for(StudentCourseStatus studentCourseStatus: studentCoursesList){
            if(studentCourseStatus.getStudentBrowseCourses() == studentBrowseCourses){
                return studentCourseStatus;
            }
        }
        return null;
    }
    
}
