
public class Rectangle2Test {

	public static void main(String[] args) {
		
		// question 2 - sophisticated rectangle
		
				 // A= x1, y1 B= x2, y2 C= x3, y3 D= x4, y4
		        System.out.println("");
		        System.out.println("Rectangle 1: *Testing equals rec*");
				Rectangle2 r1 = new Rectangle2(1, 1, 5, 1, 5, 2, 1, 2); //  equals a rectangle	
				
				System.out.println("");
				System.out.println("Rectangle 2: *Testing not equals rec* ");
				Rectangle2 r2 = new Rectangle2(1.9, 1.2, 5.6, 1.2, 5.7, 2.2, 1.7, 2.9); // does not make a rectangle
				
				System.out.println("");
				System.out.println("Rectangle 3: *Testing out of bounds*");
				Rectangle2 r3 = new Rectangle2(-1, 22, 41, 1.2, 5.7, 2.2, 1.7, 2.9); // some values not between 1 and 20
				
				System.out.println("");
				System.out.println("Rectangle 4: *Testing equals rec*");
				Rectangle2 r4 = new Rectangle2(1, 1, 5, 1, 5, 3, 1, 3); //  equals a rectangle
				
				
				
			    // print out coordinates for r1
				System.out.println(""); // new line
			    System.out.println("R1 Coordinate A: (" + r1.getX1() + ", " + r1.getY1() + ")");
			    System.out.println("R1 Coordinate B: (" + r1.getX2() + ", " + r1.getY2() + ")");
			    System.out.println("R1 Coordinate C: (" + r1.getX3() + ", " + r1.getY3() + ")");
			    System.out.println("R1 Coordinate D: (" + r1.getX4() + ", " + r1.getY4() + ")");
			    
			    // print out coordinates for r2
			    System.out.println(""); // new line
			    System.out.println("R2 Coordinate A: (" + r2.getX1() + ", " + r2.getY1() + ")");
			    System.out.println("R2 Coordinate B: (" + r2.getX2() + ", " + r2.getY2() + ")");
			    System.out.println("R2 Coordinate C: (" + r2.getX3() + ", " + r2.getY3() + ")");
			    System.out.println("R2 Coordinate D: (" + r2.getX4() + ", " + r2.getY4() + ")");
			    
			    // print out coordinates for r3
			    System.out.println(""); // new line
			    System.out.println("R3 Coordinate A: (" + r3.getX1() + ", " + r3.getY1() + ")");
			    System.out.println("R3 Coordinate B: (" + r3.getX2() + ", " + r3.getY2() + ")");
			    System.out.println("R3 Coordinate C: (" + r3.getX3() + ", " + r3.getY3() + ")");
			    System.out.println("R3 Coordinate D: (" + r3.getX4() + ", " + r3.getY4() + ")");
			    
			    // print out coordinates for r3
			    System.out.println(""); // new line
			    System.out.println("R4 Coordinate A: (" + r4.getX1() + ", " + r4.getY1() + ")");
			    System.out.println("R4 Coordinate B: (" + r4.getX2() + ", " + r4.getY2() + ")");
			    System.out.println("R4 Coordinate C: (" + r4.getX3() + ", " + r4.getY3() + ")");
			    System.out.println("R4 Coordinate D: (" + r4.getX4() + ", " + r4.getY4() + ")");
			 
			    
			     //changing coordinates for r1 - testing not rectangle
			    System.out.println(""); // new line
			    System.out.println("*Testing: Changing rectangle 1 to not equal rec*"); 
			    System.out.print("Coordinates set: "); // new line
			    r1.setCoordinates(1.9, 1.2, 5.6, 1.2, 5.7, 2.2, 1.7, 2.9);
			    
			    // changing back coordinates for r1 testing - set coordinates method - equals rectangle
			    System.out.println(""); // new line
			    System.out.println("*Testing: Changing rectangle 1 back to equal rec*"); 
			    System.out.print("Coordinates set: "); // new line
			    r1.setCoordinates(0, 0, 5, 0, 5, 4, 0, 4);
			    
			    
			    
			    
			    // testing find length
			     System.out.println(""); // new line
				 System.out.println("Length of R1: " + r1.findLength());
				 
				 // testing find width
				 System.out.println(""); // new line
			     System.out.println("Width of R1: " + r1.findWidth());
			     
			     //testing perimeter 
			     System.out.println(""); // new line	
			     System.out.println("Perimeter of R1: " + r1.perimeter());
			     
			     //testing area
			     System.out.println(""); // new line
			     System.out.println("Area of R1: " + r1.area());
			     
			     //testing if it is a square - not square 
			     System.out.println(""); // new line
			     System.out.println("*Testing: not equal to square*"); 
			     System.out.println("Is square: " + r1.isSquare());
			     
			     //testing if it is a square - is square 
			     System.out.println(""); // new line
			     System.out.println("*Testing: Changing coordinates to equal square*"); 
			     r1.setCoordinates(1, 1, 4, 1, 4, 4, 1, 4);		   
			     System.out.println("Is square: " + r1.isSquare());
			     
			     
			     System.out.println(""); // new line
					
			     
			     
			     
	}// end main
}//end class
