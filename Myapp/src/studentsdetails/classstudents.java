package studentsdetails;

public class classstudents {
	  String name;
	  string initial;
	  long roll no;
	  char grade;
	  float percentage;
	  
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public string getInitial() {
		return initial;
	}
	public void setInitial(string initial) {
		this.initial = initial;
	}
	public long getRoll() {
		return roll;
	}
	public void setRoll(long roll) {
		this.roll = roll;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "classstudents [name=" + name + ", roll=" + roll + ", grade=" + grade + ", percentage=" + percentage
				+ "]";
	}
	
	  
	

}
