package nine;

public class Length {

	public static void main(String[] args) {
		
		int number = (int) (Math.random() * 10001);
		
		System.out.printf("%d has %d digits.", number, length(number));

	}
	
	public static int length(int num) {
		int digits = 0;
		
		while(num > 0) {
			num /= 10;
			digits++;
		}
		return digits;
	}

}
