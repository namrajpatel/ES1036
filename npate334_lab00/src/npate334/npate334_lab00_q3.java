package npate334;
import java.util.Scanner;
/**
 * @author namrapatel
 *
 */
public class npate334_lab00_q3 {

	public static void main(String[] args) {
		//Inputting double values for variables
		double x1 = 0, y1 = 0, x2 = 0, y2 = 0,
				side1 = 0, side2 = 0, distance = 0, perimeter = 0;
		
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Enter value for x1,");
		x1 = inputScanner.nextInt();
		System.out.println("Enter value for y1");
		y1 = inputScanner.nextInt();
		System.out.println("Enter value for x2");
		x2 = inputScanner.nextInt();
		System.out.println("Enter value for y2");
		y2 = inputScanner.nextInt();
		
		side1 = Math.abs(x2-x1);
		side2 = Math.abs(y2-y1);
		
		System.out.println("The distance between points(" +
				Double.toString(x1) + "," + Double.toString(y1) + 
				") and (" + Double.toString(x2) + "," + 
				Double.toString(y2) + ") is " +
				Double.toString(distance));

		//Compute the perimeter
		perimeter = side1 + side2 + distance;
		System.out.println("The perimeter of the triangle is " + Double.toString(perimeter));
		
	}
}
