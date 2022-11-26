package ArrayQuestions;

import java.util.*;

public class FindIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindIndex num=new FindIndex();
		num.findIndexNumber();
	}

	private void findIndexNumber() {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Number");
		int number=scanner.nextInt();
		List<Integer> list=new ArrayList<>(List.of(2321,3445,7422,5325,4264,3442,7349));
			System.out.println(list.indexOf(number));
	}

}
