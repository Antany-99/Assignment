package LogicalPrograms2;

import java.util.Scanner;

public class SumAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumAverage num=new SumAverage();
		num.findSumAverageNumbers();
	}

	private void findSumAverageNumbers() {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Number");
		int number=scanner.nextInt();
		int sum=0;
		for(int i=1;i<number+1;i++) {
			sum+=i;}
		System.out.println("The Sum is: "+sum+" and Average is "+(sum/number));
	}

}
