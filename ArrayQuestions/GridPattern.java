package ArrayQuestions;

public class GridPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GridPattern grid=new GridPattern();
		grid.patternGrid();
	
	}
	private void patternGrid() {
		// TODO Auto-generated method stub
		int array[][] = new int[10][10];    
		 for(int i = 0; i < 10; i++){
		      for(int j = 0; j < 10; j++){
		         System.out.print(array[i][j]+" ");}
		      System.out.println();
		   }
	}

}
