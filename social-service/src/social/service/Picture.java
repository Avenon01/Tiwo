/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package social.service;

import java.awt.Image;
import java.util.Collection;
import java.util.HashSet;

/**
 *
 * @author Avenon
 */
public interface Picture {
    int width = 0;
    int hight = 0;
    Image image= null;
    public Collection<Person> markersOfPeople=new HashSet<>();
    
    void addMarkerOfPerson(Person person);
}
