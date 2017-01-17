package com.gof.gameoflife;

/**
 *
 * @author tien
 */
public class Cell {
    
    // false is dead, true is alive
    private boolean state = false;
    private boolean newState;
    public Cell(){
        this.state = false;
    }
    
    public Cell(boolean state){
        this.state = state;
    }
    
    public void setnewState(boolean state){
        this.newState = state;
    }
    
    public void setState(boolean state){
        this.state = state;
    }
   
    public void updateState(){
        this.state = this.newState;
    }
   
    public boolean getState(){
        return this.state;
    }
    
    public boolean getNewState(){
        return this.newState;
    }
    
}
