/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.UserAccounts;

import Business.Profiles.EmployeeProfile;
import Business.Profiles.ProfessorProfile;
import Business.Profiles.Profile;
import Business.Profiles.StudentProfile;

/**
 *
 * @author Darshil Shah
 */
public class UserAccount {
    private String username;
    private String password;
    private String role;
    private ProfessorProfile professorProfile;
    private StudentProfile studentProfile;
    private EmployeeProfile employeeProfile;
    
//    public UserAccount(Profile profile,String username, String password){
//        this.profile = profile;
//        this.username = username;
//        this.password = password;
//    }
    
    public UserAccount(ProfessorProfile professorProfile, String username, String password){
        this.professorProfile = professorProfile;
        this.username = username;
        this.password = password;
        this.role = "Faculty"; 
    }
    
    public UserAccount(StudentProfile studentProfile, String username, String password){
        this.studentProfile = studentProfile;
        this.username = username;
        this.password = password;
        this.role = "Student"; 
    }

    UserAccount(EmployeeProfile employeeProfile, String username, String password) {
        this.employeeProfile = employeeProfile;
        this.username = username;
        this.password = password;
        this.role = "Admin"; 
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public ProfessorProfile getProfessorProfile() {
        return professorProfile;
    }

    public StudentProfile getStudentProfile() {
        return studentProfile;
    }

    public EmployeeProfile getEmployeeProfile() {
        return employeeProfile;
    }
   
    
}
