package application.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import application.Main;
import application.model.Employee;
import application.model.Position;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LoginController implements EventHandler<ActionEvent>{

	public String employeeID;
	public String password;
	public String inputFile = "data/employees.csv";
	
	@FXML
	private TextField empIDField;
	
	@FXML
	private TextField passwordField;
	
	@FXML
	private Label errorMessage;
	
	@FXML
	private Button loginButton;
	
	@FXML
	private Button signUpButton;
	
	
	@Override
	public void handle(ActionEvent event) {
		this.employeeID = empIDField.getText();
		this.password = passwordField.getText();

			try {
				if(((Button) event.getSource()).getText().equals(loginButton.getText())) { //login Button

					if(validate(inputFile) == true)
					{
						FXMLLoader loader = new FXMLLoader();
						loader.setLocation(getClass().getResource("../view/employeeProfile.fxml"));
						Parent root = loader.load();
						Main.scene.setScene(new Scene(root, 800, 800));
						Main.scene.show();
					}
					else
					{
						errorMessage.setText("Wrong ID or Password");
					}
						
				}
				else if(((Button) event.getSource()).getText().equals(signUpButton.getText())) { //sign up button
				
					System.out.println("CLicked Button\n");
					FXMLLoader loader = new FXMLLoader();
					loader.setLocation(getClass().getResource("../view/signUp.fxml"));
					Parent root = loader.load();
					Main.scene.setScene(new Scene(root, 800, 800));
					Main.scene.show();
				}
	         }
			catch(Exception e){
				
			}
	}
	
	//Parse through a string
	private String[] parse(String line)
	{
		return line.split(",");
	}
	
	//Read input from passed in data file
	public boolean validate(String inputFile) throws IOException
	{
		//Declare Variables
		String line;
		String[] separatedLine;
		
		//Read File
		File file = new File(inputFile);
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		//Parse through file line-by-line and use data 
		while((line = bufferedReader.readLine()) != null)
		{
			separatedLine = parse(line);
			
			if(employeeID.equals(separatedLine[1]) && password.equals(separatedLine[2]))
			{
				bufferedReader.close();
				return true;
			}	
		}
		bufferedReader.close();
		return false;
	}
}
