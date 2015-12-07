/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package social.service;

import java.util.Collection;
import java.util.HashSet;

/**
 *
 * @author Avenon
 */
public class AccountsManager {
    Collection<Person> userList=new HashSet<>();
    
    public  void registerUser(Person person){
    userList.add(person);
    }
    public  void unregisterUser(Person person){}
}
