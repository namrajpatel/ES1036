
package npate334_lab03;

public class Employee {
	//initializing variables for employee data
	String m_firstName;
	String m_lastName;
	int m_salary;
	//creating constructor for entering employee data
	Employee(String fName, String lName, int salary){
		m_firstName = fName;
		m_lastName = lName;
		m_salary = salary;
	
}
	void printInfo() { //method that prints the data in given format when called
		System.out.println("First Name: "+m_firstName+"\nLast Name: "+m_lastName+"\nSalary: "+m_salary++);
	}

}
