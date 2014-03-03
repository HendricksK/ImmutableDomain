/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.immutabledomainfactoryassignment.ModelTest;

import cputgroup3a.immutabledomainfactoryassignment.model.vote.VoteDown.voteBuilder;
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
public class VotedownTest {
    
    public VotedownTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    public static voteBuilder vd;
    
    @Test
    public static void testVoteDown(){
        vd.setVote(6);
        vd.addToMedia(vd);
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        vd = new voteBuilder(56);
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
