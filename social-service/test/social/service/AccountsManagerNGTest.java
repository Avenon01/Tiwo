/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package social.service;

import static org.mockito.Mockito.mock;
import static org.testng.Assert.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Avenon
 */
public class AccountsManagerNGTest {
    Person personA;
    AccountsManager accManager;
    public AccountsManagerNGTest() {
    }
    @BeforeMethod
    public void SetUp(){
        personA=mock(Person.class);
        accManager=new AccountsManager();
    }
    //AccountManager should register person
    @Test
    public void accountManagerShouldRegisterUser() {
        accManager.registerUser(personA);
        assertTrue(accManager.userList.contains(personA));
    }
    
}
