package LogicalPrograms2;

import java.util.Scanner;

public class FindDaysInMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindDaysInMonth day=new FindDaysInMonth();
		day.findDays();
	}

	private void findDays() {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Month and Year");
		int month=scanner.nextInt();
		int year=scanner.nextInt();
		int monthInDays[]={31,28,31,30,31,30,31,31,30,31,30,31};
		int days=0;
		if(month==2) {
			if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
				System.out.println("The Days in the Month "+month+" is "+29);}
		}
		else {
			System.out.println("The Days in the Month "+month+" is "+monthInDays[month]);}
	}

}
