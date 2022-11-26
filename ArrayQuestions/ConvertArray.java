package ArrayQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConvertArray num=new ConvertArray();
		num.convertArrayList();
	}

	private void convertArrayList() {
		// TODO Auto-generated method stub
		String array[]= {"1","2","3","4","5"};
		ArrayList<String> list=new ArrayList<>(Arrays.asList(array));
		System.out.println(list);
	}

}
