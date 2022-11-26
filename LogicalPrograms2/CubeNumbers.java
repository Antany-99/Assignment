package LogicalPrograms2;

import java.util.Scanner;

public class CubeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CubeNumbers num=new CubeNumbers();
		num.findCubeNumbers();
	}

	private void findCubeNumbers() {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Number");
		int number=scanner.nextInt();
		int sum=0;
		for(int i=1;i<number+1;i++) {
			System.out.println("Number is "+i+"and cube of "+i+" is "+(int)(Math.pow(i,3)));
		}
	}

}
