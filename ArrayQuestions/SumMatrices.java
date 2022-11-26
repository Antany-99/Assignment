package ArrayQuestions;

public class SumMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumMatrices num=new SumMatrices();
		num.sumArrayMatrices();
	}

	private void sumArrayMatrices() {
		// TODO Auto-generated method stub
		int array1[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int array2[][]= {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(array1[i][j]+array2[i][j]+" ");}
			System.out.println();
		}
	}

}
