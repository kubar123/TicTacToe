/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
//import jdk.internal.org.objectweb.asm.util.ASMifier;
/**
 *
 * @author Jakub Rybicki <lansoftprogramming.com>
 */
public class XOButton extends JButton implements ActionListener{
    ImageIcon X,O;
    //byte value=0;
    static boolean oTurn;   //o player's turn
    boolean usedSpace;      //is button in use
    byte whatSpace;
    byte myId;
    //0:nothing  1:X     2:O
    
    
    public XOButton(){
        //set x and o to images for setIcon
        X=new ImageIcon(this.getClass().getResource("x.png"));
        O=new ImageIcon(this.getClass().getResource("o.png"));
        oTurn=true; // new game: o starts
        usedSpace=false; //the current space is not is use
        whatSpace=0;
        
        this.addActionListener(this);//listens for click of this obj
    }
    
                            //On click...
    public void actionPerformed(ActionEvent e){
        if(!usedSpace){     //check if space is 'in use'
            usedSpace=true; //set space to in use
            if(oTurn){      //check users turn
                whatSpace=2;
                setIcon(O);
            }else{
                whatSpace=1;
                setIcon(X);
            }
        }else{
            System.out.println("Error, space used!");
        }
            System.out.println(whatSpace);
            System.out.println("ID: "+myId);
           // SYstem.out.println(     )

//  ----------below for 'free mode' ----------------
//  code saved for later feature - please ignore
// -- Byte valye=0;         0:nothing   1:x 2:o
//
//        value++;
//        value%=3;
//        switch(value){
//            case 0:
//                setIcon(null);
//                break;
//            case 1:
//                setIcon(X);
//                break;
//            case 2:
//                 setIcon(O);
//                 break;
//        }
// ---------------End of 'free mode'--------
        
       //System.out.println(Arrays.toString(TicTacToe.getMoves()));
        oTurn=!oTurn;       //toggle players turn
        //check if game is won
        System.out.println("________:"+GameEngine.winGameCheck(TicTacToe.buttons, myId, whatSpace));
        
    }
}
