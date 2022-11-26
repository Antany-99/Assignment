package LogicalPrograms;

import java.util.Scanner;

public class AddIntDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddIntDigits addNumber=new AddIntDigits();
		addNumber.sumAll();
	}

	void sumAll() {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Number Between 0 to 1000");
		int number=scanner.nextInt();
		int sum=0;
		while(number>0) {
			int reminder=number%10;
			sum+=reminder;
			number/=10;}
		System.out.println(sum);
	}

}
