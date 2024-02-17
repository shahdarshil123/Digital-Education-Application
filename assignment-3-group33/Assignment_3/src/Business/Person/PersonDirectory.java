/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Person;

import java.util.ArrayList;

/**
 *
 * @author Darshil Shah
 */
public class PersonDirectory {
    private static int id = 4;
    private ArrayList<Person> personList;
    
    public PersonDirectory(){
        id++;
        this.personList = new ArrayList<Person>();
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }
    
    public Person addPerson(String name){
        Person person = new Person(PersonDirectory.id, name);
        personList.add(person); 
        PersonDirectory.id++;
        return person;
    }
}
