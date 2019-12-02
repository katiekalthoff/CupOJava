package application.controller;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import application.controller.LoginController;
import application.model.Employee;

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
	
	String inputFile = "data/employees.csv";
	
	public void handle(ActionEvent event) { 
			try {
				if(((Button) event.getSource()).getText().equals(logOut.getText())) { //login Button
						FXMLLoader loader = new FXMLLoader();
						loader.setLocation(getClass().getResource("../view/Login.fxml"));
						Parent root = loader.load();
						Main.scene.setScene(new Scene(root, 800, 800));
						Main.scene.show();
				}
				else if(((Button) event.getSource()).getText().equals(projectedPay.getText())) { //projected pay button
				
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
	
	public void display(String employeeId, String password) {
		
		empName.setText("");
		empId.setText("");
		address.setText("");
		phoneNum.setText("");
		position.setText("");
		email.setText("");
		hours.setText("");
		weeklySalary.setText("");
		hourlyWage.setText("");
		annualSalary.setText("");
		

	}

}
