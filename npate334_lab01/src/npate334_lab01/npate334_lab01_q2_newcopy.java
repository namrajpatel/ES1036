package npate334_lab01;

import java.util.Scanner;

public class npate334_lab01_q2_newcopy {

	public static void main(String[] args) {
		
		

		System.out.println("*********************************** \nES1036A: Lab  01 Q2");
		System.out.println("Date: October 1st, 2018 \nName: Namra Patel \nStudent number: 251044779");
		System.out.println("Program's mission: Output an uppercase letter when the user inputs a lower case letter");
		System.out.println("*********************************** ");
		
		
		int shift;
		char ch;
		Scanner SC = new Scanner(System.in);
		System.out.println("Input a single character");;
		ch = SC.next().charAt(0); //this will obtain the single character from the user
		System.out.println("Input your shift");
		shift = SC.nextInt();
		int ascii = (int) ch; //this will convert to ascii
		ascii = ascii - 32 + shift; //this is going to convert from lowercase to uppercase by subtracting 32 and the shift
			if (ascii>90 ) {
				ascii = ascii - 26;
			}
		ch = (char) ascii; //this converts back to char value
		System.out.println(ch);
		
	}
	
}
