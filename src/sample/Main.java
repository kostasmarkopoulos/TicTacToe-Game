package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import J

public class Main extends Application {

//weufgswegus

    public static void main(String[] args) {

        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception{
        //Apla fortwnei to SceneBuilder
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        //Group root2 = new Group(); <-- Auto se periptwsh pou den dhmiorgw stage mesa sthn start
        Scene scene = new Scene(root);

        Image icon = new Image("tictactoe.jpeg");
        stage.getIcons().add(icon);
        stage.setTitle("Tic Tac Toe ");
        stage.setWidth(600);
        stage.setHeight(500);



        stage.setScene(scene);
        stage.show();
    }
}
