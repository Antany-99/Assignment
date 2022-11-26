package LogicalPrograms;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMI body=new BMI();
		body.bodyMeasure();
	}

	void bodyMeasure() {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Weight and then Hight");
		double weight=(scanner.nextInt())*0.45359237;
		double  height=scanner.nextInt();
		height=Math.pow(height*0.0254,2);
		System.out.println("BMI: "+weight/height);
	}

}
