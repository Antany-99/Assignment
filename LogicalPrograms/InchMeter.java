package LogicalPrograms;

import java.util.Scanner;

public class InchMeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InchMeter inchMeter=new InchMeter();
		inchMeter.convertMeter();
	}

	void convertMeter() {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the inch");
		double inch=scanner.nextInt();
		double meter=inch*0.0254;
		System.out.println(meter);
	}

}
