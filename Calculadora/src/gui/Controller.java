package gui;

import java.util.ResourceBundle;

import javax.print.DocFlavor.URL;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

	@FXML
	private TextField ResultDisplay;

	@FXML
	private Button seven;

	@FXML
	private Button eight;

	@FXML
	private Button nine;

	@FXML
	private Button four;

	@FXML
	private Button five;

	@FXML
	private Button six;

	@FXML
	private Button one;

	@FXML
	private Button two;

	@FXML
	private Button three;

	@FXML
	private Button zero;

	@FXML
	private Button dot;

	@FXML
	private Button equal;

	@FXML
	private Button mult;

	@FXML
	private Button div;

	@FXML
	private Button sum;

	@FXML
	private Button minus;

	@FXML
	private Button ac;

	float f = 0f;
	int operation = -1;

	@FXML
	void Calculation(ActionEvent event) {

		if (event.getSource() == one) {
			ResultDisplay.setText(ResultDisplay.getText() + "1");
		} else if (event.getSource() == two) {
			ResultDisplay.setText(ResultDisplay.getText() + "2");
		} else if (event.getSource() == three) {
			ResultDisplay.setText(ResultDisplay.getText() + "3");
		} else if (event.getSource() == four) {
			ResultDisplay.setText(ResultDisplay.getText() + "4");
		} else if (event.getSource() == five) {
			ResultDisplay.setText(ResultDisplay.getText() + "5");
		} else if (event.getSource() == six) {
			ResultDisplay.setText(ResultDisplay.getText() + "6");
		} else if (event.getSource() == seven) {
			ResultDisplay.setText(ResultDisplay.getText() + "7");
		} else if (event.getSource() == eight) {
			ResultDisplay.setText(ResultDisplay.getText() + "8");
		} else if (event.getSource() == nine) {
			ResultDisplay.setText(ResultDisplay.getText() + "9");
		} else if (event.getSource() == zero) {
			ResultDisplay.setText(ResultDisplay.getText() + "0");
		} else if (event.getSource() == dot) {
			ResultDisplay.setText(ResultDisplay.getText() + ".");
		} else if (event.getSource() == ac) {
			ResultDisplay.setText("");
		} else if (event.getSource() == sum) {
			f = Float.parseFloat(ResultDisplay.getText());
			operation = 1; // Addition
			ResultDisplay.setText("");
		} else if (event.getSource() == minus) {
			f = Float.parseFloat(ResultDisplay.getText());
			operation = 2; // Substraction
			ResultDisplay.setText("");
		} else if (event.getSource() == mult) {
			f = Float.parseFloat(ResultDisplay.getText());
			operation = 3; // Mul
			ResultDisplay.setText("");
		} else if (event.getSource() == div) {
			f = Float.parseFloat(ResultDisplay.getText());
			operation = 4; // Division
			ResultDisplay.setText("");
		} else if (event.getSource() == equal) {
			Float secondOperand = Float.parseFloat(ResultDisplay.getText());
			switch (operation) {
			case 1: // Addition
				Float ans = f + secondOperand;
				ResultDisplay.setText(String.valueOf(ans));
				break;
			case 2: // Subtraction
				ans = f - secondOperand;
				ResultDisplay.setText(String.valueOf(ans));
				break;
			case 3: // Mul
				ans = f * secondOperand;
				ResultDisplay.setText(String.valueOf(ans));
				break;
			case 4: // Div
				ans = 0f;
				try {
					ans = f / secondOperand;
				} catch (Exception e) {
					ResultDisplay.setText("Error");
				}
				ResultDisplay.setText(String.valueOf(ans));
				break;
			}
		}
	}

	public void initialize(URL url, ResourceBundle rb) {
		// TODO
	}
}
