package LogicalPrograms2;

import java.util.Scanner;

public class NaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NaturalNumbers num=new NaturalNumbers();
		num.findNaturalNumbers();
	}

	private void findNaturalNumbers() {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Number");
		int number=scanner.nextInt();
		System.out.print("The First "+number+" Natural Number is: ");
		for(int i=1;i<number+1;i++) {
			System.out.print(i+" ");}
	}

}
