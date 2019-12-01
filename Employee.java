package application.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import application.model.Position;

public class Employee {
	
	private String empID;
	private String password;
	private Position position;
	public String name;
	
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
