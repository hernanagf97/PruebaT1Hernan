package application.control;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

/**
 * 
 * @author hernan
 * @version 1
 * 
 */
public class MainFX extends Application {
	@FXML
	AnchorPane myPane;
	@Override
	public void start(Stage primaryStage) {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Profile.fxml"));
		
		try {
			myPane = (AnchorPane) loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scene escena = new Scene(myPane);
		escena.getStylesheets().add("https://fonts.googleapis.com/css?family=Indie+Flower");
		primaryStage.setScene(escena);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
