package LogicalPrograms2;

import java.util.Scanner;

public class IncreasingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IncreasingOrder num=new IncreasingOrder();
		num.checkGreater();
	}

	private void checkGreater() {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Three Numbers");
		int number1=scanner.nextInt();
		int number2=scanner.nextInt();
		int number3=scanner.nextInt();
		if(number1<number2 && number2<number3) {
			System.out.println("Increasing Order");}
		else if(number1>number2 && number2>number3) {
			System.out.println("Decreasing Order");}
		else {
			System.out.println("Neither increasing or decreasing order");}
	}

}
