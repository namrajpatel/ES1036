/**
 * 
 */
package npate334;
import java.util.Scanner;
/**
 * @author namrapatel
 *
 */
public class npate334_lab00_q2 {

	public static void main(String[] args) {
		//Inputting double values for variables
		double x1 = 1, y1 = 2, x2 = 4, y2 = 7,
				side1 = 0, side2 = 0, distance = 0;
		//Setting values for sides with respect to the coordinate variables created in line 14
		side1 = x2-x1;
		side2 = y2-y1;
		//Square rooting (side1 squared + side2 squared)
		distance = Math.sqrt(side1*side1 + Math.pow(side2,  2.0));
		
		System.out.println("The distance between points(" +
		Double.toString(x1) + "," + Double.toString(y1) + 
		") and (" + Double.toString(x2) + "," + 
		Double.toString(y2) + ") is " +
		Double.toString(distance));
	}

}
