package ArrayQuestions;

import java.util.Arrays;

public class MaxMinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxMinArray num=new MaxMinArray();
		num.maxminNumber();
	}

	private void maxminNumber() {
		// TODO Auto-generated method stub
		int array[]={2321,3445,7422,5325,4264,3442,7349};
		Arrays.sort(array);
		System.out.println("The Maximum Number is: "+array[array.length-1]);
		System.out.println("The Minimum Number is: "+array[0]);
		
	}

}
