package ArrayQuestions;

import java.util.*;

public class CommonElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CommonElements num=new CommonElements();
		num.commonElements();
	}

	private void commonElements() {
		// TODO Auto-generated method stub
		String array[]= {"java","python","c"};
		Set<String> set=new HashSet<>(Set.of("c++","sql","java"));
		for(int i=0;i<array.length;i++) {
			if(set.contains(array[i])) {
				System.out.println("The Common Elements are: "+array[i]);}
		}
	}
	

}
