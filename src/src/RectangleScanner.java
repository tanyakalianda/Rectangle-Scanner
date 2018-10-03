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
		
		System.out.print("Enter length: ");
		double length = in.nextDouble();
		in.nextLine();
		
		System.out.print("Enter width: ");
		double width = in.nextDouble();
		in.nextLine();
		
		double area = length * width;
		System.out.printf("%-20s %6.2f","Area:", area);  //%-20s modifies the string "Area" and gives the total characters 20 (including the Area:)
		System.out.println();
		
		double perimeter = length*2 + width*2;
		System.out.printf("%-20s %6.2f", "Perimeter:", perimeter);
		System.out.println();
		
		double diagonal = Math.sqrt(length * length + width * width);
		System.out.printf("%-20s %6.2f", "Diagonal Length:", diagonal);
		System.out.println();
	}
	

}
