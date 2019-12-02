package application.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import application.Main;
import application.model.Employee;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class EmployeeProfileController {
	
	@FXML
	private Label annualSalary;
	@FXML
	private Label empId;
	@FXML
	private Label hours;
	@FXML
	private Label address;
	@FXML
	private Label phoneNum;
	@FXML
	private Label weeklySalary;
	@FXML
	private Label hourlyWage;
	@FXML
	private Label empName;
	@FXML
	private Label position;
	@FXML
	private Label email;
	@FXML
	private Button projectedPay;
	@FXML
	private Button changePassword;
	@FXML
	private Button logOut;
	@FXML
	private Button updateInfo;
	
	public void handle(ActionEvent event) {

			try {
				if(((Button) event.getSource()).getText().equals(logOut.getText())) { //login Button

						FXMLLoader loader = new FXMLLoader();
						loader.setLocation(getClass().getResource("../view/Login.fxml"));
						Parent root = loader.load();
						Main.scene.setScene(new Scene(root, 800, 800));
						Main.scene.show();
				}
				else if(((Button) event.getSource()).getText().equals(projectedPay.getText())) { //sign up button
				
					FXMLLoader loader = new FXMLLoader();
					loader.setLocation(getClass().getResource("../view/ProjectedPay.fxml"));
					Parent root = loader.load();
					Main.scene.setScene(new Scene(root, 800, 800));
					Main.scene.show();
				}
	         }
			catch(Exception e){
				e.printStackTrace();
			}
	}
	
	//Read input from passed in data file
	public void displayLabels(String inputFile, Employee emp) throws IOException
	{
		double hourWage = emp.getPosition().getHourlyWage();
		double weekSalary = hourWage * emp.getPosition().getWeeklyHours();
		String wString = weekSalary+"";
		empName.setText(emp.getName());
		empId.setText(emp.getEmploeeID());
		address.setText(emp.getAddr());
		phoneNum.setText(emp.getPhoneNum());
		position.setText(emp.getPosition().getPosition());
		email.setText(emp.getEmail());
		hours.setText(emp.getPosition().getStringWeeklyHours());
		weeklySalary.setText(wString);
		hourlyWage.setText(emp.getPosition().getStringHourlyWage());
		annualSalary.setText(emp.getPosition().getStringAnnualSalary());
	}

}
