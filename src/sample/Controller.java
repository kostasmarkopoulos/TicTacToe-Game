package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.ResourceBundle;

public  class Controller implements ActionListener {

    

   // @FXML
    //private Text winnerText;

   //TicTacToeButtons
    @FXML
    private Button button1,button2,button3,button4,button5,button6,button7,button8,button9;

    Button [] buttons = new Button[]{button1, button2, button3, button4, button5, button6, button7, button8, button9};


    @Override
   public void actionPerformed(ActionEvent e) {
       /* for(int i=0;i<9;i++) {
            System.out.println("popopo");
            if(e.getActionCommand().equals(buttons[i])) {
                System.out.println("Mpike");
                if(player1_turn) {
                    if(buttons[i].getText()=="") {
                        //buttons[i].setForeground(new Color(255,0,0));
                        buttons[i].setText("X");
                        player1_turn=false;
                        firstPickText.setText("O turn");
                        checkCombination();
                    }
                }
                else {
                    if(buttons[i].getText()=="") {
                        //buttons[i].setForeground(new Color(0,0,255));
                        buttons[i].setText("O");
                        player1_turn=true;
                        firstPickText.setText("X turn");
                        checkCombination();
                    }
                }
            }
        }*/
    }

    Random random = new Random();
    boolean player1_turn;
    @FXML
    private Label firstPickText;

    @FXML
    public void firstpick(MouseEvent event){

        if (random.nextInt(2)==0){
            player1_turn = true;
            firstPickText.setText("X turn");
        }
        else{
            player1_turn=false;
            //firstPickText = new Text("O turn");
            firstPickText.setText("O turn");

        }


    }


    @FXML
    public void setupButton(javafx.event.ActionEvent e){
        /*for(int i=0;i<9;i++) {
            buttons[i] = new Button();
            System.out.println(buttons[i]);
        }*/
        for(int i=0;i<9;i++) {
            //if(e.getSource().equals(buttons[i].getText())) {
           if(player1_turn) {
                   // if(buttons[i].getText()==null&&buttons[i]==buttons[idx]) {
                        //buttons[i].setForeground(new Color(255,0,0));
                        buttons[i].setText("X");
                        player1_turn=false;
                        firstPickText.setText("O turn");
                        //checkCombination();
                   // }
           }
                else {
                    if(buttons[i].getText()=="") {
                        //buttons[i].setForeground(new Color(0,0,255));
                        buttons[i].setText("O");
                        player1_turn=true;
                        firstPickText.setText("X turn");
                        //checkCombination();
                    }
                }
           // }
        }
    }

    public void checkCombination(){
        //xButtons
        if (buttons[0].getText().equals("X") && buttons[1].getText().equals("X") && buttons[2].getText().equals("X")) {
            xWins(0,1,2);
        }
        if (buttons[3].getText().equals("X") && buttons[4].getText().equals("X") && buttons[5].getText().equals("X")) {
            xWins(3,4,5);
        }
        if (buttons[6].getText().equals("X") && buttons[7].getText().equals("X") && buttons[8].getText().equals("X")) {
            xWins(6,7,8);
        }
        if (buttons[0].getText().equals("X") && buttons[3].getText().equals("X") && buttons[6].getText().equals("X")) {
            xWins(0,3,6);
        }
        if (buttons[1].getText().equals("X") && buttons[4].getText().equals("X") && buttons[7].getText().equals("X")) {
            xWins(1,4,7);
        }
        if (buttons[2].getText().equals("X") && buttons[5].getText().equals("X") && buttons[8].getText().equals("X")) {
            xWins(2,5,8);
        }
        if (buttons[0].getText().equals("X") && buttons[4].getText().equals("X") && buttons[8].getText().equals("X")) {
            xWins(0,4,8);
        }
        if (buttons[2].getText().equals("X") && buttons[4].getText().equals("X") && buttons[6].getText().equals("X")) {
            xWins(2,4,6);
        }

        //yButtons
        if (buttons[0].getText()=="O" && buttons[1].getText()=="O" && buttons[2].getText()=="O") {
            oWins(0,1,2);
        }
        if (buttons[3].getText()=="O" && buttons[4].getText()=="O" && buttons[5].getText()=="O") {
            oWins(3,4,5);
        }
        if (buttons[6].getText()=="O" && buttons[7].getText()=="O" && buttons[8].getText()=="O") {
            oWins(6,7,8);
        }
        if (buttons[0].getText()=="O" && buttons[3].getText()=="O" && buttons[6].getText()=="O") {
            oWins(0,3,6);
        }
        if (buttons[1].getText()=="O" && buttons[4].getText()=="O" && buttons[7].getText()=="O") {
            oWins(1,4,7);
        }
        if (buttons[2].getText()=="O" && buttons[5].getText()=="O" && buttons[8].getText()=="O") {
            oWins(2,5,8);
        }
        if (buttons[0].getText()=="O" && buttons[4].getText()=="O" && buttons[8].getText()=="O") {
            oWins(0,4,8);
        }
        if (buttons[2].getText()=="O" && buttons[4].getText()=="O" && buttons[6].getText()=="O") {
            oWins(2,4,6);
        }
    }

    //Score and win things
    @FXML
    Label scoreX = new Label();
    @FXML
    Label scoreO = new Label();

    Integer counterX=0,counterO=0;


    public void xWins(int a, int b, int c){
        //buttons[a].setBackground(Color.GREEN);
        //buttons[b].setBackground(Color.GREEN);
        //buttons[c].setBackground(Color.GREEN);
        counterX += 1;
        score(counterX,counterO);
    }

    public void oWins(int a, int b, int c){
        //buttons[a].setBackground(Color.GREEN);
        //buttons[b].setBackground(Color.GREEN);
        //buttons[c].setBackground(Color.GREEN);
        counterO +=1;
        score(counterX,counterO);
    }

    public void score(Integer a,Integer b){
            if (a<=5 || b<=5){
                scoreX.setText( a.toString().getClass().getName());
                scoreO.setText( b.toString().getClass().getName());
            }

    }

    public void resetButton(Button button){
        button.setDisable(false);
        button.setText("");
        score(counterX,counterO);
    }



}
