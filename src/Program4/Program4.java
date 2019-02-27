package Program4;
//Michael Binelli

import java.util.Scanner;
public class Program4 {
	public static void main(String[] args) {
		String doubleLiteral;
		Scanner stdIn = new Scanner(System.in);
		System.out.println("Please enter a valid (4 character) double literal: ");
		doubleLiteral = stdIn.nextLine();		
		
		if(doubleLiteral.length() == 4) {
			char c1 = doubleLiteral.charAt(0);
			char c2 = doubleLiteral.charAt(1);
			char c3 = doubleLiteral.charAt(2);
			char c4 = doubleLiteral.charAt(3);
			
			if(c1 == '+' || c1 == '-') {
				if((c2 >= 0 && c2 <= 9) || (c3 >= 0 && c3 <= 9) || (c4 == '.')){
					System.out.println(doubleLiteral + " is a valid (4 character) double literal.");
				}
				else if((c2 >= 0 && c2 <= 9) || (c3 == '.') || (c4 >= 0 && c4 <= 9)) {
					System.out.println(doubleLiteral + " is a valid (4 character) double literal.");
				}
				else if((c2 == '.') || (c3 >= 0 && c3 <= 9) || (c4 >= 0 && c4 <= 9)) {
					System.out.println(doubleLiteral + " is a valid (4 character) double literal.");
				}
			}
			else if(c1 >=0 && c1 <=9) {
				if((c2 == '.') || (c3 >=0 && c3 <=9) || (c4 >=0 && c4 <=9)) {
					System.out.println(doubleLiteral + " is a valid (4 character) double literal.");
				}
				else if((c2 >=0 && c2 <=9) || (c3 == '.') || (c4 >=0 && c4 <=9)) {
					System.out.println(doubleLiteral + " is a valid (4 character) double literal.");
				}
				else if((c2 >=0 && c2 <=9) || (c3 >=0 && c3 <=9) || (c4 == '.')) {
					System.out.println(doubleLiteral + " is a valid (4 character) double literal.");
				}
			}
			else if(c1 == '.') {
				if((c2 >= 0 && c2 <=9) || (c3 >=0 && c3 <=9) || (c4 >=0 && c4 <= 9)) {
					System.out.println(doubleLiteral + " is a valid (4 character) double literal.");
				}
			}	
		}
		else {
			System.out.println(doubleLiteral + " is not a valid (4 character) double literal");
		}
		stdIn.close();
	}
}
