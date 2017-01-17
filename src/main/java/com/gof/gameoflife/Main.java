/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gof.gameoflife;

import java.util.Scanner;

/**
 *
 * @author tien
 */
public class Main {
    private View view;
    
    public static void main(String[] args) throws Exception {
        System.out.print("Please enter number of iterations to run: ");
        Scanner in = new Scanner(System.in);
        int iterations = in.nextInt();
        in.close();
        
        
        View gameview = new View();
        Board board = new Board(5, 5, 0.3);
        gameview.setBoard(board);
        for (int i = 0; i <= iterations; i++) {
            gameview.changeState();
            gameview.updateView();
            gameview.generateASCIIText();
            System.out.println("==============================================");
        }
    }
}
