package eleven;

public class LeftDigit {

	public static void main(String[] args) {
		
		int number = (int) (Math.random() * 10001);
		
		System.out.printf("%d most left digit is: %d.", number, left(number));

	}

	public static int left(int num) {
		int left = 0;
		
		while(num > 0) {
			left = num % 10;
			num /= 10;
		}
		return left;
	}
	
}
