package npate334_lab03;
import java.util.Scanner;
public class npate334_lab03_q1 {

	
	public static void main(String[] args) {
		//variable intitialization
		double base;
		int power;
		double answer;
		
		Scanner inputScanner = new Scanner(System.in); 
		//asking user for inputs for base, and power
		System.out.println("Input a real number base");
		base = inputScanner.nextInt();
		
		System.out.println("Input an integer for the power value");
		power = inputScanner.nextInt();
		//calls method created below to return the answer based on user inputed answer
		answer = computePower(base,power);
		System.out.println(answer);
	
	}
//method used to
	public static double computePower(double base, int power) {
		if (power > 0) {
	        return (base * computePower(base, power - 1));
		} else if(power < 0){
	        return (1/computePower(base, -power));
	    } else {
	        return 1;
	    }
	}
}