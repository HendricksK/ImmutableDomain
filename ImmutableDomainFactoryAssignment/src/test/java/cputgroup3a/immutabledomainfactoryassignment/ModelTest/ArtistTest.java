/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.immutabledomainfactoryassignment.ModelTest;

import cputgroup3a.immutabledomainfactoryassignment.model.music.Artist;
import cputgroup3a.immutabledomainfactoryassignment.model.music.Artist.artistBuilder;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author kurvin
 */
public class ArtistTest {
    
    public ArtistTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    public static artistBuilder artB;
    public static Artist art;
    
    @Test
    public static void testDisplay(){
        art = new Artist(artB);
        art.disp();
    }
    
    @Test
    public static void testArtist(){
        artB.setAlias("System Of A Down");
        artB.setArtistName("Serj Tankian, Daron Malakian, Shavo Odadjian, John Dolmayan, Andy Khachataturian");
        artB.setNationality("Armenian");
        artB.addToMusic(artB);
    }
    
    @BeforeClass
    public static void setUpClass() throws Exception {
        artB = new artistBuilder(2);
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
