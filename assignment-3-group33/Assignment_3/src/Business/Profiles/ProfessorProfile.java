/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Profiles;

import Business.Course.ProfessorCourses;
import Business.Person.Person;

/**
 *
 * @author Darshil Shah
 */
public class ProfessorProfile extends Profile {
    
    int experience;
    double rating;
    String region;
    String specialization;
    String language;
    //ProfessorCourseDirectory courseList;
    
    public ProfessorProfile(Person p){
        super(p);
        this.rating = 0.0;
        //this.courseList = new ProfessorCourses();
    }
    
    @Override
    public String getRole() {
        return("Faculty");
    }

    public int getExperience() {
        return experience;
     }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

//    public ProfessorCourses getCourseList() {
//        return courseList;
//    }

    
}
