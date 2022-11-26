package LogicalPrograms2;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PositiveNegative num=new PositiveNegative();
		num.checkPosNeg();
	}

	private void checkPosNeg() {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Number");
		int number=scanner.nextInt();
		if(number>=0) {
			System.out.println("Positive Number");}
		else {
			System.out.println("Negative Number");}
	}

}
