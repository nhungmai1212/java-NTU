package mhnhung;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloFX01 extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		Button btn = new Button();
		btn.setText("Xin chao !");
		StackPane root = new StackPane();
		root.getChildren().add(btn);
		Scene scn = new Scene(root, 400, 200);
		
		primaryStage.setTitle("Xin chao !");
		primaryStage.setScene(scn);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);

	}

	

}
