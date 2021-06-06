package rectangle;
import java.util.Scanner;
public class AreaOfRectangle {
private static final double width = 0;
public static void main (String[] args)
{
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the lenght of Rectangle");
double lenght = scanner.nextDouble();
System.out.println("Enter the width of Rectangle:");
//Area = lenght*width;
double area = lenght*width;
System.out.println("Area of Rectangle is:"+area);
}
}
