package com.fapce.Aula13;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

public class PrimaryController {
	
	Alert alert = new Alert(AlertType.INFORMATION);

	@FXML
	private Button alertShower = new Button();
	
    @FXML
    private void showAlert() throws IOException {
        alert.setTitle("Infomação!");
        alert.setHeaderText("O programa foi executado com sucesso!");
        alert.setContentText("Clique 'OK' para sair.");
        alert.showAndWait();
    }
}
