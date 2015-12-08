/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package social.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

/**
 *
 * @author Avenon
 */
public class Account {
    private Collection<Person> friends;
    public ArrayList<Picture> pictures;
    private Person person;
    private String password;
    private String email;
    public Picture mainPicture;
    public Account(Person person, String email,String password){
        friends=new HashSet<>();
        pictures=new ArrayList<>();//ArrayList<Picture>();
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

    String getMail() {
        return email;
    }

    void addPicture(Picture picture, boolean b, Person personB) {
        
    }

    void addPicture(Picture picture) {
        pictures.add(picture);
    }
    void addPicture(Picture picture,boolean setAsMainPicture) {
        pictures.add(picture);
        mainPicture = picture;
    }

    void addMarksToPicture(Picture picture, Person personB) {
        if(getPicture(picture)!=null)
           getPicture(picture).addMarkerOfPerson(personB);
    }

    Picture getPicture(Picture picture) {
        return pictures.contains(picture) ? pictures.get(pictures.indexOf(picture)) : null;
    }

    void setMainPicture(Picture picture) {
        if(getPicture(picture)!=null)
            mainPicture=getPicture(picture);
    }

    
}
