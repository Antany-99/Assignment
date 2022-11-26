package LogicalPrograms2;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeapYear year=new LeapYear();
		year.findLeapYear();
	}

	private void findLeapYear() {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Year");
		int year=scanner.nextInt();
		if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
			System.out.println("It is a Leap Year");}
		else {
			System.out.println("It is a Non Leap Year");}
	}

}
