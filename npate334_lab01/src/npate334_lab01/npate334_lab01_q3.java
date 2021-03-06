package npate334_lab01;

import java.util.Scanner;

public class npate334_lab01_q3 {

	public static void main(String[] args) {
		//Declare variables 
		int a,b,c;
		double temp,x1, x1a;

		System.out.println("*********************************** \nES1036A: Lab  01 Q3");
		System.out.println("Date: October 1st, 2018 \nName: Namra Patel \nStudent number: 251044779");
		System.out.println("Program's mission: Solve a quadratic equation with the from ax^2 + bx +c =0");
		System.out.println("*********************************** ");
		//takes inputs from the user 
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Enter value for a: "); 
		a = inputScanner.nextInt();
		System.out.println("Enter value for b: "); 
		b = inputScanner.nextInt();
		System.out.println("Enter value for c: "); 
		c = inputScanner.nextInt();
		inputScanner.close();
		//goes through all cases Checks for vales of a,b,c and carries out calculations accordingly
		if(a ==0) {
			if(b !=0) {
				x1 = (c/b)*-1;
				System.out.print("The equation has real root(s)" + x1);
			}
			else if(b==0 & c==0){
				System.out.println("The equation has infinite solutions");
			}
			else if(b==0 & c!=0) {
				System.out.println("The equation has no solution");
			}
		}
		else if(a !=0){
			temp= b^2 - 4*a*c;
			if(temp<0) {
				x1 = -b/2*a;
				x1a = Math.sqrt(4*a*c-b*b)/2*a;
				System.out.println("The equations has complex roots: " + x1 + " + "+ x1a+"i " + " and " + x1 + " - " + x1a+"i");
			}
			else {
				System.out.println(b);
				x1 = (-b + Math.sqrt(b*b-4*a*c)) /(2*a);
				x1a = (-b - Math.sqrt(b*b-4*a*c)) /(2*a);
				System.out.println("The equation has real roots: "+ x1 +" and " + x1a);
			}
		}
	}

}
