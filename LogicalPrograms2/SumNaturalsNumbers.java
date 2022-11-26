package LogicalPrograms2;

import java.util.Scanner;

public class SumNaturalsNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumNaturalsNumbers num=new SumNaturalsNumbers();
		num.findSumNaturalNumbers();
	}

	private void findSumNaturalNumbers() {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Number");
		int number=scanner.nextInt();
		int sum=0;
		for(int i=1;i<number+1;i++) {
			sum+=i;}
		System.out.println("The Sum of Natural Number is: "+sum);
	}
}
