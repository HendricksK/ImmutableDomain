/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.immutabledomainfactoryassignment.ModelTest;

import cputgroup3a.immutabledomainfactoryassignment.model.music.Album;
import cputgroup3a.immutabledomainfactoryassignment.model.music.Album.albumBuilder;
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
public class AlbumTest {
    
    public AlbumTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    public static albumBuilder a;
    public static Album ab;
    
    @Test
    public static void testDisp(){
        ab = new Album(a);
        ab.disp();
    }
    
    @Test
    public static void testAlbum(){
       a.setAlbumName("The Virtual Kids");
       a.setRelease("2013/12/12");
       a.addToMusic(a);
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        a = new albumBuilder(1);
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
