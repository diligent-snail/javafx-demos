package org.diligentsnail.javafxdemos.resizablecircle;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class ResizableCircleApplication extends Application {
	private static final String FXML_FILE_PATH = "/org/diligentsnail/javafxdemos/resizablecircle/resizable-circle.fxml";

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setScene(new Scene(loadLayout(), 300, 300));
		primaryStage.show();
	}

	private Parent loadLayout() throws IOException {
		URL url = ResizableCircleController.class.getResource(FXML_FILE_PATH);
		if (url == null) {
			throw new IllegalStateException("Cannot find '" + FXML_FILE_PATH + "'");
		}
		return FXMLLoader.load(url);
	}

	public static void main(String[] args) {
		Application.launch(ResizableCircleApplication.class, args);
	}
}
