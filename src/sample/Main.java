package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {



    public static void main(String[] args) {

        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        //Group root2 = new Group();
        Scene scene = new Scene(root);

        Image icon = new Image("tictactoe.jpeg");
        stage.getIcons().add(icon);
        stage.setTitle("Tic Tac Toe Markop");
        stage.setWidth(500);
        stage.setHeight(500);



        stage.setScene(scene);
        stage.show();
    }
}
