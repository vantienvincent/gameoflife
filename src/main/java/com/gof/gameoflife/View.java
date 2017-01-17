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
public class View {
    private Board board;
    
    public void setBoard(Board board){
        this.board = board;
    }
    
    public Board getBoard(){
        return this.board;
    }
    
    /**
     * print the board in asscii text
     * star(*) for alive
     * zero(0) for dead cell
     */
    public void generateASCIIText(){

        Cell[][] cells = this.board.getCells();
        for (int i = 0; i < this.board.getHeight(); i++){
            for (int j = 0; j < this.board.getWidth(); j++){

                  if (cells[i][j].getState()){
                      System.out.print("*\t");
                  }
                  else{
                      System.out.print("0\t");
                  }
            }
            System.out.println("\n");
        }
    }
    
    /**
     * run the board for the next generation
     * set newstate of cells based on rules of the game
     */
    public void changeState(){
        
        Board nextGeneration = new Board();
        for (int i = 0; i < this.board.getHeight(); i++){
            for (int j = 0; j < this.board.getWidth(); j++){
                int neighbors = this.board.numberOfNeighbors(i, j);
                nextCellState(neighbors, i, j);
            }
        }
    
    }

    private void nextCellState(int neighbors, int i, int j) {
        if (neighbors < 2){
            this.board.getCells()[i][j].setnewState(false); //underpop
        }
        else if (neighbors > 3){
            this.board.getCells()[i][j].setnewState(false); //overpop
        }
        else if (neighbors == 3){
            this.board.getCells()[i][j].setnewState(true); //born
        }
        else if (neighbors == 2){//unchange
            
            this.board.getCells()[i][j].setnewState(this.board.getCells()[i][j].getState());
        }
    }
    /**
     * update the current states of cells
     */
    public void updateView(){
        for (int i = 0; i < this.board.getHeight(); i ++){
            for (int j = 0; j < this.board.getWidth(); j++){
                this.board.getCells()[i][j].updateState();
            }
        }
    }
    
    
}
