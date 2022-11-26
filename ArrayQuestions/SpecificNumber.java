package ArrayQuestions;
import java.util.*;

public class SpecificNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpecificNumber num=new SpecificNumber();
		num.findSpecificNumber();
	}

	private void findSpecificNumber() {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Number");
		int number=scanner.nextInt();
		List<Integer> list=new ArrayList<>(List.of(2321,3445,7422,5325,4264,3442,7349));
		if(list.contains(number)) {
			System.out.println("Contains");}
		else {
			System.out.println("Not Contains");}
	}

}
