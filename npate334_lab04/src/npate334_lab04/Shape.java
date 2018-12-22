package npate334_lab04;

public abstract class Shape {
	protected int numberOfSides;
	protected double sideLength;
	protected abstract void setNumberOfSides(int num);
	protected abstract int getNumberOfSides();
	protected abstract void setSideLength(double length);
	protected abstract double getSideLength();
	protected abstract double computeArea();
	protected abstract double computePerimeter();
	
}

