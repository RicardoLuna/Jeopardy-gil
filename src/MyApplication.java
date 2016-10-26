

import java.io.IOException;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MyApplication extends Application {

	@Override
	public void start(Stage primaryStage) {
		BorderPane p = new BorderPane();
		p.setPrefSize(380, 460);
		primaryStage.setScene(new Scene(p));
		primaryStage.show();
		
		
	}
	
	public void carregarContaPane() {
		// carrega o panel de contas no centro da tela principal
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(MyApplication.class.getResource("FXML/Tela_inicial.fxml"));
	}

	public static void main(String[] args) {
		launch(args);
	}
}
