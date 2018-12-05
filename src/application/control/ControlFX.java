package application.control;

import java.io.IOException;

import com.jfoenix.controls.JFXButton;

import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Tooltip;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ControlFX {
	@FXML
	AnchorPane myPane;
	@FXML
	JFXButton Boton;
	@FXML
	ImageView imagen;
	
	@FXML
	public void initialize() {
		fadeInTransicion();
		Tooltip tooltip = new Tooltip("“Do you know me?");
		Boton.setTooltip(tooltip);
	}
	@FXML
	private void fadeInTransicion() {
		imagen.setVisible(true);
		FadeTransition transicion = new FadeTransition(Duration.seconds(5),imagen);
		transicion.setFromValue(0);
		transicion.setToValue(1);
		transicion.play();
	}
	@FXML
	public void closeStage() {
			Stage thisStage = (Stage) Boton.getScene().getWindow();
			thisStage.close();
			sendStage();
		}
	@FXML
	public void sendStage() {
		myPane = new AnchorPane();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("GetMe.fxml"));

		Stage secondaryStage = new Stage();
		
		try {
			myPane = (AnchorPane) loader.load();
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		secondaryStage.setScene(new Scene(myPane));
		secondaryStage.show();
	}
	
}
