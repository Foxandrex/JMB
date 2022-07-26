package fourteen;

import thirteen.Reverse;

public class Palindrome {

	public static void main(String[] args) {
		
		int number = (int) (Math.random() * 100001);
		
		Reverse r = new Reverse(number);
		
		if (number == r.mirror) {
			System.out.println(number + " is a palindrome.");
		}
		else {
			System.out.println(number + " is not a palindrome.");
		}

	}

}
