package de.victorfx.basicJavaFX;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by Ramon Victor on 17.10.2015.
 *
 * Main class. Sets the primaryStage and loads the scene.
 */
public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        ResourceBundle language = ResourceBundle.getBundle("de.victorfx.basicJavaFX.language", Locale.getDefault());
        URL fxml = getClass().getResource("fxml/basicJavaFX.fxml");
        Parent fxplayer = FXMLLoader.load(fxml, language);
        Scene root = new Scene(fxplayer);
        primaryStage.setScene(root);
        primaryStage.show();
    }

}
