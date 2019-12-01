package application.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import application.model.Position;

public class Employee {
	
	private String empID;
	private String password;
	private Position position;
	public static String Name;
	

	public Employee(String empID, String password) {
		this.empID = empID;
		this.password = password;
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

		public Position getPosition() {
		return position;
	}
	
	public void setPosition(Position position) {
		this.position = position;
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
	}
