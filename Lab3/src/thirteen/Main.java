package thirteen;

public class Main {

	public static void main(String[] args) {
		
		int number = (int) (Math.random() * 10001);
		
		Length d = new Length(number);
		LeftDigit l = new LeftDigit(number);
		Sum s = new Sum(number);
		Reverse r = new Reverse(number);
		
		Length rd = new Length(r.mirror);
		
		System.out.println("The number is: " + number + ".");
		System.out.println("It has " + d.digits + " digits.");
		System.out.println("The first left digit of the number is " + l.left + ".");
		System.out.println("The sum of its digit is " + s.sum + ".");
		if (d.digits == rd.digits) {
			System.out.println("The opposite order of its digits is " + r.mirror + ".");
		}
		else {
			System.out.println("The opposite order of its digits is 0" + r.mirror + ".");
		}
	}

}
