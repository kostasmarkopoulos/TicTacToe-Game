package sample;

import javafx.fxml.FXML;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Controller implements ActionListener {

    Random random = new Random();
    String textfield = new String();
    JButton [] buttons = new JButton[9];
    boolean player1_turn;

    Controller(){
        firstplayer();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public void firstplayer(){

        if (random.nextInt(2)==0){
            player1_turn = true;
            System.out.println("Its Xs turn");
        }
        else{
            player1_turn=false;
            System.out.println("Its Os turn");
        }

    }

    public void checkCombination(){

    }

    public void xWins(int a, int b, int c){

    }

    public void oWins(int a, int b, int c){

    }

    public void score(){

    }
}
