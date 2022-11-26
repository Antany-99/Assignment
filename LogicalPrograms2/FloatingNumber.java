package LogicalPrograms2;

import java.util.Scanner;

public class FloatingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FloatingNumber num=new FloatingNumber();
		num.compareTwo();
	}

	private void compareTwo() {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Two Numbers");
		double number1=scanner.nextInt();
		double number2=scanner.nextInt();
		number1=(Math.round(number1*1000))/1000;
		number2=(Math.round(number2*1000))/1000;
		if(number1==number2) {
			System.out.println("Same");}
		else {
			System.out.println("Different");}
	}

}
