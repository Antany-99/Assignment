package LogicalPrograms2;

import java.util.Scanner;

public class RightTriangleSpecial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RightTriangleSpecial num=new RightTriangleSpecial();
		num.rightAngle3();
	}

	private void rightAngle3() {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Number");
		int number=scanner.nextInt();
		for(int i=1;i<=number;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("@");}
			System.out.println();
		}
	}

}
