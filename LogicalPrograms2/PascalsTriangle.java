package LogicalPrograms2;

import java.util.Scanner;

public class PascalsTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PascalsTriangle num=new PascalsTriangle();
		num.triangle();
	}

	private void triangle() {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Number");
		int number=scanner.nextInt();
		int i,j,k,num;
		for(i=0;i<number;i++) {
			for(j=number;j>i;j--) {
				System.out.print(" ");}
			num=1;
			for(k=0;k<=i;k++) {
				System.out.print(num+ " ");
	            num = num*(i-k)/(k+1);}
			System.out.println();}
	}

}
