package circle;
import java.util.Scanner;
public class SquareAreaDemo {
	public static void main (String[] args)
	{
		System.out.println("Enter Side of Square:");
		//Captured the user's input
		Scanner scanner = new Scanner(System.in);
		//Storing the Captured Value in a variable
		double side=scanner.nextDouble();
		//Area of Square = side*side 
		double area = side*side;
		System.out.println("Area of Square is:"+area);
	}
}