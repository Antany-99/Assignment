package LogicalPrograms2;

import java.util.Scanner;

public class EqualNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EqualNumber num=new EqualNumber();
		num.checkEqual();
	}

	private void checkEqual() {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Three Numbers");
		int number1=scanner.nextInt();
		int number2=scanner.nextInt();
		int number3=scanner.nextInt();
		if(number1==number2 && number2==number3 && number3==number1) {
			System.out.println( "All numbers are equal");}
		else if(number1!=number2 && number2!=number3 && number3!=number1) {
			System.out.println("All numbers are different");}
		else {
			System.out.println("Neither all are equal or different");}
	}


}
