package application.model;

import java.util.ArrayList;

public class Buisness {
	public String name;
	public String ppS;
	public String ppE;
	public ArrayList<Employee> emps;
	
	Buisness(String szName, String szppS, String szppE){
		this.name = szName;
		this.ppS = szppS;
		this.ppE = szppE;
		this.emps = new ArrayList<Employee>();
	}
}
