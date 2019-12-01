package application;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Main extends Application {
	
	public static Stage scene;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws IOException{
		
		try {
			
			scene = primaryStage;
			
			// Load the FXML document
			FXMLLoader loader = new FXMLLoader(getClass().getResource("view/Login.fxml"));
			Parent root = loader.load();
			
			//Format the scene
			Scene myScene = new Scene(root, 600, 600);
			
			// Set the scene to stage and show the stage to the user
			primaryStage.setScene(myScene);
			primaryStage.show();
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
