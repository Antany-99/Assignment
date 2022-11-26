package ArrayQuestions;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseArray num=new ReverseArray();
		num.reverseNumber();
	}

	private void reverseNumber() {
		// TODO Auto-generated method stub
		int array[]={2321,3445,7422,5325,4264,3442,7349};
		int array1[]=new int[array.length];
		int j=0;
		for(int i=array.length-1;i>=0;i--,j++) {
			array1[j]=array[i];}
		System.out.println("The Reverse Number: "+Arrays.toString(array1));
	}

}
