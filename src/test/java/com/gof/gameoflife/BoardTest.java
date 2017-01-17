/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gof.gameoflife;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author tien
 */
public class BoardTest {
    
    public BoardTest() {
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

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    @Test
    public void numberOfNeighbors(){
//        Board board = new Board(2,2);
//        Cell[][] cells = new Cell[2][2];
        
        Cell[][] cells = {
                {new Cell(true), new Cell(true), new Cell(true)}, 
                {new Cell(true), new Cell(true), new Cell(true)}, 
                {new Cell(true), new Cell(true), new Cell(true)}
                };
        Board board = new Board(cells);
        assertEquals(3, board.numberOfNeighbors(0, 0));
        assertEquals(8, board.numberOfNeighbors(1, 1));
        assertEquals(5, board.numberOfNeighbors(1, 0));
    }
    
    @Test
    public void testisAlive(){
        Cell[][] cells = {
                {new Cell(true), new Cell(true), new Cell(true)}, 
                {new Cell(), new Cell(true), new Cell(true)}, 
                {new Cell(), new Cell(true), new Cell(true)}
                };
        Board board = new Board(cells);
        assertEquals(true, board.isAlive(0,0));
        assertEquals(false, board.isAlive(1,0));
    }
}
