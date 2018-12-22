package npate334_lab05;
import java.util.Scanner;
public class npate334_lab05_q3 {

	public static void main(String[] args) {
		double scaleValue;
		char opt;
		boolean running = true;
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Enter value for x1");
		double x1 = inputScanner.nextDouble();
		System.out.println("Enter value for x2");
		double x2 = inputScanner.nextDouble();
		System.out.println("Enter value for y1");
		double y1 = inputScanner.nextDouble();
		System.out.println("Enter value for y2");
		double y2 = inputScanner.nextDouble();
		Rectangle rect = new Rectangle(x1,x2,y1,y2);
		opt = Menu.displayMenu();
		
		do { 
			switch (opt) {
			case 'a': 
				System.out.println("Please enter a scale value");
				scaleValue = inputScanner.nextDouble();
				rect.scale(scaleValue);
				rect.print();
				break;
			case 'b':
				rect.print();
				break;
			case 'c':
				System.out.println("Goodbye!");
				running = false; //ends when user says 
				return;
			}
			Menu.displayMenu();
			
		}while(running == true); //checks if the input is in the given range of a-f
	}
	
	static class Menu {
	private static char displayMenu() {
		char input;
		do {
			System.out.println("**Rectangle**\n-----------------------");
			System.out.println("a. Scale \nb. Print Function\nc. Exit\n---------------------");
			Scanner inputScanner = new Scanner(System.in); //takes input from user 
			System.out.println("Enter your choice");
			input = inputScanner.next().charAt(0);
		} while(input < 'a' || input > 'c'); //checks if the input is in the given range of a-f
		return input; //returns the selection the user made 
	}
	
}
}
