import java.util.Scanner;
class Temperature{
	public static void main(String[] args){
		Scanner e = new Scanner(System.in);
		System.out.println("Enter the temperature in celcius ");
		int temp_in_celcius = e.nextInt();
		
		int temp_in_fahrenheit = (9/5)*temp_in_celcius+32;
		System.out.println("Temperature in fahrenheit = " + temp_in_fahrenheit);
	}
}