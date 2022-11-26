package ArrayQuestions;

import java.util.*;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDuplicate num=new RemoveDuplicate();
		num.removeArray();
	}

	private void removeArray() {
		// TODO Auto-generated method stub
		int array[]= {1,5,2,7,4,2,5,8};
		Set<Integer> set=new HashSet<>();
		for(int i=0;i<array.length;i++) {
			set.add(array[i]);}
		System.out.println(set);
	}

}
