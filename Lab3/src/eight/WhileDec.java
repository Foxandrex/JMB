package eight;

public class WhileDec {

	public static void main(String[] args) {
		
		int number = (int) (Math.random() * 7 + 1);
		
		System.out.printf("%d! = %d", number, factorial(number));

	}
	
	public static int factorial(int num) {
		
		int fact = num, i = num;
		
		while (i > 1) {
			fact *= (i - 1);
			i--;
		}
		return fact;
	}
	
}
