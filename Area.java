import java.util.Scanner;
class Area{
	public static void main(String[] args){
	Scanner e = new Scanner(System.in);
	
	System.out.println("Enter the length of circle");
	int length = e.nextInt();
	
	System.out.println("Enter the width of circle");
	int width = e.nextInt();
	
	int Area = length*width;
	
	System.out.println("Area of a circle is " + Area);
	}
}