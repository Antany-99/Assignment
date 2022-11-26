package LogicalPrograms2;

import java.util.Scanner;

public class FloatingPointNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FloatingPointNumber num=new FloatingPointNumber();
		num.checkNumber();
	}

	private void checkNumber() {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Number");
		double number=scanner.nextDouble();
		if(number==0) {
			System.out.println("Zero");}
		else if(number>0) {
			if(number<1) {System.out.println("Positive Small Number");}
			else if(number>1000000) {System.out.println("Positive Large Number");}
			else {System.out.println("Positive Number");}
		}
		else {
			if(Math.abs(number)<1) {System.out.println("Negative Small Number");}
			else if(Math.abs(number)>1000000) {System.out.println("Negative Large Number");}
			else {System.out.println("Negative Number");}
		}
	}

}
