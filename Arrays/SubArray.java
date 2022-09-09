package Learning1;

public class SubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,4,2,10,23,3,1,0,20};
		int n=a.length,k=4;
		int count,max=0;
		for(int i=0;i<n-k+1;i++) {
			count=0;
			for(int j=0;j<k;j++) {
				count+=a[i+j];
				if(count>max) {
					max=count;}
			}
		}
		System.out.print(max);
		
	}

}
