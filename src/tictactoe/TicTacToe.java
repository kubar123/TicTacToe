/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author Jakub Rybicki <lansoftprogramming.com>
 */
public class TicTacToe extends JFrame{
    JPanel p=new JPanel();
    XOButton buttons[]=new XOButton[9];//adding buttons array with 9 buttons
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new TicTacToe();
    }
    
    public TicTacToe(){
        super("TicTacToe");
        
        setSize(400,600);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        p.setLayout(new GridLayout(4,3));   //4x3 grid as layout
        for(int i=0;i<9;i++){           //add new XOButton object for 9
            buttons[i]=new XOButton();  //of the arrays.
            p.add(buttons[i]);  //add buttons to p
        }
        JLabel hello=new JLabel("o always starts!",JLabel.LEFT);//new jLabel
        hello.setAlignmentX(BOTTOM_ALIGNMENT);
        hello.setAlignmentY(LEFT_ALIGNMENT);
        p.add(hello);
        
        add(p);
        setVisible(true);
        
    }
    
}
