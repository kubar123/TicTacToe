/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.awt.GridLayout;
//import java.awt.List;
//import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
//import javax.swing.SwingConstants;

/**
 *
 * @author Jakub Rybicki <lansoftprogramming.com>
 */
public class TicTacToe extends JFrame{
    JPanel p=new JPanel();
    public static XOButton buttons[]=new XOButton[9];//adding buttons array with 9 buttons
    //static byte moves[]=new byte[9]; //
    /*
        0   1   2
        3   4   5
        6   7   8
    */
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new TicTacToe();
    }
    //public static byte[] getMoves(){ return moves;}         //get moved
    //public static void setMoves(byte[] move){ moves=move;}// set moves
    public XOButton[] getXOButton(){
        return buttons;
    } //get XOButtons array - unused
    
    public TicTacToe(){
        super("Tic Tac Toe"); //name of window
        setSize(400,600);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
       // setEnabled(false);
        //setEnabled(true);
        
        
        p.setLayout(new GridLayout(4,3));//4x3 grid as layout(3x3 game, 1x2 info)
        for(int i=0;i<9;i++){            //add new XOButton object for 9
            buttons[i]=new XOButton();  //of the grids
            //moves[i]=0;              //set each move as empty 
            buttons[i].myId=(byte)i;//give id to each button
            p.add(buttons[i]);  //add buttons to p
        }
        System.out.println(buttons[3].whatSpace);
        
        
        JLabel hello=new JLabel("o always starts!",JLabel.LEFT);//new jLabel
        hello.setAlignmentX(BOTTOM_ALIGNMENT);
        hello.setAlignmentY(LEFT_ALIGNMENT);
        p.add(hello);
        
        add(p);
        setVisible(true);
       
    }
    
}
