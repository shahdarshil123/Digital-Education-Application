/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserInterface;

import Business.Business;
import Business.Course.Course;
import Business.Course.CourseDirectory;
import Business.Course.CourseSemester;
import Business.Course.ProfessorCoursesDirectory;
import Business.Course.StudentBrowseCoursesDirectory;
import Business.Course.StudentCourseDirectory;
import Business.Person.Person;
import Business.Person.PersonDirectory;
import Business.Profiles.EmployeeDirectory;
import Business.Profiles.EmployeeProfile;
import Business.Profiles.ProfessorDirectory;
import Business.Profiles.ProfessorProfile;
import Business.Profiles.StudentDirectory;
import Business.Profiles.StudentProfile;
import Business.UserAccounts.UserAccount;
import Business.UserAccounts.UserAccountDirectory;

/**
 *
 * @author Darshil Shah
 */
public class ConfigureBusiness {
    public static Business initialize(){
        Business business = new Business("Coursera");
        business.setCurrentSemester("Spring 2024");
        PersonDirectory personList = business.getPersonList();
        ProfessorDirectory professorList = business.getProfessorList();
        StudentDirectory studentList = business.getStudentList();
        UserAccountDirectory userAccount = business.getUserAccountList();
        CourseDirectory courseList = business.getCourseList();
        ProfessorCoursesDirectory professorCouresList = business.getProfCoursesList();
        StudentBrowseCoursesDirectory studentBrowseCoursesList = business.getStudentBrowseCoursesList();
        StudentCourseDirectory studentCourseList = business.getStudentCoursesList();
        EmployeeDirectory emplyoeeList = business.getEmployeeList();
        
        Person person1 = new Person(1,"Darshil Shah");
        Person person2 = new Person(2,"Chiranjit Banerjee");
        Person person3 = new Person(3,"Anusree Mohanan");
        Person person4 = new Person(4,"Admin");
        Person person5 = new Person(5,"Rajesh Sharma");
        Person person6 = new Person(6, "Emma Parker");
        Person person7 = new Person(7, "David Collins");
        Person person8 = new Person(8, "Mira Patel");
        Person person9 = new Person(9, "Neha Reddy");
        Person person10 = new Person(10, "Sanjay Malhotra");
        Person person11 = new Person(11, "Grace Taylor");
        Person person12 = new Person(12, "Vikram Sharma");
        
        

        
        ProfessorProfile professor1 = professorList.addProfessor(person1);
        ProfessorProfile professor2 = professorList.addProfessor(person2);
        ProfessorProfile professor5 = professorList.addProfessor(person5);
        StudentProfile student1 = studentList.addStudent(person3);
        EmployeeProfile admin1 = emplyoeeList.addEmployee(person4);
    
        UserAccount user1 = userAccount.addProfessorAccount(professor1,"darshil","dar123");
        //user1.getProfessorProfile().setRegion(region);
        populateProfessor(user1);
 
        UserAccount user2 = userAccount.addProfessorAccount(professor2,"chiranjit","chi123");
        populateProfessor(user2);
        UserAccount user5 = userAccount.addProfessorAccount(professor5,"Rajesh","r123");
        populateProfessor(user5);
        
        UserAccount user3 = userAccount.addStudentAccount(student1,"anu", "anu");
        UserAccount user4 = userAccount.addEmployeeAccount(admin1,"Admin", "Admin123");
        
//        Course course1 = new Course(1,"Information Systems");
//        Course course2 = new Course(2,"Database Management System");
        courseList.addCourse("Application Engineering Development");
        courseList.addCourse("Database Management Database Design");
        courseList.addCourse("Data Science Engineering and Tools");
        courseList.addCourse("Supervised Machine Learning");
        courseList.addCourse("Neural Modelling and Methods");
        courseList.addCourse("Web Design and User Experience");
        courseList.addCourse("Big Data Architecture and Governance");
        courseList.addCourse("Data Warehousing and Business Intelligence");
        courseList.addCourse("Operating Systems");
        courseList.addCourse("Network Structure and Cloud Computing");
                
        
        professorCouresList.addProfessorCourses(user1.getProfessorProfile());
        professorCouresList.addProfessorCourses(user2.getProfessorProfile());
        
        Course course1 = courseList.findCourse("Application Engineering Development"); 
        Course course2 = courseList.findCourse("Database Management Database Design");
        Course course3 = courseList.findCourse("Data Science Engineering and Tools");
        Course course4 = courseList.findCourse("Supervised Machine Learning");
        Course course5 = courseList.findCourse("Neural Modelling and Methods");
        Course course6 = courseList.findCourse("Web Design and User Experience");
        Course course7 = courseList.findCourse("Big Data Architecture and Governance");
        Course course8 = courseList.findCourse("Data Warehousing and Business Intelligence");
        Course course9 = courseList.findCourse("Operating Systems");
        Course course10 = courseList.findCourse("Network Structure and Cloud Computing");
        
        CourseSemester courseSemester1 = professorCouresList.findProfessorCourses(person1.getPersonId()).addCourseSemester(course1,"Spring 2024");
        CourseSemester courseSemester2 =  professorCouresList.findProfessorCourses(person2.getPersonId()).addCourseSemester(course2, "Fall 2024");
        
        //business.getStudentBrowseCoursesList()
        studentBrowseCoursesList.addProfessorCourse(professor1,courseSemester1);
        studentBrowseCoursesList.addProfessorCourse(professor2,courseSemester2);
        
        studentCourseList.addStudentList(student1);
        
       

        return business;
    }
        public static void populateProfessor(UserAccount user){
        String region = "America";
        String language = "English";
        String specialization = "INFO";
        user.getProfessorProfile().setRegion(region);
        user.getProfessorProfile().setLanguage(language);
        user.getProfessorProfile().setSpecialization(specialization);
        }
}
