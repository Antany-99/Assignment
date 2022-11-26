package LogicalPrograms2;

import java.util.Scanner;

public class OddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OddNumbers num=new OddNumbers();
		num.findOddNumbers();
	}

	private void findOddNumbers() {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Number");
		int number=scanner.nextInt();
		System.out.print("The Odd Numbers are ");
		int sum=0;
		for(int i=0;i<=number*2;i++) {
			if(i%2!=0) {
				System.out.print(i+" ");
				sum+=i;}
		}
		System.out.println();
		System.out.println("The Sum is: "+sum);
	}

}
