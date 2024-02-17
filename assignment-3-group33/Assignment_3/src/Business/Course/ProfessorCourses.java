/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Course;

import Business.Profiles.ProfessorProfile;
import java.util.ArrayList;

/**
 *
 * @author Darshil Shah
 */
public class ProfessorCourses {
    
    private ProfessorProfile profProfile;
    private ArrayList<CourseSemester> profCourseList;
    
    public ProfessorCourses(ProfessorProfile profProfile){
        this.profProfile = profProfile;
        profCourseList = new ArrayList<CourseSemester>();
    }

    public ArrayList<CourseSemester> getProfCourseList() {
        return profCourseList;
    }

    public void setProfCourseList(ArrayList<CourseSemester> courseList) {
        this.profCourseList = courseList;
    }

    public ProfessorProfile getProfProfile() {
        return profProfile;
    }

    
    public CourseSemester addCourseSemester(Course course, String semester){
        CourseSemester courseSemester = new CourseSemester(course, semester);
        profCourseList.add(courseSemester);
        return courseSemester;
    }
    
    public CourseSemester findCourseSemester(Course course, String semester){
        for(CourseSemester courseSemester: profCourseList){
            if((courseSemester.getCourse() == course) && (courseSemester.getSemester()).equals(semester)){
            return courseSemester;
        }
        }
        return null;
    }
    public void deleteCourseSemester(CourseSemester courseSemester){
        //CourseSemester courseSemester = findCourseSemester(course, semester);
        profCourseList.remove(courseSemester);
    }

    
}
