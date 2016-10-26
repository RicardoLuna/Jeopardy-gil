package Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ControllerTelaInicial extends Pane {
	
	@FXML private Button init;
	@FXML private Button regras;
	@FXML private Button sair;
	
	private Stage primaryStage;
	
	private boolean okClicked = false;
    
	@FXML
    private void initialize() {
    }
	
	public boolean isOkClicked() {
        return okClicked;
    }
	
}
