/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Profiles;

import Business.Person.Person;

/**
 *
 * @author Darshil Shah
 */
public abstract class Profile {
    Person person;
    public Profile(Person p){
        this.person = p; 
    }
    
    public abstract String getRole();
    
    public Person getPerson() {
        return person;
    }

    
}
