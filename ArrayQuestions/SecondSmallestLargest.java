package ArrayQuestions;

import java.util.Arrays;

public class SecondSmallestLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecondSmallestLargest num=new SecondSmallestLargest();
		num.secondNumber();
	}

	private void secondNumber() {
		// TODO Auto-generated method stub
		int array[]={1,5,2,7,4,3,8};
		Arrays.sort(array);
		System.out.println("The Second Largest Number: "+array[array.length-2]);
		System.out.println("The Second Smallest Number: "+array[1]);
		
	}

}
