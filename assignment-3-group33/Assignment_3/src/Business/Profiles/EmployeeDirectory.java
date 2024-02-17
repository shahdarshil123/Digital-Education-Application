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
public class EmployeeDirectory {
    ArrayList<EmployeeProfile> employeeList;
    
    public EmployeeDirectory(){
        this.employeeList = new ArrayList<EmployeeProfile>();
    }

    public ArrayList<EmployeeProfile> getEmployeeList() {
        return employeeList;
    }
    
       public EmployeeProfile addEmployee(Person person){
       EmployeeProfile employee = new EmployeeProfile(person);
       employeeList.add(employee);
       return employee;
    }
}
