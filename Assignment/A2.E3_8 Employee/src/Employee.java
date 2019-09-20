/**
   A employee class that maintains Name, Current Salary and calculates Raise.
*/
public class Employee {

	private String name;
	private double salary;

	/**
    Constructs a Employee with Name and Salary.
    @param employeeName the name of the Employee
    @param currentSalary Employee's Current Salary
	*/
	
	public Employee(String employeeName, double currentSalary) {
		name=employeeName;
		salary=currentSalary;
	}
	
	/**
    Get the name of the Employee
    @return name the Employee Name
    */
	public String getName() {
		return name;	
	}

	/**
    Get the Salary of the Employee
    @return salary Employee's Current Salary
    */	
	public double getSalary() {
		return salary;	
	}

	/**
    Processes the raise of the employee by percentage
    @param byPercent the Raise Percentage
    */	
	public void raiseSalary(double byPercent) {
		salary=salary+(salary*byPercent/100);	
	}
	
	
}
