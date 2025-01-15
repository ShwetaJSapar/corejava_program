//Q:WRITE A PROGRAM TO FIND THE PERIMETER OF THE SQUARE//
package ANP_D0453;

import java.util.Scanner;
public class SquarePerimeter {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double area, side, perimeter;

		// Example Test Case
		area = 16;

		// Calculate side length
		side = Math.sqrt(area);

		// Calculate perimeter
		perimeter = 4 * side;

		// Display result
		System.out.println("Perimeter: " + perimeter);
	}
}
//Output: Perimeter: 16.0
