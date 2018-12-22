package npate334_lab05;


public class Circle extends Shape {
	public Circle(double sideLength) {
	super.setSideLength(sideLength);
}
	public double computeArea() {
		return (super.getSideLength()*3.14)*2;
	}
	public double computePerimeter() {
		return (2*3.14*super.getSideLength());
	}
}
