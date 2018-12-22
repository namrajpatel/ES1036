
package npate334_lab03;

import java.util.Scanner;

public class npate334_lab03_q1_loop {

	public static void main(String[] args) {
		//initializing variables
		double base;
		int power;
		double answer;
		
		Scanner inputScanner = new Scanner(System.in); 
		//asking users to input base and power
		System.out.println("Input a real number base");
		base = inputScanner.nextInt();
		
		System.out.println("Input an integer for the power value");
		power = inputScanner.nextInt();
		//calling math method created below and printing the answer from it
		answer = computePower(base,power);
		System.out.println(answer);
	
	}
	public static double computePower(double base, int power) {
		double ans =1; 
		if(power == 0) { //case for if the power is 0 
			ans=1;
		}
		if(power > 0) { //case for positive power
			for(int i=0; i<power; i++) {
				ans=ans*base;
			}
		}
		if(power < 0) { //case for negative power
			power*=-1;
			for(int i = 0; i < power; i++) {
				ans=ans*base;
			}
			ans = 1/ans;
		}
		return ans; //returns the answer back to the main 
	}

}
