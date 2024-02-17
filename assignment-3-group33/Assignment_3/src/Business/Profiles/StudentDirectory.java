/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Profiles;

import Business.Business;
import Business.Person.Person;
import java.util.ArrayList;

/**
 *
 * @author Darshil Shah
 */
public class StudentDirectory {
    
    ArrayList<StudentProfile> studentList;
    public StudentDirectory(){
        studentList = new ArrayList<StudentProfile>();
    }

    public ArrayList<StudentProfile> getStudentList() {
        return studentList;
    }
    
    public StudentProfile addStudent(Person person){
       StudentProfile student = new StudentProfile(person);
       studentList.add(student);
       return student;
    }
    
    public StudentProfile findStudent(int studentId){
        for(StudentProfile student: studentList){
            if(student.getPerson().getPersonId() == studentId){
                return student;
            }
        }
        return null;
    }
}


