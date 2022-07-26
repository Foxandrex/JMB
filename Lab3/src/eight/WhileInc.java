package eight;

public class WhileInc {

	public static void main(String[] args) {
		
		int number = (int) (Math.random() * 7 + 1);
		
		System.out.printf("%d! = %d", number, factorial(number));

	}
	
	public static int factorial(int num) {
		
		int fact = num, i = 1;
		
		while (i < num) {
			fact *= i;
			i++;
		}
		return fact;
	}
	
}
