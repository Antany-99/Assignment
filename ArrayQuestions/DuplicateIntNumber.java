package ArrayQuestions;

import java.util.*;

public class DuplicateIntNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuplicateIntNumber num=new DuplicateIntNumber();
		num.duplicateNumber();
	}

	private void duplicateNumber() {
		// TODO Auto-generated method stub
		int array[]= {1,6,2,8,6,2};
		Set<Integer> set=new HashSet<>();
		for(int i=0;i<array.length;i++) {
			if(set.add(array[i])) {}
			else {
				System.out.println("The Duplicate Value is: "+array[i]);}
		}
	}

}
