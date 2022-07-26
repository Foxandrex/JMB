package ten;

public class RightDigit {

	public static void main(String[] args) {
		
		int number = (int) (Math.random() * 10001);
		
		System.out.printf("%d most right digit is: %d.", number, right(number));

	}

	public static int right(int num) {
		int right = 0;
		right = num % 10;
		return right;
	}
	
}
