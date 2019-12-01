package application.model;

import java.io.IOException;
import java.util.ArrayList;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;

public class Business {
	public String name;
	public String ppS; //pay period start
	public String ppE; //pay period end
	public ArrayList<Employee> emps;
	
	Business(String szName, String szppS, String szppE){
		this.name = szName;
		this.ppS = szppS;
		this.ppE = szppE;
		this.emps = new ArrayList<Employee>();
	}
	

	private String[] parse(String line)
	{
		return line.split(",");
	}
	
	public void getFile(String inputfile) throws IOException{
		
		String line;
		String[] sepLine;
	
		File file = new File(inputfile);
		FileReader fileReader = new FileReader(file);
		BufferedReader buffRead = new BufferedReader(fileReader);
		
		while((line = buffRead.readLine()) != null){
			sepLine = parse(line);
			
			Position newEmpPos = new Position();
			Employee newEmp = new Employee();
			
			newEmpPos.setName(sepLine[0]);
			newEmp.setEmployeeID(sepLine[1]);
			newEmp.setPassword(sepLine[2]);
			newEmp.setDOB(sepLine[3]);
			newEmp.setAddr(sepLine[4]);
			newEmp.setPhoneNum(sepLine[5]);
			newEmp.setEmail(sepLine[6]);
			newEmpPos.setPosition(sepLine[7]);
			newEmpPos.setHourlyWageString(sepLine[8]); //setHourlyWage takes in a double
			newEmpPos.setWeeklyHoursString(sepLine[9]); //setWeeklyHours takes in a double
			newEmpPos.setAnnSalString(sepLine[10]); //setAnnSal takes in an int
			newEmpPos.setAdmin(sepLine[11]);
		}
		
		
		buffRead.close();
		
	}
}