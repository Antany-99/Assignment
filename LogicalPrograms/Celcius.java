package LogicalPrograms;
import java.util.*;
public class Celcius {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Celcius cel=new Celcius();
		cel.findCelsius();
	}

	 void findCelsius() {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Fahrenheit");
		double fahrenheit=scanner.nextInt();
		double celsius=(5*(fahrenheit-32))/9;
		System.out.println(celsius);
	}

}
