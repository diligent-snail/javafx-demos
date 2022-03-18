package org.diligentsnail.javafxdemos.resizablecircle;

import javafx.beans.binding.Bindings;
import javafx.beans.binding.NumberBinding;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;

public class ResizableCircleController {
	@FXML
	private AnchorPane anchorPane;
	@FXML
	private Circle circle;

	@FXML
	private void initialize() {
		NumberBinding numberBinding = Bindings
				.min(anchorPane.widthProperty(), anchorPane.heightProperty())
				.divide(2);
		circle.radiusProperty().bind(numberBinding);
	}
}
