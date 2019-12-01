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

public class EmployeeProfileController {
	
	@FXML
	private Label empName;
	
	@FXML
	private Label empID;
	
	@FXML
	private Label empPos;
	
	@FXML
	private Label empHou;
	
	@FXML
	private Label empLR;
	
	@FXML
	private Label empLA;
	
	@FXML
	private Label anSal;
	
	@FXML
	private Label wkSal;
	
	@FXML
	private Label losSal;
	
	public void initalize() {
		empName.setText();
		//empID.setText();
		//empPos.setText();
		//empLR.setText();
		//empLA.setText();
		//anSal.setText();
		//wkSal.setText();
		//losSal.setText();
		//empHou.setText();
	}
}
