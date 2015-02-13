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
    XOButton buttons[]=new XOButton[9];
    
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
        p.setLayout(new GridLayout(4,3));
        for(int i=0;i<9;i++){
            buttons[i]=new XOButton();
            p.add(buttons[i]);
        }
        JLabel hello=new JLabel("o Starts!",JLabel.LEFT);
        hello.setAlignmentX(BOTTOM_ALIGNMENT);
        hello.setAlignmentY(LEFT_ALIGNMENT);
        hello.setVisible(true);
        p.add(hello);
        add(p);
        setVisible(true);
        
    }
    
}
