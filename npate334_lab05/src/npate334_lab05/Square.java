package npate334_lab05;

public class Square extends Shape {
	
	public Square(double sideLength) {
		super.setSideLength(sideLength);
		super.setNumberOfSides(4);
	}
		public double computeArea() {
			return super.getSideLength()*super.getSideLength();
	}
		public double computePerimeter() {
			return super.getSideLength()*4;
	}
}
