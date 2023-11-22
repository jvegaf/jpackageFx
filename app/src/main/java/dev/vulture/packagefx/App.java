/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package dev.vulture.packagefx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent parent = FXMLLoader.load(App.class.getResource("main.fxml"));
        Scene scene = new Scene(parent,400,200);
        //scene.getStylesheets().add("style.css");
        stage.setScene(scene);
        stage.show();
    }
}
