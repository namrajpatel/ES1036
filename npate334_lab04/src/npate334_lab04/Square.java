package npate334_lab04;

	public class Square extends Shape{
		public Square(double x){
			sideLength = x;
		}
		
		protected void setNumberOfSides(int num) {
			numberOfSides=num;
		}

		protected int getNumberOfSides() {
			return numberOfSides;
		}
		protected void setSideLength(double length) {
			sideLength= length; 
		}
		protected double getSideLength() {
			return sideLength;
		}
		protected double computeArea() {
			return sideLength*sideLength;
		}
		protected double computePerimeter() {
			return sideLength*4;
		}
	}
