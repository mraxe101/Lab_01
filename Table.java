import java.util.Scanner;
class Table{
	public static void main(String[] args){
		Scanner e = new Scanner(System.in);
		System.out.print("Enter the Number ");
		int number = e.nextInt();
		System.out.println("10*1="+(number*1));
		System.out.println("10"+"*"+"2"+"="+(number*2));
		System.out.println("10"+"*"+"3"+"="+(number*3));
		System.out.println("10"+"*"+"4"+"="+(number*4));
		System.out.println("10"+"*"+"5"+"="+(number*5));
		System.out.println("10"+"*"+"6"+"="+(number*6));
		System.out.println("10"+"*"+"7"+"="+(number*7));
		System.out.println("10"+"*"+"8"+"="+(number*8));
		System.out.println("10"+"*"+"9"+"="+(number*9));
		System.out.println("10"+"*"+"10"+"="+(number*10));
	}
}