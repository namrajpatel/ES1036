package npate334_lab06;
import java.util.Scanner;
import java.util.InputMismatchException;

public class ConsoleInput {
	
	static Scanner inputScanner = new Scanner(System.in);
	
	public static int getValidatedInteger(int minValue, int maxValue) {
		int userInput = 0;
		boolean running = true;
		
		while(running) {

			try {
				
				System.out.println("Please input an integer between " + minValue + " and " + maxValue + " inclusive");
				userInput = inputScanner.nextInt();
				
				if ((userInput >= minValue) && (userInput <= maxValue)) {
					running = false;
				}
				else {
					throw new Exception();
				}
			}
			catch (InputMismatchException e) {
				System.out.println("Incorrect format");
				inputScanner.nextLine();
			}
			catch(Exception e){
				System.out.println("Incorrect range");
				inputScanner.nextLine();
			}
			/*finally {
				inputScanner.close();
			}*/
		}
		return userInput;
	}

	public static double getValidatedDouble(double minValue, double maxValue) {
		double userInput = 0.0;
		boolean running = true;
				
		while(running) {

			try {
				
				System.out.println("Please input an integer between " + minValue + " and " + maxValue + " inclusive");
				userInput = inputScanner.nextDouble();
				
				if ((userInput >= minValue) && (userInput <= maxValue)) {
					running = false;
				}
				else {
					System.out.println("Incorrect range!");
				}
			}
			
	
			catch(Exception e){
				System.out.println("Incorrect format");
				inputScanner.nextLine();
			}
			
			/*finally {
				inputScanner.close();
			}*/
		}
		
			return userInput;
		
	}
	
	public static char getValidatedChar(char minChar, char maxChar) {
	char userInput = 0;
	boolean running = true;
	
	while(running) {

		try {
			System.out.println("Please input an integer between " + minChar + " and " + maxChar + " inclusive");
			userInput = inputScanner.next().charAt(0);
			
			if ((userInput >= minChar) && (userInput <= maxChar)) {
				running = false;
			}
			else {
				System.out.println("Incorrect range!");
			}
		}
		

		catch(Exception e){
			System.out.println("Incorrect format");
			inputScanner.nextLine();
		}
		
		/*finally {
			inputScanner.close();
		}*/
		
	}
	

	return userInput;
	
	}
	
}