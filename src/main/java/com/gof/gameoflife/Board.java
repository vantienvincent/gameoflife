/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gof.gameoflife;

/**
 *
 * @author tien
 */
public class Board {

    private Cell[][] cells;
    private int height;
    private int witdh;
    
    
    public Board(){
        
    }
    /**
     * 
     * @param cells 
     */
    public Board(Cell[][] cells){
        this.cells = cells;
        this.height = this.witdh = cells.length;
    }
    public Cell[][] getCells(){
        return this.cells;
    }
    /**
     * init the board
     * @param heigh
     * @param width 
     */
    public Board(int heigh, int width, double prob){
        
        this.height = heigh;
        this.witdh = width;
        this.cells = new Cell[this.height][this.witdh];
        System.out.println("com.gof.gameoflife.GoLBoard.<init>()"+cells);
        for ( int i = 0; i < this.height; i++){
            
            for (int j = 0; j < this.witdh; j++){
                this.cells[i][j] = new Cell();
                if(Math.random() < prob){
                    this.cells[i][j].setState(true);
                }
                else{
                    this.cells[i][j].setState(false);
                }
                
            }
        }
    }
    
    public int getHeight(){
        return this.height;
    }
    
    public int getWidth(){
        return this.witdh;
    }
    
    public boolean isAlive(int row, int col){
        return this.cells[row][col].getState();
    }
    
    public int numberOfNeighbors(int row, int col){
    
        int sum=0;
        if (row != 0 && col != 0){    //1
            if(isAlive(row-1,col-1)){
                sum++;
            }
        }
        
        if (row != 0){
            if(isAlive(row-1,col)){ //2
            sum++;
            }
        }
        
        if (row != 0 && col != this.witdh-1){//3
            if(isAlive(row-1,col+1)){
                sum++;
            }
        }
        if (col != 0){
            if(isAlive(row,col-1)){ //4
            sum++;
            }
        }
        //self
        if (col != this.witdh-1){
            if(isAlive(row,col+1)){ //6
                sum++;
            }
        }

        if (row != this.height-1 && col != 0){
            if(isAlive(row+1,col-1)){ //7
                sum++;
            }
        }

        if (row != this.height-1){
            if(isAlive(row+1,col)){ //8
            sum++;
            }
        }

        if (row != this.height-1 && col != this.witdh-1){
            if(isAlive(row+1,col+1)){ //9
                sum++;
            }
        }

        return sum;
    }
}

