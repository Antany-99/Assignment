package ArrayQuestions;

import java.util.*;
import java.util.Scanner;

public class SumPairValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumPairValue value=new SumPairValue();
		value.findPair();
	}

	private void findPair() {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Number");
		int number=scanner.nextInt();
		int array[]= {1,4,2,6,8,2,5};
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]+array[j]==number) {
					System.out.println(array[i]+" + "+array[j]+" = "+number);
				}
			}
		}
	}

}
