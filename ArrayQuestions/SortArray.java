package ArrayQuestions;

import java.util.*;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortArray sort=new SortArray();
		sort.arrangeArray();
	}

	private void arrangeArray() {
		// TODO Auto-generated method stub
		int array1[]={1435,7233,3214,9474,5443,2432,7556};
		String array2[]= {"India","China","Srilanka","America","Russia"};
		Arrays.sort(array1);
		Arrays.sort(array2);
		System.out.println("The Numeric Array is: "+Arrays.toString(array1));
		System.out.println("The String Array is: "+Arrays.toString(array2));
		
	}

}
