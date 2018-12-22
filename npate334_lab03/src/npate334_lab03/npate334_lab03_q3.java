package npate334_lab03;
import java.util.Scanner;

public class npate334_lab03_q3 {


	public static void main(String[] args) {
		// initializing variables 
		String fName;
		String lName;
		int salary;
		
		Scanner inputScanner = new Scanner(System.in); 

		// asking user to input employee data
		System.out.println("Input employee first name");
		fName = inputScanner.nextLine();
		System.out.println("Input employee last name");
		lName = inputScanner.nextLine();
		System.out.println("Input employee salary");
		salary = inputScanner.nextInt();
		Employee member = new Employee(fName,lName,salary); //calling the pre-made constructor
		member.printInfo(); //using pre-made print method to print inputed employee data 
		
	}

}
