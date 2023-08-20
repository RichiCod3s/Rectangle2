
public class Rectangle2 {

	// A= x1, y1 B= x2,y2 C= x3, y3 D= x4, y4
	private double x1, y1, x2, y2, x3, y3, x4, y4; // should this even be double?

	public Rectangle2(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {

		setCoordinates(x1, y1, x2, y2, x3, y3, x4, y4);
	}

	public void setCoordinates(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
		// check if they are in first quadrant - positive numbers between 0 & 20
		if (x1 >= 0 && x1 <= 20 && y1 >= 0 && y1 <= 20 && x2 >= 0 && x2 <= 20 && y2 >= 0 && y2 <= 20 && x3 >= 0
				&& x3 <= 20 && y3 >= 0 && y3 <= 20 && x4 >= 0 && x4 <= 20 && y4 >= 0 && y4 <= 20) {

			this.x1 = x1;
			this.y1 = y1;
			this.x2 = x2;
			this.y2 = y2;
			this.x3 = x3;
			this.y3 = y3;
			this.x4 = x4;
			this.y4 = y4;

			// verify that the coordinates make a rectangle

			// A= x1, y1 B= x2,y2 C= x3, y3 D= x4, y4
			// Formula to find the distance between two points : d = √[(x2 - x1)2 + (y2 - y1)2]
			double distanceAB = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
			double distanceDC = Math.sqrt(Math.pow((x3 - x4), 2) + Math.pow((y3 - y4), 2));
			double distanceAD = Math.sqrt(Math.pow((x4 - x1), 2) + Math.pow((y4 - y1), 2));
			double distanceBC = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));

			 

			// Check whether the lengths of opposite sides are equal. - AB = DC and AD = BC.
			if (distanceAB == distanceDC && distanceAD == distanceBC) {

				
				/* Using the diagonal, divide the rectangle into two triangles and check whether
				 one of the vertices has right angle using Pythagorean Theorem. */
				 

				double distanceBD = Math.sqrt(Math.pow((x4 - x2), 2) + Math.pow((y4 - y2), 2));
			
				
				// had to create this variable because there was a rounding issue in below equation 
				double distanceBDsq = Math.round(Math.pow((distanceBD), 2));

				if (Math.pow((distanceAB), 2) + Math.pow((distanceAD), 2) == distanceBDsq) {
					
				

					System.out.println("The coordinates equal a rectangle!");
				} else {
					System.out.println("The coordinates do not equal a rectangle");
				}

			} else {
				System.out.println("Coordinates do not equal a rectangle");
			}
		} else {
			System.out.println("Coordinates are not in the first quadrant with values between 1 and 20");
			System.out.println("Please enter coordinates again");
		}

	}// end method

	public double findLength() {
		double distanceAB = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		double distanceAD = Math.sqrt(Math.pow((x4 - x1), 2) + Math.pow((y4 - y1), 2));
		return Math.max(distanceAB, distanceAD); // this will return the larger of distances
	}

	public double findWidth() {
		double distanceAB = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		double distanceAD = Math.sqrt(Math.pow((x4 - x1), 2) + Math.pow((y4 - y1), 2));
		return Math.min(distanceAB, distanceAD); // returns smaller distance
	}

	public double perimeter() {
		double length = findLength();
		double width = findWidth();
		return 2 * (length + width);
	}

	public double area() {
		double length = findLength();
		double width = findWidth();
		return length * width;
	}

	public boolean isSquare() {
		double length = findLength();
		double width = findWidth();
		return length == width;
	}

	// getters
	public double getX1() {
		return x1;
	}

	public double getY1() {
		return y1;
	}

	public double getX2() {
		return x2;
	}

	public double getY2() {
		return y2;
	}

	public double getX3() {
		return x3;
	}

	public double getY3() {
		return y3;
	}

	public double getX4() {
		return x4;
	}

	public double getY4() {
		return y4;
	}

}// end class
