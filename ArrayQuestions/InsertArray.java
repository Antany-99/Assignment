package ArrayQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class InsertArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertArray insert=new InsertArray();
		insert.insertNumber();
	}

	private void insertNumber() {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the New Number");
		int number=scanner.nextInt();
		System.out.println("Enter the Index");
		int index=scanner.nextInt();
		int array[]={2321,3445,7422,5325,4264,3442,7349};
		array[index]=number;
		System.out.println(Arrays.toString(array));
	}

}
