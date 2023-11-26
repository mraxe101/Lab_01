import java.util.Scanner;
class Year{
	public static void main(String[] args){
		Scanner e = new Scanner(System.in);
		System.out.println("Enter the year");
		float year = e.nextFloat();
		
		float months_in_year = 12;
		float Days_in_month = 30;
		
		float totalmonths = year*months_in_year;
		float remainingdays = (totalmonths%1)*Days_in_month;
		
		System.out.println(year + "Year is approximatly equals to ");
		System.out.println((int)totalmonths +"Months"+ (int)remainingdays +"Days");
	}
}