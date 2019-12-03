package application.controller;

import java.util.ArrayList;

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
				//Employee newEmp = new Employee();
				//newEmp.loadEmployee("data/employees.csv", this.employeeId);
				//newEmp.loadProfile(newEmp);
				
			}
			else if(((Button) event.getSource()).getText().equals(calculatePay.getText())) {
				
				ArrayList<String[]> times = new ArrayList<String[]>();
				 
				String mon1[] = {inMon1.getText(), outMon1.getText()};
				times.add(mon1);
				String tue1[] = {inTue1.getText(), outTue1.getText()};
				times.add(tue1);
				String wed1[] = {inWed1.getText(), outWed1.getText()};
				times.add(wed1);
				String thur1[] = {inThur1.getText(), outThur1.getText()};
				times.add(thur1);
				String fri1[] = {inFri1.getText(), outFri1.getText()};
				times.add(fri1);
				
				String mon2[] = {inMon2.getText(), outMon2.getText()};
				times.add(mon2);
				String tue2[] = {inTue2.getText(), outTue2.getText()};
				times.add(tue2);
				String wed2[] = {inWed2.getText(), outWed2.getText()};
				times.add(wed2);
				String thur2[] = {inThur2.getText(), outThur2.getText()};
				times.add(thur2);
				String fri2[] = {inFri2.getText(), outFri2.getText()};
				times.add(fri2);
				
		

				
				
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
