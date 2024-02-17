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
public class ProfessorDirectory {
    ArrayList<ProfessorProfile> professorList;
    
    public ProfessorDirectory(){
        professorList = new ArrayList<ProfessorProfile>();
    }

    public ArrayList<ProfessorProfile> getProfessorList() {
        return professorList;
    }
    
   public ProfessorProfile addProfessor(Person person){
       ProfessorProfile professor = new ProfessorProfile(person);
       professorList.add(professor);
       return professor;
    }
    
}
