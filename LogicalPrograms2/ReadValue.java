package LogicalPrograms2;

import java.util.Scanner;

public class ReadValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReadValue value=new ReadValue();
		value.findNumber();
	}

	private void findNumber() {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Number");
		double number=scanner.nextDouble();
		if(number>0.0) {
			System.out.println("The Value of m is: "+number+" The Value of n is: "+1);}
		else if(number==0.0) {
			System.out.println("The Value of m is: "+number+" The Value of n is: "+0);}
		else {
			System.out.println("The Value of m is: "+number+" The Value of n is: "+(-1));
		}
	}

}
