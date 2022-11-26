package LogicalPrograms;

import java.util.Scanner;

public class SpeedCalculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpeedCalculate speed=new SpeedCalculate();
		speed.findSpeed();
	}

	void findSpeed() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Distance and Hours then Minutes then Seconds");
		float distance=scanner.nextFloat();
		float hour=scanner.nextFloat();
		float minute=scanner.nextFloat();
		float second=scanner.nextFloat();
		float time = (hour*3600) + (minute*60) + second;
		System.out.println("mps:"+distance / time);
		System.out.println("kph:"+(distance/1000.0f)/(time/3600.0f));
		System.out.println("mph:"+((distance/1000.0f)/(time/3600.0f))/1.609f);
	}

}
