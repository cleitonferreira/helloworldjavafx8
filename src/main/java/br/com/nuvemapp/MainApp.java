package br.com.nuvemapp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MainApp extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		Button btn = new Button(">> Click <<");
		btn.setOnAction(e -> System.out.println("Hello JavaFX 8"));
		StackPane root = new StackPane();
		root.getChildren().add(btn);
		stage.setScene(new Scene(root));
		stage.setWidth(300);
		stage.setHeight(300);
		stage.setTitle("JavaFX 8 app");
		stage.show();

	}
}
