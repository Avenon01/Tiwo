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
public class SocialService {
    Collection<Account> userList=new HashSet<>();
    MailManager mailManager;
    
    SocialService(MailManager mailManager){
        this.mailManager = mailManager;
    }
    
    public  void registerUser(Account account){
        userList.add(account);
        mailManager.sendMailVeryficationMessage(account.getMail());
    }
    
    public  void unregisterUser(Account account){
        userList.remove(account);
    }
    
    public static void main(String[] args) {

    }
    
}
