package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {



    public static void main(String[] args) {

        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception{
        //Stage stage = new Stage();
        Group root = new Group();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
