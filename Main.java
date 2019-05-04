package app;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Parent;


public class Main extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		Parent parent = (Parent) FXMLLoader.load(getClass().getResource("/app/view/MenuLayout.fxml"));
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		stage.setTitle("PKS Mustangi");
		stage.show();
	}
	public static void main(String[] args) throws IOException{
		launch(args);
	}
}
