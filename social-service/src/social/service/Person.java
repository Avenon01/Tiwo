/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package social.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 *
 * @author Avenon
 */
public class Person {
    Collection<Person> friends= new HashSet<>();
    PersonalData personalData=new PersonalData();
    Collection<Picture> pictures=new ArrayList<Picture>();
    
    
    public Person(PersonalData personalData, Picture profilePicture){
        
    }
    public Person(PersonalData personalData){
        
    }
            
}