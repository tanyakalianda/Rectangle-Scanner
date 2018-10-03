/**
 * 
 * @author Tanya Kalianda
 * Rectangle Scanner Project
 */
import java.util.Scanner;

public class RectangleScanner 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter length: ");
		double length = in.nextDouble();
		in.nextLine();
		
		System.out.println("Enter width: ");
		double width = in.nextDouble();
		in.nextLine();
		
		double area = length * width;
		System.out.printf("Area: %.2f", area);
		System.out.println();
		
		double perimeter = length*2 + width*2;
		System.out.printf("Perimeter: %.2f", perimeter);
		System.out.println();
		
		double diagonal = Math.sqrt(length * length + width * width);
		System.out.printf("Diagonal Length: %.2f", diagonal);
		System.out.println();
	}
	

}
