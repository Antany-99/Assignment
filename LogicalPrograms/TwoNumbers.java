package LogicalPrograms;

import java.util.Scanner;

public class TwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoNumbers num=new TwoNumbers();
		num.operateNum();
	}

	void operateNum() {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the First Number");
		int number1=scanner.nextInt();
		System.out.println("Enter the Second Number");
		int number2=scanner.nextInt();
		System.out.println("Sum: "+(number1+number2));
		System.out.println("Difference: "+(Math.abs(number1-number2)));
		System.out.println("Product: "+(number1*number2));
		System.out.println("Average: "+((number1+number2)/2));
		System.out.println("Distance: "+(Math.abs(number1-number2)));
		System.out.println("Maximum: "+(Math.max(number1,number2)));
		System.out.println("Minimum: "+(Math.min(number1,number2)));
	}

}
