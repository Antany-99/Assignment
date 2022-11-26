package LogicalPrograms2;

import java.util.Scanner;

public class RhombusNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RhombusNumber num=new RhombusNumber();
		num.rhombusPattern();
	}

	private void rhombusPattern() {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Number");
		int number=scanner.nextInt();
		for(int i=1;i<=number;i++) {
			for(int j=i;j>0;j--) {
				System.out.print(j);
				if(j!=i && j==1) {
					for(int k=1;k<i;k++) {
						System.out.print(k+1);
					}
				}
			}
			System.out.println();
		}
	}

}
