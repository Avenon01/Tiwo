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
public class Account {
    private Collection<Person> friends;
    private Collection<Picture> pictures;
    private Person person;
    private String password;
    private String email;
    public Account(Person person, String email,String password){
        friends=new HashSet<>();
        pictures=new ArrayList<>();
        this.person=person;
        this.email=email;
        this.password=password;
    }

    public boolean setPassword(String password) {
        if(password.length()>=8)
            this.password=password;
        else
            return false;
        return true;
    }
    String getPassword(){
        return password;
    }
    
}
