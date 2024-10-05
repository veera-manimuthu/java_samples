package java_samples.java.emp;

public class Employee {

	private String empSame;
	private int empId;
	private int salary;
	private int managerId;
	
	public String getEmpSame() {
		return empSame;
	}
	public Employee(String empSame, int empId, int salary, int managerId) {
		super();
		this.empSame = empSame;
		this.empId = empId;
		this.salary = salary;
		this.managerId = managerId;
	}
	public void setEmpSame(String empSame) {
		this.empSame = empSame;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	@Override
	public String toString() {
		return "Employee [empSame=" + empSame + ", empId=" + empId + ", salary=" + salary + ", managerId=" + managerId
				+ "]";
	}
	
	

}
