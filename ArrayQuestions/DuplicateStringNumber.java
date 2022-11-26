package ArrayQuestions;

import java.util.HashSet;
import java.util.Set;

public class DuplicateStringNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuplicateStringNumber num=new DuplicateStringNumber();
		num.duplicateNumber();
	}

	private void duplicateNumber() {
		// TODO Auto-generated method stub
		String array[]= {"Antany","Tom","Felix","Asia","Tom","Eliz"};
		Set<String> set=new HashSet<>();
		for(int i=0;i<array.length;i++) {
			if(set.add(array[i])) {}
			else {
				System.out.println("The Duplicate Value is: "+array[i]);}
		}
	}

}
