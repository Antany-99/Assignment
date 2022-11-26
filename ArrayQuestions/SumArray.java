package ArrayQuestions;

public class SumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumArray sum=new SumArray();
		sum.sumNumbers();
	}

	private void sumNumbers() {
		// TODO Auto-generated method stub
		int array[]= {1,5,2,8,3};
		int sum=0;
		for(int i=0;i<array.length;i++) {
			sum+=array[i];}
		System.out.println("The Sum of Array is: "+sum);
	}

}
