import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		// Area = length + Width
		// Perimeter = 2 *(length + Width)
		// Volume = length + width + height 
		Scanner scanner = new Scanner (System.in);
		
		double length = 0;
		double width = 0;
		double height = 0;
	
		double perimeter = 0; 
		double volume = 0;
		
		while (true) {
		System.out.println("Enter the length of the rectangle : ");
		length = scanner.nextDouble();
		
		System.out.print("Enter the width of the rectangle: ");
		width = scanner.nextDouble();
		
		System.out.print("Enter the height of the rectangle: ");
		height = scanner.nextDouble();
		
		double area = length * width;
		perimeter = 2 *(length + width);
		volume = length * width * height;
		System.out.println("The Area of Rectangle is : "+ area);
		System.out.println("The Perimeter of Rectangle is : "+ perimeter);
		System.out.println("The Volume of Rectangle is : " + volume);
			String garbage = scanner.nextLine();
			String goForward = scanner.nextLine();
			if (goForward.equals("y")){
			System.out.println("Let's go again");
			} else {
				System.out.print("Bye");}
			}
	}
}