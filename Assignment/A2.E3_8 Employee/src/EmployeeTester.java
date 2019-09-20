/**
   A class to test the Employee class.
*/

public class EmployeeTester {

	public static void main(String[] args) {
		
		//Create a new employee with salary
		Employee harry= new Employee("Hacker, Harry", 5000 );
		//Give the employee a Raise of 10%
		harry.raiseSalary(10);
		//Print the Employee Name with his current Salary
		System.out.println("Employee: " +harry.getName() +"\n" +"Salary: "+harry.getSalary());
		System.out.println("Expected Salary: 5500");
	}

}
