package LogicalPrograms;

import java.util.Scanner;

public class DisplayNumCuSqFo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DisplayNumCuSqFo num=new DisplayNumCuSqFo();
		num.displayNum();
	}

	void displayNum() {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Number");
		int number=scanner.nextInt();
		System.out.println("Square: "+(int)Math.pow(number, 2));
		System.out.println("Cube: "+(int)Math.pow(number, 3));
		System.out.println("Fourth: "+(int)Math.pow(number, 4));
	}

}
