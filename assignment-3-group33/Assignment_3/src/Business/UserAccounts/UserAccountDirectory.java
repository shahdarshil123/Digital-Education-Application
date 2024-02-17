/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.UserAccounts;

import Business.Profiles.EmployeeProfile;
import Business.Profiles.ProfessorProfile;
import Business.Profiles.Profile;
import Business.Profiles.StudentProfile;
import java.util.ArrayList;

/**
 *
 * @author Darshil Shah
 */
public class UserAccountDirectory {
    ArrayList<UserAccount> userAccountList;
    
    public UserAccountDirectory(){
        userAccountList = new ArrayList<UserAccount>();
    }
    
    public UserAccount searchUserAccount(String username){
       for(UserAccount ua: userAccountList){
           if((ua.getUsername()).equals(username)){
               return ua;
           }
       }
       return null;
    }
    
    public UserAccount addProfessorAccount(ProfessorProfile profile, String username, String password){
        UserAccount userAccount = new UserAccount(profile,username,password);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public UserAccount addStudentAccount(StudentProfile profile, String username, String password){
        UserAccount userAccount = new UserAccount(profile, username, password);
        userAccountList.add(userAccount);
        return userAccount;
    }
    public UserAccount addEmployeeAccount(EmployeeProfile profile, String username, String password){
        UserAccount userAccount = new UserAccount(profile, username, password);
        userAccountList.add(userAccount);
        return userAccount;
    }
    public boolean AuthenticateUser(UserAccount userAccount, String password){
        if(userAccount == null){
            return false;
        }
        else{
           if((userAccount.getPassword()).equals(password)){
               return true;
           }
           return false;
        }
    }
    
    
}
