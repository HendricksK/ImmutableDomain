/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.immutabledomainfactoryassignment.ModelTest;

import cputgroup3a.immutabledomainfactoryassignment.model.music.Song;
import cputgroup3a.immutabledomainfactoryassignment.model.music.Song.songBuilder;
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
public class SongTest {
    
    public SongTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    public static songBuilder sb;
    public static Song s;
    
    
    @Test
    public static void testSong(){
        sb.setArtist("For All Those Sleeping");
        sb.setLength("4:37");
        sb.setName("Janice, It Ain't Funny");
        sb.setAlbum("Cross Your Fingers");
        sb.addToMusic(sb);
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        sb = new songBuilder(23);
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
