package npate334_lab01;

import java.util.Scanner;

public class npate334_lab01_q1 {

	public static void main(String[] args) {
		double m1,m2,m3,m4,w1,w2,w3,w4,wtotal,mark;	 //variables 

		System.out.println("*********************************** \nES1036A: Lab  01 Q1");
		System.out.println("Date: October 1st, 2018 \nName: Namra Patel \nStudent number: 251044779");
		System.out.println("Program's mission: Gets 4 grades from user an calculates the weighted average");
		System.out.println("*********************************** ");
		//takes inputs from user 
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Enter your first mark: ");
		m1 = inputScanner.nextDouble();
		System.out.println("Enter its weight: ");
		w1 = inputScanner.nextDouble();
		
		System.out.println("Enter your second mark: ");
		m2 = inputScanner.nextDouble();
		System.out.println("Enter its weight: ");
		w2 = inputScanner.nextDouble();

		System.out.println("Enter your third mark: ");
		m3 = inputScanner.nextDouble();
		System.out.println("Enter its weight: ");
		w3 = inputScanner.nextDouble();
		
		System.out.println("Enter your fourth mark: ");
		m4 = inputScanner.nextDouble();
		System.out.println("Enter its weight: ");
		w4 = inputScanner.nextDouble();
		inputScanner.close();
		
		wtotal=w1+w2+w3+w4;
		//will do a check for if the weight is 1 
		if(wtotal == 1) {
			mark= w1*m1 + w2*m2 + w3*m3 + w4*m4; //completes the math 
			System.out.println("Your course grade is: "+ mark);
		}
		else {
			System.out.println("Try again");
		}

	}

}


