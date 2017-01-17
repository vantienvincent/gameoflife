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
public class ViewTest {
    
    public ViewTest() {
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
     * Test of generateASCIIText method, of class View.
     */
    @Test
    public void testGenerateASCIIText() {
        System.out.println("generateASCIIText");
        Cell[][] cells = {
                {new Cell(true), new Cell(true), new Cell(true)}, 
                {new Cell(true), new Cell(true), new Cell(true)}, 
                {new Cell(true), new Cell(true), new Cell(true)}
                };
        Board board = new Board(cells);
        View instance = new View();
        instance.setBoard(board);
        instance.generateASCIIText();
        assertEquals(true, true);
    }
    @Test
    public void testchangeState(){
        
        Cell[][] cells = {
                {new Cell(), new Cell(true)}, 
                {new Cell(), new Cell(true)}, 
                };
        Board board = new Board(cells);
        View instance = new View();        
        instance.setBoard(board);        
        instance.changeState();
        boolean expected = false;
        assertEquals(false, instance.getBoard().getCells()[0][0].getState());
        
    }
    
    
}
