package Learning1;
public class Weightage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {49,36,8,10,12};
		int n=a.length,b,t=0,d=0;
		int c[]=new int[n];
		for(int i=0;i<n;i++) {
			b=(int)Math.sqrt(a[i]);
			if(a[i]==b*b) {
				c[i]+=5;}
			if((a[i]%4==0)||(a[i]%6==0)) {
				c[i]+=4;}
			if(a[i]%2==0) {
				c[i]+=3;}
		}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(c[i]<c[j]) {
					t=c[i];
					c[i]=c[j];
					c[j]=t;
					d=a[i];
					a[i]=a[j];
					a[j]=d;
					}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print("<"+a[i]+","+c[i]+"> ");
		}
	}

}
