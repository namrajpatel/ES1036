package npate334_lab01;

import java.util.Scanner;

public class npate334_lab01_q2 {

	public static void main(String[] args) {
		//Variables 
		String temp;
		int len,ascii;
		char a;

		System.out.println("*********************************** \nES1036A: Lab  01 Q2");
		System.out.println("Date: October 1st, 2018 \nName: Namra Patel \nStudent number: 251044779");
		System.out.println("Program's mission: Return an uppercase letter when the user inputs a lower case letter");
		System.out.println("*********************************** ");
		
		//takes inputs from user 
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Enter a lower case letter"); 		
		temp = inputScanner .nextLine();
		inputScanner.close();
		
		//checks the length of the input to make sure that it is a single character (char)
		len= temp.length();
		if(len ==1) {
			a = temp.charAt(0);
			ascii = (int) a;
			if(ascii< 97 | 122<ascii) {
				System.out.println("This is not a lower case letter");
			}
			else {
				ascii -=32; //gets the asci value of upper case letter and casts it to char
				a = (char) ascii;
				System.out.println("The upper case character is: " + a);
			}
		}
		else {
			System.out.println("This is not a letter");
		}
	}
}