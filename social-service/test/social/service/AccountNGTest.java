/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package social.service;

import static org.mockito.Mockito.mock;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author Avenon
 */
public class AccountNGTest {
    
    //set password should have 8 letters
    @Test
    public void setPasswordShouldHave8Letters () {
        Person person = mock(Person.class);
        Account acc= new Account(person,"test@test.com","password");
        acc.setPassword("pass");
        assertNotEquals("pass",acc.getPassword());
        assertEquals("password",acc.getPassword());
    }
    
}
