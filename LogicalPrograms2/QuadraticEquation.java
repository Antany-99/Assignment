package LogicalPrograms2;

import java.util.*;

public class QuadraticEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuadraticEquation equation=new QuadraticEquation();
		equation.calculate();
	}

	private void calculate() {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number a then b then c");
		double a=scanner.nextDouble();
		double b=scanner.nextDouble();
		double c=scanner.nextDouble();
		double result=b*b*-4.0*a*c;
		if(result>0.0) {
			double plus=(-b+Math.pow(result,0.5))/(2.0*a);
			double minus=(-b-Math.pow(result,0.5))/(2.0*a);
			System.out.println("The Roots are "+plus+" and "+minus);}
		else if(result==0.0) {
			double r=-b/(2.0*a);
			System.out.println("The Roots are "+r);}
		else {
			System.out.println("No Roots");
		}
	}

}
