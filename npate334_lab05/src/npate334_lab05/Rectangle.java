package npate334_lab05;

public class Rectangle {
	
	double side1,side2;
	
	public Rectangle(double x1, double x2, double y1, double y2) {
		side1 = x2-x1;
		side2 = y2-y1;
	}
	public void scale(double scale) {
		side1 *= scale;
		side2 *= scale;
	}
	public void print() {
		
		for(int i = 0; i < side2; i++) {
			for(int j = 0; j < side1; j++) {
				if (i== 0 || i==(side2 - 1) || j == 0 || j == (side1 - 1)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			System.out.print("\n");
		}			
	}
}