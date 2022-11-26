package ArrayQuestions;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		CopyArray copy=new CopyArray();
		copy.copyArray();
	}

	private void copyArray() {
		int array[]= {2321,3445,7422,5325,4264,3442,7349};
		int array1[]=new int[array.length];
		 for(int i=0;i<array.length;i++) {
			 array1[i]=array[i];}
		 System.out.println("Copy of Array: "+Arrays.toString(array1));
	}

}
