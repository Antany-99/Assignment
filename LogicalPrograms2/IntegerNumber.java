package LogicalPrograms2;

import java.util.Scanner;

public class IntegerNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntegerNumber num=new IntegerNumber();
		num.numberLength();
	}

	private void numberLength() {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Number");
		int number=scanner.nextInt();
		String number1=""+number;
		System.out.println("The Number of Digits are: "+number1.length());
	}

}
