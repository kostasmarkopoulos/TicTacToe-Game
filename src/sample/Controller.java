package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    Random random = new Random();
    boolean player1_turn;

    @FXML
    private Text winnerText;

    @FXML
    private Text firstPickText;

    @FXML
    private Button button1;

    @FXML
    private Button button2;

    @FXML
    private Button button3;

    @FXML
    private Button button4;

    @FXML
    private Button button5;

    @FXML
    private Button button6;

    @FXML
    private Button button7;

    @FXML
    private Button button8;

    @FXML
    private Button button9;

    Button [] buttons ;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        buttons = new Button[]{button1, button2, button3, button4, button5, button6, button7, button8, button9};



    }

    public void firstplayer(Button button){

        if (random.nextInt(2)==0){
            player1_turn = true;
            firstPickText.setText("X turn");
        }
        else{
            player1_turn=false;
            firstPickText.setText("O turn");
        }


    }

    public void setupButton(Button button){
        button.setOnMouseClicked(mouseEvent -> {firstplayer(button);
           button.setDisable(true);});
    }

    public void checkCombination(){
        //xButtons
        if (buttons[0].getText()=="X" && buttons[1].getText()=="X" && buttons[2].getText()=="X") {
            xWins(0,1,2);
        }
        if (buttons[3].getText()=="X" && buttons[4].getText()=="X" && buttons[5].getText()=="X") {
            xWins(3,4,5);
        }
        if (buttons[6].getText()=="X" && buttons[7].getText()=="X" && buttons[8].getText()=="X") {
            xWins(6,7,8);
        }
        if (buttons[0].getText()=="X" && buttons[3].getText()=="X" && buttons[6].getText()=="X") {
            xWins(0,3,6);
        }
        if (buttons[1].getText()=="X" && buttons[4].getText()=="X" && buttons[7].getText()=="X") {
            xWins(1,4,7);
        }
        if (buttons[2].getText()=="X" && buttons[5].getText()=="X" && buttons[8].getText()=="X") {
            xWins(2,5,8);
        }
        if (buttons[0].getText()=="X" && buttons[4].getText()=="X" && buttons[8].getText()=="X") {
            xWins(0,4,8);
        }
        if (buttons[2].getText()=="X" && buttons[4].getText()=="X" && buttons[6].getText()=="X") {
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

    public void xWins(int a, int b, int c){

    }

    public void oWins(int a, int b, int c){

    }

    public void score(){

    }


}
