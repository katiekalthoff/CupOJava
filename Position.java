package application.model;

public class Position {
	
	private String empName;
	private String position;
	private double hourlyWage;
	private double weeklyHours;
	private String admin; //yes or no
	
	
	public Position(String empName, String positionTitle, double hourlyWage, double hours, String admin) {
		this.empName = empName;
		this.position = positionTitle;
		this.hourlyWage = hourlyWage;
		this.weeklyHours = hours;
		this.admin = admin;
	}
	
	public String getName() {
		return empName;
	}
	
	
	public void setName(String name) {
		this.empName = name;
	}
	
	public String getPosition() {
		return position;
	}
	
	
	public void setPosition(String position) {
		this.position = position;
	}
	
	public double getHourlyWage() {
		return hourlyWage;
	}
	
	
	public void setHourlyWage(double wage) {
		this.hourlyWage = wage;
	}
	
	public double getWeeklyHours() {
		return hourlyWage;
	}
	
	
	public void setWeeklyHours(double hours) {
		this.weeklyHours= hours;
	}
	
	public String getAdmin() {
		return admin;
	}
	
	
	public void setAdmin(String admin) {
		this.admin= admin;
	}


}
