package eight;

public class ForDec {

	public static void main(String[] args) {
		
		int number = (int) (Math.random() * 7 + 1);
		
		System.out.printf("%d! = %d", number, factorial(number));

	}
		
	public static int factorial(int num) {
		
		int fact = num;
		
		for (int i = num; i > 1; i--) {
			fact *= (i - 1);
		}
		return fact;
	}

}
