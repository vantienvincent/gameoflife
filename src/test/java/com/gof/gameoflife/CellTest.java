/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gof.gameoflife;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tien
 */
public class CellTest {
    
    public CellTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setnewState method, of class Cell.
     */
    @Test
    public void testSetnewState() {
        System.out.println("setnewState");
        boolean state = false;
        Cell instance = new Cell();
        
        instance.setnewState(state);
        assertEquals(state, instance.getNewState());
    }

    /**
     * Test of setState method, of class Cell.
     */
    @Test
    public void testSetState() {
        System.out.println("setState");
        boolean state = false;
        Cell instance = new Cell();
        instance.setState(state);
        assertEquals(state, instance.getState());
    }

    /**
     * Test of updateState method, of class Cell.
     */
    @Test
    public void testUpdateState() {
        System.out.println("updateState");
        Cell instance = new Cell();
        instance.updateState();
        assertEquals(false, instance.getState());
    }

    /**
     * Test of getState method, of class Cell.
     */
    @Test
    public void testGetState() {
        System.out.println("getState");
        Cell instance = new Cell();
        boolean expResult = false;
        boolean result = instance.getState();
        assertEquals(expResult, result);
    }
    
}
