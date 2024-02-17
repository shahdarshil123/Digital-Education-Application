/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Course;

import Business.Business;
import Business.Profiles.ProfessorProfile;
import java.util.ArrayList;
import static javax.management.Query.and;

/**
 *
 * @author Darshil Shah
 */
public class StudentBrowseCoursesDirectory {
    private static int professorCourseCounter = 2;
    private ArrayList<StudentBrowseCourses> studentBrowseCoursesList;
    
    public StudentBrowseCoursesDirectory(){
        studentBrowseCoursesList = new ArrayList<StudentBrowseCourses>();
    }

    public static int getProfessorCourseCounter() {
        return professorCourseCounter;
    }


    public ArrayList<StudentBrowseCourses> getStudentBrowseCoursesList() {
        return studentBrowseCoursesList;
    }
    
    
    public StudentBrowseCourses addProfessorCourse(ProfessorProfile professor, CourseSemester courseSemester){
        professorCourseCounter++;
        StudentBrowseCourses studentBrowseCourse = new StudentBrowseCourses(professorCourseCounter, courseSemester, professor);
        studentBrowseCoursesList.add(studentBrowseCourse);
        return studentBrowseCourse;
    }
    
    public void removeProfessorCourses(ProfessorProfile professor, Course course){
        for(StudentBrowseCourses studentBrowseCourse:studentBrowseCoursesList){
            if(studentBrowseCourse.getCourseSemester().getCourse() == course && studentBrowseCourse.getProfessor() == professor ){
                studentBrowseCoursesList.remove(studentBrowseCourse);
            }
        }
    }
}
