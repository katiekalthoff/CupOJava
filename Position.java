package application.model;

public class Position {
	
	private String position;
	private double hourlyWage = 0.0;
	private double weeklyHours = 0.0;
	private String admin; //yes or no
	
	private int lostSal = 0;
	private int annSal = 0;
	private int projSal = 0;
	
	public Position(){
		
	}
	
	public Position(String positionTitle, double hourlyWage, double hours, String admin, int annSal) {
		this.position = positionTitle;
		this.hourlyWage = hourlyWage;
		this.setWeeklyHours(hours);
		this.admin = admin;
		this.annSal = annSal;
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

	public double getWeeklyHours() {
		return weeklyHours;
	}

	public void setWeeklyHours(double weeklyHours) {
		this.weeklyHours = weeklyHours;
	}

	public void setHourlyWageString(String string) {
		String hours = Double.toString(this.hourlyWage);
		
	}

	public void setWeeklyHoursString(String string) {
		String weeklyHrs = Double.toString(this.weeklyHours);
	}

	public void setAnnSalString(String string) {
		String annualSal = Integer.toString(this.annSal);
		
	}
	
	public String getStringHourlyWage()
	{
		String hours = Double.toString(this.hourlyWage);
		return hours;
	}
	
	public String getStringWeeklyHours()
	{
		String hours = Double.toString(this.weeklyHours);
		return hours;
	}
	
	public String getStringAnnualSalary()
	{
		String hours = Integer.toString(this.annSal);
		return hours;
	}

}
