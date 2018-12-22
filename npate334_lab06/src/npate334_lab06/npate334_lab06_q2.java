package npate334_lab06;
import java.util.Scanner;

public class npate334_lab06_q2 {

	public static void main(String[] args) {
		
		Scanner inputScanner = new Scanner(System.in);
		int userNum = 0;
		boolean go = true;
		boolean running = true;
		double grade = 0;
		double weightTotal = 0;
		
		System.out.println("How many grades do you want to input?");
		userNum = inputScanner.nextInt();
		
		double gradesArray[] = new double[userNum];
		double weightsArray[] = new double[userNum];
		
		while(running) {
			for(int i = 0; i < userNum; i++) {
				while (go) {
					try {
						System.out.println("Enter grade " + (i+1));
						gradesArray[i] = inputScanner.nextDouble();
						
							if (gradesArray[i] < 0 || gradesArray[i] > 100) {
								//System.out.println("incorrect grade");
								//continue;
								throw new Exception();
							}
						System.out.println("Enter weight " + (i+1));
						weightsArray[i] = inputScanner.nextDouble();
							if (weightsArray[i] < 0 || weightsArray[i] > 1) {
								//System.out.println("incorrect grade weight");
								//continue;
								throw new Exception();
							}					
					}
					catch(Exception e) {
						System.out.println("Invalid input value!");
					}
					finally {
						if (((gradesArray[i] <= 100) && (gradesArray[i] >= 0)) && ((weightsArray[i] >= 0) && (weightsArray[i] <= 1))) {
							break;
						}
					}
				}
				grade += gradesArray[i] * weightsArray[i];
				weightTotal += weightsArray[i];
			}
			if (weightTotal == 0.6) {
				running = false;
			}
			else {
				System.out.println("Grade weights must add up to 1.0, please retry.");
			}
		}
		System.out.println("Your overall grade is " + grade);
		inputScanner.close();
	}

}