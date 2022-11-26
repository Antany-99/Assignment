package LogicalPrograms2;

import java.util.Scanner;

public class RightNumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RightNumber2 num=new RightNumber2();
		num.rightAngle2();
	}

	private void rightAngle2() {
		// TODO Auto-generated method stub
		int count=1;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Number");
		int number=scanner.nextInt();
		for(int i=1;i<number;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(count+++" ");}
			System.out.println();
		}
	}

}
