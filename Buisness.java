package application.model;
import java.util.*;

public class Business {

	private static ArrayList<Employee> employeeList = new ArrayList<Employee>();

	
	public Business(String name){

		Business.employeeList = new ArrayList<Employee>();
	}

	public void addEmployee( Employee newEmployee) {
		Business.employeeList.add(newEmployee);
	}

	public static ArrayList<Employee> getEmpList(){
		return employeeList;	
	}
	
}
