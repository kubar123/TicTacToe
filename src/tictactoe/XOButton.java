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
/**
 *
 * @author Jakub Rybicki <lansoftprogramming.com>
 */
class XOButton extends JButton implements ActionListener{
    ImageIcon X,O;
    //byte value=0;
    static boolean oTurn;   //o player's turn
    boolean usedSpace;      //is button in use
    //0:nothing  1:X     2:O
    
    
    public XOButton(){
        //set x and o to images for setIcon
        X=new ImageIcon(this.getClass().getResource("x.png"));
        O=new ImageIcon(this.getClass().getResource("o.png"));
        oTurn=true; // new game: o starts
        usedSpace=false; //the current space is not is use
        
        this.addActionListener(this);//listens for click of this obj
    }
    
    public void actionPerformed(ActionEvent e){
        oTurn=!oTurn;       //toggle players turn
        if(!usedSpace){     //check if space is 'in use'
            usedSpace=true; //set space to in use
            if(oTurn){      //check users turn
                setIcon(O);
            }else{
                setIcon(X);
            }
        }else{
            System.out.println("Error, used space!");
        }
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
// -------------------------End of 'free mode'--------
    }
}
