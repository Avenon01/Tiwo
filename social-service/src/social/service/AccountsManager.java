/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package social.service;

import java.util.Collection;

/**
 *
 * @author Avenon
 */
public abstract class AccountsManager {
    Collection<Person> UserList;
    
    public abstract void registerUser(Person person);
    public abstract void unregisterUser(Person person);
}
