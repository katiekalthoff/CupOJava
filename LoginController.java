package application.controller;

import application.model.Employee;
import application.model.Position;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LoginController implements EventHandler<ActionEvent>{

	@FXML
	private TextField empIdField;
	
	@FXML
	private TextField passwordField;
	
	@FXML
	private Button loginButton;
	
	@FXML
	private Button signUpButton;

	
	String employeeID;
	String password;
	@Override
	public void handle(ActionEvent event) {
		
		employeeID = empIdField.getText();
		password = passwordField.getText();

		
	}
	
	
}
