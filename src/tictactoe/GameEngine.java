/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.util.Arrays;

/**
 *
 * @author Jakub Rybicki <lansoftprogramming.com>
 */
public class GameEngine {
    /**
     * 0: not won   1: x wins   2: o wins
     * @param button
     * @param id
     * @param whatSp
     * @return 
     */
    
    public static byte winGameCheck(XOButton[] button,byte id, byte whatSp){
        switch(id){
            case 0:
                checkWinGameMoves((byte)1,(byte)2,whatSp,button);
                checkWinGameMoves((byte)3,(byte)6,whatSp,button);
                checkWinGameMoves((byte)4,(byte)8,whatSp,button);
                break;
            case 1:
                checkWinGameMoves((byte)4,(byte)7,whatSp,button);
                checkWinGameMoves((byte)0,(byte)2,whatSp,button);
                break;
            case 2:
                checkWinGameMoves((byte)4,(byte)6,whatSp,button);
                checkWinGameMoves((byte)0,(byte)1,whatSp,button);
                checkWinGameMoves((byte)5,(byte)8,whatSp,button);
                break;
            case 3:
                checkWinGameMoves((byte)0,(byte)6,whatSp,button);
                checkWinGameMoves((byte)4,(byte)5,whatSp,button);
                break;
            case 4:
                checkWinGameMoves((byte)0,(byte)8,whatSp,button);
                checkWinGameMoves((byte)1,(byte)7,whatSp,button);
                checkWinGameMoves((byte)2,(byte)6,whatSp,button);
                checkWinGameMoves((byte)3,(byte)5,whatSp,button);
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
        }
        return 0;
        }
    private static byte checkWinGameMoves(byte a, byte b, byte whatSp, XOButton[] button){
        if(button[a].whatSpace==whatSp){
            if(button[b].whatSpace==whatSp){
                System.out.println("WIN!!!!-------------------");
                return whatSp;  //return what the user clicked (winning icon)
            }
                
        }
        return 0; // return no one has won
    }
}
 