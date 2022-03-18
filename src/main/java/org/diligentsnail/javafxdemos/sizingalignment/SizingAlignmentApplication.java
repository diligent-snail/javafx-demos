package org.diligentsnail.javafxdemos.sizingalignment;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class SizingAlignmentApplication extends Application {
	private static final String FXML_FILE_PATH = "/org/diligentsnail/javafxdemos/sizingalignment/sizing-alignment.fxml";
	private static final int MIN_WIDTH = 400;
	private static final int MIN_HEIGHT = 300;
	private static final int MAX_WIDTH = 2 * MIN_WIDTH;
	private static final int MAX_HEIGHT = 2 * MIN_HEIGHT;

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getFxmlFileUrl());
		primaryStage.setScene(new Scene(root, MIN_WIDTH, MIN_HEIGHT));
		restrictSize(primaryStage);
		primaryStage.setTitle("Sizing alignment demos");
		primaryStage.show();
	}

	private static URL getFxmlFileUrl() {
		URL url = SizingAlignmentApplication.class.getResource(FXML_FILE_PATH);
		if (url == null) {
			throw new IllegalStateException("Cannot find '" + FXML_FILE_PATH + "'");
		}
		return url;
	}

	private static void restrictSize(Stage primaryStage) {
		primaryStage.setMinWidth(MIN_WIDTH);
		primaryStage.setMinHeight(MIN_HEIGHT);
		primaryStage.setMaxWidth(MAX_WIDTH);
		primaryStage.setMaxHeight(MAX_HEIGHT);
	}

	public static void main(String[] args) {
		Application.launch(SizingAlignmentApplication.class, args);
	}
}
