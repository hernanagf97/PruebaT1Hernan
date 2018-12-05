package application.control;

import com.jfoenix.controls.JFXButton;

import javafx.fxml.FXML;
import javafx.scene.control.Tooltip;
import javafx.stage.Stage;

public class NewControlFX {
	@FXML
	JFXButton botonCancelar;
	@FXML
	public void initialize() {
		System.out.println("Segunda ventana");
		
	}
	@FXML
	public void cerrarSegundaVentana() {
		Stage thisStage = (Stage) botonCancelar.getScene().getWindow();
		thisStage.close();
		
	}
}
