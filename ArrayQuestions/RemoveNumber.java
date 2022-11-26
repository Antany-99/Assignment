package ArrayQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveNumber num=new RemoveNumber();
		num.removeNumber();
	}

	private void removeNumber() {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Number");
		int number=scanner.nextInt();
		List<Integer> list=new ArrayList<>(List.of(2321,3445,7422,5325,4264,3442,7349));
		int a=list.indexOf(number);
		list.remove(a);
		System.out.println(list);
	}

}
