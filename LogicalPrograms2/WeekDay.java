package LogicalPrograms2;

import java.util.Scanner;

public class WeekDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeekDay day=new WeekDay();
		day.findDay();
	}

	private void findDay() {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=scanner.nextInt();
		String days[]= {"","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY","SUNDAY"};
		if(number>=1 && number<=7) {
			System.out.println("The Day is: "+days[number]);}
		else {
			System.out.println("The Number Is Invalid");
		}
	}

}
