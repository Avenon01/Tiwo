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
public class AccountNGTest {
    Person personA;
    Person personB;
    Account acc;
    Picture picture;
     
    @BeforeMethod
    public void SetUp(){
        personA = mock(Person.class);
        acc= new Account(personA,"test@test.com","password");
        picture=mock(Picture.class);
    }
    
    //set password should have 8 letters
    @Test
    public void setPasswordShouldHave8Letters () {
        acc.setPassword("pass");
        assertNotEquals("pass",acc.getPassword());
        assertEquals("password",acc.getPassword());
    }
    //user should add Picture to its pictures
    @Test
    public void addPictureToItsPictures(){
        acc.addPicture(picture);
        assertTrue(acc.pictures.contains(picture));
    }
    //user should addPictureToItsPicturesAndSetAsMainPicture
    @Test
    public void userShouldAddPictureAndSetAsMainPicture(){
        acc.addPicture(picture,true);
        assertTrue(acc.pictures.contains(picture));
        assertTrue(picture.equals(acc.mainPicture));
    }

}
