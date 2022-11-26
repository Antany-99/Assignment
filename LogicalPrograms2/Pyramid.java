package LogicalPrograms2;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pyramid num=new Pyramid();
		num.pyramidPattern();
	}

	private void pyramidPattern() {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Number");
		int number=scanner.nextInt();
		for(int i=1;i<number;i++) {
			for(int j=number-i;j>0;j--) {
				System.out.print(" ");}
			for(int k=1;k<=i;k++) {
				System.out.print(i+" ");}
			System.out.println();
		}
	}

}
