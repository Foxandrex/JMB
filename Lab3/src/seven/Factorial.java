package seven;

public class Factorial {

	public static void main(String[] args) {
		
		int number = (int) (Math.random() * 7 + 1);
		
		System.out.printf("%d! = %d", number, factorial(number));

	}
		
	public static int factorial(int num) {
		
		int fact = num;
		
		if (num > 1) {
			fact *= factorial(num - 1);
			num--;
		}
		return fact;
	}

}
