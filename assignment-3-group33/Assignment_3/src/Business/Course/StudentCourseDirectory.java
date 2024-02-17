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
public class StudentCourseDirectory {
    
    private ArrayList<StudentCourses> studentCourseList;
    public StudentCourseDirectory(){
        this.studentCourseList = new ArrayList<StudentCourses>();
    }

    public ArrayList<StudentCourses> getStudentCourseList() {
        return studentCourseList;
    }
    
    public StudentCourses addStudentList(StudentProfile student){
        StudentCourses studentCourses = new StudentCourses(student);
        studentCourseList.add(studentCourses);
        return studentCourses;
    }
    
    public StudentCourses findStudentCourses(StudentProfile student){
        for(StudentCourses studentCourses: studentCourseList){
            if(studentCourses.getStudent() == student){
                return studentCourses;
            }
        }
        return null;
    }
    
    
}
