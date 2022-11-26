package ArrayQuestions;

public class AverageArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AverageArray avg=new AverageArray();
		avg.averageArray();
	}

	private void averageArray() {
		// TODO Auto-generated method stub
		int array[]= {1,2,3,4,5,6};
		int sum=0;
		for(int i=0;i<array.length;i++) {
			sum+=array[i];}
		double average=sum/array.length;
		System.out.println("The Average Number is: "+average);}

}
