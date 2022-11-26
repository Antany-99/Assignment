package LogicalPrograms;

import java.util.Scanner;

public class MinutesInYearDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinutesInYearDay min=new MinutesInYearDay();
		min.convertDayYear();
	}

	void convertDayYear() {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Minute");
		int convert=60*24*365;
		int minute=scanner.nextInt();
		int year=minute/convert;
		int day=(minute/(60*24))%365;
		System.out.println("Years: "+year+" Days: "+day);
	}

}
