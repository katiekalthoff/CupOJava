package application.controller;

import application.Main;
import application.model.Employee;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ProjectedPayController {

	
	@FXML
	private TextField inMon1;
	@FXML
	private TextField outMon1;
	@FXML
	private TextField inTue1;
	@FXML
	private TextField outTue1;
	@FXML
	private TextField inWed1;
	@FXML
	private TextField outWed1;
	@FXML
	private TextField inThur1;
	@FXML
	private TextField outThur1;
	@FXML
	private TextField inFri1;
	@FXML
	private TextField outFri1;
	@FXML
	private TextField inMon2;
	@FXML
	private TextField outMon2;
	@FXML
	private TextField inTue2;
	@FXML
	private TextField outTue2;
	@FXML
	private TextField inWed2;
	@FXML
	private TextField outWed2;
	@FXML
	private TextField inThur2;
	@FXML
	private TextField outThur2;
	@FXML
	private TextField inFri2;
	@FXML
	private TextField outFri2;
	@FXML
	private Label hoursWorked;
    @FXML
    private Label projectedPay;
    @FXML
    private Button profileButton;
    @FXML
    private Button calculatePay;
    @FXML
    private Button logOut;
    
	public void handle(ActionEvent event) {

		try  
		{
			if(((Button) event.getSource()).getText().equals(logOut.getText())) { //logout Button

				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("../view/Login.fxml"));
				Parent root = loader.load();
				Main.scene.setScene(new Scene(root, 800, 800));
				Main.scene.show();
			}
			else if(((Button) event.getSource()).getText().equals(profileButton.getText())) {
				Employee newEmp = new Employee();
				newEmp.loadEmployee("data/employees.csv", this.employeeId);
				newEmp.loadProfile(newEmp);
				
			}
			else if(((Button) event.getSource()).getText().equals(calculatePay.getText())) {
				Double inMonday1 = Double.valueOf(inMon1.getText());
				Double outMonday1 = Double.valueOf(outMon1.getText());
				Double inTuesday1 = Double.valueOf(inTue1.getText());
				Double outTuesday1 = Double.valueOf(outTue1.getText());
				Double inWednesday1 = Double.valueOf(inWed1.getText());
				Double outWednesday1 = Double.valueOf(outWed1.getText());
				Double inThursday1 = Double.valueOf(inThur1.getText());
				Double outThursday1 = Double.valueOf(outThur1.getText());
				Double inFriday1 = Double.valueOf(inFri1.getText());
				Double outFriday1 = Double.valueOf(outFri1.getText());
				Double inMonday2 = Double.valueOf(inMon2.getText());
				Double outMonday2 = Double.valueOf(outMon2.getText());
				Double inTuesday2 = Double.valueOf(inTue2.getText());
				Double outTuesday2 = Double.valueOf(outTue2.getText());
				Double inWednesday2 = Double.valueOf(inWed2.getText());
				Double outWednesday2 = Double.valueOf(outWed2.getText());
				Double inThursday2 = Double.valueOf(inThur2.getText());
				Double outThursday2 = Double.valueOf(outThur2.getText());
				Double inFriday2 = Double.valueOf(inFri2.getText());
				Double outFriday2 = Double.valueOf(outFri2.getText());
				
				
				
				
			}
         }
		catch(Exception e)
		{
			e.printStackTrace();
		}

}
	
	private void calculuatePay(){
		
		
	}
	
}
