/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package social.service;


import java.util.Arrays;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.testng.Assert.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Avenon
 */
public class SocialServiceNGTest {
    Account userA;
    SocialService socialService;
    
    @BeforeMethod
    public void SetUp(){
        userA=mock(Account.class);
        MailManager mailManager=mock(MailManager.class);
        socialService=new SocialService(mailManager);
    }
    //AccountManager should register person
    @Test
    public void accountManagerShouldRegisterUser() {
        socialService.registerUser(userA);
        assertTrue(socialService.userList.contains(userA));
    }
    //AccountManager should not register one person twice time
    @Test
    public void accountManagerShouldNotRegisterOneUserTwiceTime(){
        socialService.registerUser(userA);
        socialService.registerUser(userA);
        assertTrue(socialService.userList.size()==1);
    }
    @Test
    public void accountManagerShouldUnregisterUser(){
        socialService.registerUser(userA);
        socialService.unregisterUser(userA);
        assertFalse(socialService.userList.contains(userA));
    }
    //registering new user should send message veryfication on email
    @Test
    public void registeringNewUserShouldSendMailVerifyAdress(){
        socialService.registerUser(userA);
        verify(socialService.mailManager).sendMailVeryficationMessage(anyString());

    }
    //registering new user should send message veryfication on email
    @Test
    public void registeringNewUserShouldSendMailVerifyAdressOnRightAdress(){
        Account user=new Account(mock(Person.class),"test@mail.com","password1");
        socialService.registerUser(user);
        verify(socialService.mailManager).sendMailVeryficationMessage("test@mail.com");

    }
}
