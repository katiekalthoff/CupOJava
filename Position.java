package application.model;

public class Position {
	
	private String empName;
	private String position;
	private double hourlyWage;
	private double weeklyHours;
	private String admin; //yes or no
	
	private int lostSal;
	private int annSal;
	private int projSal;
	
	private double LTR;
	private double LTA;
	
	public Position(String empName, String positionTitle, double hourlyWage, double hours, String admin,
					int lostSal, int annSal, int projSal, double LTR, double LTA) {
		this.empName = empName;
		this.position = positionTitle;
		this.hourlyWage = hourlyWage;
		this.setWeeklyHours(hours);
		this.admin = admin;
		this.lostSal = lostSal;
		this.annSal = annSal;
		this.projSal = projSal;
		this.LTR = LTR;
		this.LTA = LTA;
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
	
	public String getAdmin() {
		return admin;
	}
	
	public void setAdmin(String admin) {
		this.admin= admin;
	}
	public int getLostSal() {
		return lostSal;
	}

	public void setLostSal(int lostSal) {
		this.lostSal = lostSal;
	}

	public int getAnnSal() {
		return annSal;
	}

	public void setAnnSal(int annSal) {
		this.annSal = annSal;
	}

	public int getProjSal() {
		return projSal;
	}

	public void setProjSal(int projSal) {
		this.projSal = projSal;
	}

	public double getLTR() {
		return LTR;
	}

	public void setLTR(double lTR) {
		LTR = lTR;
	}

	public double getLTA() {
		return LTA;
	}

	public void setLTA(double lTA) {
		LTA = lTA;
	}

	public double getWeeklyHours() {
		return weeklyHours;
	}

	public void setWeeklyHours(double weeklyHours) {
		this.weeklyHours = weeklyHours;
	}

}