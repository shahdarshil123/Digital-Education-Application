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

public class ProfessorCoursesDirectory {
    private ArrayList<ProfessorCourses> profCoursesList;

    public ProfessorCoursesDirectory() {
        this.profCoursesList = new ArrayList<ProfessorCourses>();   
    }

    public ArrayList<ProfessorCourses> getProfCoursesList() {
        return profCoursesList;
    }
    
    public ProfessorCourses findProfessorCourses(int profId){
        for(ProfessorCourses profCourses: profCoursesList){
            if(profCourses.getProfProfile().getPerson().getPersonId() == profId){
                return profCourses;
            }
        }
        return null;
    }
    
    public ProfessorCourses addProfessorCourses(ProfessorProfile professor){
        ProfessorCourses profCourses = new ProfessorCourses(professor);
        profCoursesList.add(profCourses);
        return profCourses;
    }
    
}
