  
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
	
	private String DOB;
	private String Addr;
	private String phoneNum;
	private String Email;


	
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

	}