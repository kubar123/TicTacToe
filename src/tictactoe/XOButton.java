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
    byte value=0;
    static boolean oTurn;
    //0:nothing  1:X     2:O
    
    
    public XOButton(){
        X=new ImageIcon(this.getClass().getResource("x.png"));
        O=new ImageIcon(this.getClass().getResource("o.png"));
        oTurn=true;
        this.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e){
        oTurn=!oTurn;//toggle players turn
        if(oTurn){
            setIcon(O);
        }else{
            setIcon(X);
        }
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
    }
}
