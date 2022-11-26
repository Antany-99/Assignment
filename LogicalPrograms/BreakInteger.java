package LogicalPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class BreakInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BreakInteger num=new BreakInteger();
		num.sequentialDigits();
	}

	void sequentialDigits() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Number");
		String number=scanner.next();
		int array[]=new int[number.length()];
		int number1=Integer.parseInt(number);
		for(int index=0;index<number.length();index++){
			array[index]=number1%10;
			number1/=10;}
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		
	}

}
