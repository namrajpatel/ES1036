package npate334_lab03;
import java.util.Scanner;
public class npate334_lab03_q2 {

	public static void main(String[] args) {
		//initializing/declaring variables
		double sum = 0;
		int N = 1000;
		double calculation = 0.0;
		double x ;
		boolean running = true; //boolean used to loop the code based on user input
		char userCheck;
		String checkVariable = "y"; //variable used to compare user input for continuation at the end
		int count = 0;
		
		Scanner inputScanner = new Scanner(System.in); 
		
		while (running == true) { //boolean used to make the code loop
			do {
				if (count > 0){
					System.out.println("Invalid input for x");
				}
				System.out.println("Enter a value between 1 and -1 for x");
				x = inputScanner.nextDouble(); //user enters a radian value
				count++;
				
		} while (x > 1 || x < -1); //while loop used to 
			for (int n = 0; n < N; n++) {
				calculation = (computePower(-1.0, n) * computePower(x, (2*n+1))) / (2*n+1); //does math part to calculate
				sum += calculation; 
			}
			System.out.println(sum); //prints the answer from the math
			count = 0;
			sum = 0;
			System.out.println("Do you want to continue? (y/n)"); //asks user if they want to continue
			userCheck = inputScanner.next().charAt(0); // sets the check variable = to the user's input to the question
			running = userCheck == checkVariable.charAt(0); //if the check variable = the initially set "y" value at variable declarations at the top, running will continue to = true
		}
		System.out.println("Goodbye :)");
		inputScanner.close();
	
}


	//previously used method for computing an exponential answer
	public static double computePower(double base, int power) {
		if (power > 0) { 
	        return (base * computePower(base, power - 1)); //case for if the power is positive 
		} else if(power < 0){
	        return (1/computePower(base, -power)); //case for if the power is negative
	    } else {
	        return 1; //if the power is neither negative or positive, it must be 0, if it is 0 then return 1
	    }
	}

}
