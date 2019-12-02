package application.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import application.Main;
import application.controller.EmployeeProfileController;
import application.model.Position;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Employee {
	
	private String empID;
	private String password;
	private Position position;
	private String name;
	
	private String DOB;
	private String Addr;
	private String phoneNum;
	private String Email;


	public Employee()
	{
		this.empID = "";
		this.password = "";
	}
	
	public Employee(String empID, String password) {
		this.empID = empID;
		this.password = password;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String n)
	{
		this.name = n;
	}

	public String getEmploeeID() {
		return empID;
	}

	public void setEmployeeID(String empID) {
		this.empID = empID;
	}


	public String getPassword() {
		return password;
	}

	
	public void setPassword(String pass) {
		this.password = pass;
	}

	public Employee validate(String username, String password) {
		 
		 File file = new File("file name here");
		// making sure that the file exists. Looking at the absolute path to fix any path related problem. 
		if(file.exists()) {
		  System.out.println(file.getAbsolutePath());
		 } else {
		  System.out.println("NO FILE!");
		  System.out.println(file.getAbsolutePath());
		 }
		 
		 Scanner scan = null;
		 try {
		  scan = new Scanner(file);
		 }
		 catch (FileNotFoundException e)
		 {
		  e.printStackTrace();
		 }
		 
		 while(scan.hasNextLine() ) {

		  String line = scan.nextLine();
		  String[] word =line.split(",");

		  if(username.equals(word[0])) {
		   if(password.equals(word[1])) {
		 
		    Employee temp = new Employee(username, password);
		    return temp;
		   }
		   
		  }
		 }
		 scan.close();
		 return null;	
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public String getAddr() {
		return Addr;
	}

	public void setAddr(String addr) {
		Addr = addr;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}
	
	public void add() throws IOException
	{
		FileWriter empWriter = new FileWriter("data/employees.csv", true);
		empWriter.append(this.name);
		empWriter.append(",");
		empWriter.append(this.empID);
		empWriter.append(",");
		empWriter.append(this.password);
		empWriter.append(",");
		empWriter.append(this.DOB);
		empWriter.append(",");
		empWriter.append(this.Addr);
		empWriter.append(",");
		empWriter.append(this.phoneNum);
		empWriter.append(",");
		empWriter.append(this.Email);
		empWriter.append(",");
		empWriter.append(this.getPosition().getPosition());
		empWriter.append("\n");
		
		empWriter.flush();
		empWriter.close();
	}
	
	public void loadProfile(Employee emp)
	{
		try {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("../view/employeeProfile.fxml"));
		Parent root = loader.load();
		EmployeeProfileController empController = loader.getController();
		Main.scene.setScene(new Scene(root, 800, 800));
		Main.scene.show();
		
		empController.displayLabels("data/employees.csv", emp);
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	//Parse through a string
	private String[] parse(String line)
	{
		return line.split(",");
	}
	
	//Read input from passed in data file
	public void loadEmployee(String inputFile, String employeeID) throws IOException
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
			
			if(employeeID.equals(separatedLine[1]))
			{
				this.setName(separatedLine[0]);
				this.setEmployeeID(employeeID);
				this.setPassword(separatedLine[2]);
				this.setDOB(separatedLine[3]);
				this.setAddr(separatedLine[4]);
				this.setPhoneNum(separatedLine[5]);
				this.setEmail(separatedLine[6]);
				//this.position.setPosition(separatedLine[7]);
				String pos = separatedLine[7];
				
				if(pos.equals("Intern"))
				{
					Position newPosition = new Position(pos, 10.00, 20.00, "no", 10400);
					this.setPosition(newPosition);
				}
				else if(pos.equals("Seasonal"))
				{
					Position newPosition = new Position(pos, 15.00, 20.00, "no", 3900);
					this.setPosition(newPosition);
				}
				else if(pos.equals("Entry"))
				{
					Position newPosition = new Position(pos, 18.00, 40.00, "no", 37440);
					this.setPosition(newPosition);
				}
				else if(pos.equals("Mid-Level"))
				{
					Position newPosition = new Position(pos, 30.00, 40.00, "no", 62400);
					this.setPosition(newPosition);
				}
				else if(pos.equals("Admin"))
				{
					Position newPosition = new Position(pos, 50.00, 40.00, "yes", 104000);
					this.setPosition(newPosition);
				}
			}	
		}
		bufferedReader.close();
	}

}
