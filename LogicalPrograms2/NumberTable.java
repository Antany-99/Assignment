package LogicalPrograms2;

import java.util.Scanner;

public class NumberTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberTable num=new NumberTable();
		num.findNumbersTable();
	}

	private void findNumbersTable() {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Number");
		int number=scanner.nextInt();
		for(int i=0;i<number+1;i++) {
			System.out.println(number+" X "+i+" = "+(number*i));
		}
	}

}
