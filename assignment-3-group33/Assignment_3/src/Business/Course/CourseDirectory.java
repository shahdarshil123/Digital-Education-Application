/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Course;

import java.util.ArrayList;

/**
 *
 * @author Darshil Shah
 */
public class CourseDirectory {
    private static int courseId = 0; 
    private ArrayList<Course> courseList;
    
    public CourseDirectory(){
        courseList = new ArrayList<Course>();
    }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }
    
    public Course addCourse(String name){
        courseId++;
        Course course = new Course(courseId, name);
        courseList.add(course);
        return course;
    }
    
    public Course findCourse(String name){
        for(Course course: courseList){
            if(course.getCourseName().equals(name)){
                return course;
            }
        }
        return null;
    }
    
    
}
