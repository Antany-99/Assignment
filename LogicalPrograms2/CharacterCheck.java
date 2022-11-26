package LogicalPrograms2;

import java.util.Scanner;

public class CharacterCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CharacterCheck alpha=new CharacterCheck();
		alpha.checkAlphabet();
	}

	private void checkAlphabet() {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Alphabet");
		String alpha=scanner.next();
		char a[]=alpha.toCharArray();
		if(a[0]<'a' && a[0]>'z' && a[0]<'A' && a[0]>'Z' && a.length>1) {
			System.out.println("Error Message");}
		if(a[0]=='a' || a[0]=='e' || a[0]=='i' ||a[0]=='o' || a[0]=='u'||a[0]=='A' || a[0]=='E' || a[0]=='I' ||a[0]=='O' || a[0]=='U') {
			System.out.println("It is a Vowel Character");}
		else {
			System.out.println("It is a Consonant Character");}
		
	}

}
