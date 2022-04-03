package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
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


    public void firstplayer(){

        if (random.nextInt(2)==0){
            player1_turn = true;
            firstPickText.setText("X turn");
        }
        else{
            player1_turn=false;
            firstPickText.setText("O turn");
        }


    }

   // public void setupButton(Button button){
      //  button.setOnMouseClicked(mouseEvent -> {firstplayer(button);
          //  button.setDisable(true);});
    //}

    public void checkCombination(){

    }

    public void xWins(int a, int b, int c){

    }

    public void oWins(int a, int b, int c){

    }

    public void score(){

    }


}
