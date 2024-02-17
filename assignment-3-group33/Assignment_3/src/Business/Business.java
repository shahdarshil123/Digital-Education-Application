/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Course.CourseDirectory;
import Business.Course.ProfessorCourses;
import Business.Course.ProfessorCoursesDirectory;
import Business.Course.StudentBrowseCoursesDirectory;
import Business.Course.StudentCourseDirectory;
import Business.Person.PersonDirectory;
import Business.Profiles.EmployeeDirectory;
import Business.Profiles.ProfessorDirectory;
import Business.Profiles.StudentDirectory;
import Business.UserAccounts.UserAccountDirectory;

/**
 *
 * @author Darshil Shah
 */
public class Business {
    String name;
    String currentSemester;
    PersonDirectory personList;
    EmployeeDirectory employeeList;
    StudentDirectory studentList;
    ProfessorDirectory professorList;
    UserAccountDirectory userAccountList;
    CourseDirectory courseList;
    ProfessorCoursesDirectory profCoursesList;
    StudentBrowseCoursesDirectory studentBrowseCoursesList;
    StudentCourseDirectory studentCoursesList;
    
    public Business(String name){
        this.name = name;
        this.personList = new PersonDirectory();
        this.userAccountList = new UserAccountDirectory();
        this.professorList = new ProfessorDirectory();
        this.studentList = new StudentDirectory();
        this.employeeList = new EmployeeDirectory();
        this.courseList = new CourseDirectory();
        this.profCoursesList = new ProfessorCoursesDirectory();
        this.studentBrowseCoursesList = new StudentBrowseCoursesDirectory();
        this.studentCoursesList = new StudentCourseDirectory();
    }

    public PersonDirectory getPersonList() {
        return personList;
    }

    public StudentDirectory getStudentList() {
        return studentList;
    }

    public ProfessorDirectory getProfessorList() {
        return professorList;
    }

    public String getName() {
        return name;
    }

    public EmployeeDirectory getEmployeeList() {
        return employeeList;
    }

    public UserAccountDirectory getUserAccountList() {
        return userAccountList;
    }

    public CourseDirectory getCourseList() {
        return courseList;
    }

    public ProfessorCoursesDirectory getProfCoursesList() {
        return profCoursesList;
    }

    public StudentBrowseCoursesDirectory getStudentBrowseCoursesList() {
        return studentBrowseCoursesList;
    }

    public StudentCourseDirectory getStudentCoursesList() {
        return studentCoursesList;
    }

    public String getCurrentSemester() {
        return currentSemester;
    }

    public void setCurrentSemester(String currentSemester) {
        this.currentSemester = currentSemester;
    }
    
 
}
