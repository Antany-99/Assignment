package LogicalPrograms2;

import java.util.*;

public class GreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GreatestNumber num=new GreatestNumber();
		num.findGreatestNumber();
	}

	private void findGreatestNumber() {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Three Numbers");
		int number1=scanner.nextInt();
		int number2=scanner.nextInt();
		int number3=scanner.nextInt();
		int result=Math.max(Math.max(number1, number2),Math.max(number2, number3));
		System.out.println("The Greatest Number is: "+result);
	}

}
