package LogicalPrograms2;

import java.util.Scanner;

public class RightNumber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RightNumber1 num=new RightNumber1();
		num.rightAngle1();
	}

	private void rightAngle1() {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Number");
		int number=scanner.nextInt();
		for(int i=1;i<=number;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);}
			System.out.println();
		}
	}

}
