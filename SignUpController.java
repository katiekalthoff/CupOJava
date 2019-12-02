package application.controller;

import javafx.event.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;

import java.io.IOException;

import application.Main;
import application.model.*;

public class SignUpController implements EventHandler<ActionEvent>
{
	@FXML
	private TextField employeeID;
	@FXML
	private TextField password;
	@FXML
	private TextField employeeName;
	@FXML
	private TextField birthdate;
	@FXML
	private TextField address;
	@FXML
	private TextField phoneNum;
	@FXML
	private TextField email;
	@FXML
	private ComboBox<String> position;
	
	@FXML
	public void initialize() {
	    position.getItems().removeAll(position.getItems());
	    position.getItems().addAll("Intern", "Seasonal", "Entry", "Mid-Level", "Admin");
	    position.getSelectionModel().select("Intern");
	}
	
	@FXML
	private Button register;
	
	public void handle(ActionEvent event)
	{
		String empID = employeeID.getText();
		String pass = password.getText();
		String name = employeeName.getText();
		String bDay = birthdate.getText();
		String phone = phoneNum.getText();
		String eM = email.getText();
		String addr = address.getText();
		String pos = position.getValue();
		
		Employee newEmp = setEmployee(empID, pass, name, bDay, phone, eM, addr, pos);
		try {
			newEmp.add();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		loadProfile();
	}
	
	public Employee setEmployee(String empID, String pass, String name, String bDay, String phone, String eM, String addr, String pos)
	{
		//System.out.println("In setEmployee function\n");
		Employee emp = new Employee(empID, pass);
		emp.setName(name);
		emp.setDOB(bDay);
		emp.setPhoneNum(phone);
		emp.setEmail(eM);
		emp.setAddr(addr);
		
		if(pos.equals("Intern"))
		{
			Position newPosition = new Position(pos, 10.00, 20.00, "no", 10400);
			emp.setPosition(newPosition);
		}
		else if(pos.equals("Seasonal"))
		{
			Position newPosition = new Position(pos, 15.00, 20.00, "no", 3900);
			emp.setPosition(newPosition);
		}
		else if(pos.equals("Entry"))
		{
			Position newPosition = new Position(pos, 18.00, 40.00, "no", 37440);
			emp.setPosition(newPosition);
		}
		else if(pos.equals("Mid-Level"))
		{
			Position newPosition = new Position(pos, 30.00, 40.00, "no", 62400);
			emp.setPosition(newPosition);
		}
		else if(pos.equals("Admin"))
		{
			Position newPosition = new Position(pos, 50.00, 40.00, "yes", 104000);
			emp.setPosition(newPosition);
		}
		
		return emp;
	}
	
	public void loadProfile()
	{
		try {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("../view/employeeProfile.fxml"));
		Parent root = loader.load();
		Main.scene.setScene(new Scene(root, 800, 800));
		Main.scene.show();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
