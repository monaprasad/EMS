package Girnar;

public class Employee extends Details
{
	private int ssn;
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	@Override
	public String toString() {
		return "employee_ssn"+"\t"+  "designation"+"\t"+"name"+"\n"
			   +ssn+"\t\t"+designation+"\t\t"+"  "+name;
	}
	
	private String designation;
	private String name;

	
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

