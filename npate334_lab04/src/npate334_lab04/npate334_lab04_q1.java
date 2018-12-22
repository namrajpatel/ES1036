package npate334_lab04;
import java.util.Scanner;
public class npate334_lab04_q1 {
	
	static class Calculator {
		public static void info() {
			System.out.println("*********************************** \nES1036A: Lab  04 Q1");
			System.out.println("Date: Nov 5th \nName: Namra Patel \nStudent number: 251044779");
			System.out.println("Calculator that does math calculations");
			System.out.println("*********************************** ");
		}
		
		private static char displayMenu() {
			char input;
			do {
				System.out.println("Calculator Applicaition\n-----------------------");
				System.out.println("a. Power Function \nb. Inverse Tangent Function\nc. Sine Function\nd. Exponential Function\ne. Factorial Function \nf. Exit\n---------------------");
				Scanner inputScanner = new Scanner(System.in); //takes input from user 
				System.out.println("Enter your choice");
				input = inputScanner.next().charAt(0);
			} while(input < 'a' || input > 'f'); //checks if the input is in the given range of a-f
			return input; //returns the selection the user made 
		}
		
		public static double sine(double r, int it) {

			double ans=0; 
			for(int n=0; n<it; n++) { //does number of iterations 
				ans+=(double)(power(-1,n)*power(r,(2*n+1))/(factorial(2*n+1))); //math for sine function
			}
			return ans; 
		}
		
		public static double inverseTangent(double rad, int it) {
			double f = 0;
			for(int i = 0; i < it; i++) {				
				f=f+( power(-1, i)*power(rad,(2*i+1))/(2*i+1)); //does math for inverseTan function
			}
			return f;
		}
		
		public static double exponential(double x, int it) {
			double sum=0;
			for(int i=0; i<it; i++) { //runs for number of iterations  
				sum+=power(x,i)/factorial(i);
			}
			return sum;
		}
		
		public static double power(double base, int power) {
			double pow=1; 
			if(power ==0) {
				pow=1;
			}
			if(power>0) {
				for (int i =0; i<power; i++) {
					 pow=pow*base;
					}
				}
			if(power<0){
				power = power*(-1);
				for (int i =0; i<power; i++) {
					 pow=pow*base;
					}
				pow=1/pow;
			}
			return pow;
		}
		public static double factorial(int x) {
			double d=1;
			for(int i=x; i>0; i--) {
				d=d*i;
			}
			return d;
		}
	}
	
	public static void main(String[] args) {
		boolean running = true; 
		double radians; 
		String cho;
		char opt;
		Calculator.info();
		opt = Calculator.displayMenu();

		Scanner inputScanner = new Scanner(System.in); 
		do {
			switch (opt) { //does action based on user
			case 'a':
				System.out.println("Enter a value for the base: ");
				double base = inputScanner.nextDouble();
				System.out.println("Enter a value for the raised power:" );
				int p = inputScanner.nextInt();
				System.out.println("The power is: " + Calculator.power(base, p));
				break;
			case 'b':
				System.out.println("Enter a value for radians");
				double rad1 = inputScanner.nextDouble();
				System.out.println("Enter the number of iterations");
				int it1 = inputScanner.nextInt();
				System.out.println("The inverser tangent is: " + Calculator.inverseTangent(rad1, it1));
				break;
			case 'c':
				System.out.println("Enter a value for radians");
				double rad = inputScanner.nextDouble();
				System.out.println("Enter a value for the number of iterations");
				int it = inputScanner.nextInt();
				System.out.println("The sine value is" + Calculator.sine(rad, it));
				break;
			case 'd':
				System.out.println("Enter a value for the exponential: ");
				double exp = inputScanner.nextDouble();
				System.out.println("Enter a value for the number of iterations");
				int it2 = inputScanner.nextInt();
				System.out.println("The exponential is: "+ Calculator.exponential(exp, it2));
				break;
			case 'e':
				System.out.println("Enter a positive intger: ");
				int fac = inputScanner.nextInt();
				System.out.println("The factorial is: "+Calculator.factorial(fac));
				break;
			case 'f':
				System.out.println("Goodbye!");
				running=false; //ends when user says 
				break;
			}
			Calculator.displayMenu();
		} while (running == true);
		
	}	

}
