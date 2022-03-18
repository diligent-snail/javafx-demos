package org.diligentsnail.javafxdemos.sizingalignment;

import javafx.beans.binding.Bindings;
import javafx.beans.binding.StringBinding;
import javafx.beans.binding.StringExpression;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class OtherTabController {
	private static final String DEFAULT_NAME = "BSE-207";

	@FXML
	private Text helloText;
	@FXML
	public Text helloText2;
	@FXML
	private TextField nameTextField;

	@FXML
	private void initialize() {
		StringBinding name = Bindings.when(nameTextField.textProperty().isEmpty())
				.then(DEFAULT_NAME)
				.otherwise(nameTextField.textProperty());
		StringExpression text = Bindings.concat("Hi, ", name, "!");
		helloText.textProperty().bind(text);
		helloText2.textProperty().bind(text);
	}
}
