package ArrayQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConvertArrayList num=new ConvertArrayList();
		num.convertArray();
	}

	private void convertArray() {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<>(List.of("1","2","3","4","5"));
		String array[]=new String[list.size()];
		list.toArray(array);
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}

}
