package npate334_lab05;

public class Shape {
	private int numOfSides;
	private double sideLength;

	protected void setNumberOfSides(int num) {
		numOfSides = num;
	}
	protected int getNumberOfSides() {
		return numOfSides;
	}
	protected void setSideLength(double length) {
		sideLength = length;
	}
	protected double getSideLength() {
		return sideLength;
	}
	public double computeArea() {
		System.out.println("Calling superclass computeArea");
		return 0;
	}
	public double computePerimeter() {
		System.out.println("Calling superclass computePerimeter");
		return 0;
	}
}
	
