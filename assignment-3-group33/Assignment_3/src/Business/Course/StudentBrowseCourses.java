/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Course;

import Business.Business;
import Business.Profiles.ProfessorProfile;

/**
 *
 * @author Darshil Shah
 */
public class StudentBrowseCourses {
    private int profCourseId;
    private CourseSemester courseSemester; 
    private ProfessorProfile professor;
    public StudentBrowseCourses(int profCourseId,CourseSemester courseSemester , ProfessorProfile professor){
        this.profCourseId = profCourseId;
        this.courseSemester = courseSemester;
        this.professor = professor;
    }

    public int getProfCourseId() {
        return profCourseId;
    }

    public CourseSemester getCourseSemester() {
        return courseSemester;
    }

    public ProfessorProfile getProfessor() {
        return professor;
    }
    @Override
    public String toString(){
        return(Integer.toString(courseSemester.getCourse().getCourseID()));
    }
}
