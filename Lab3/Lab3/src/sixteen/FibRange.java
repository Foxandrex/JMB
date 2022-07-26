package sixteen;

public class FibRange {

	public static void main(String[] args) {
		
		int number = (int) (Math.random() * 41 + 10);
		System.out.println(number);
		
		for (int i = 0; ; i++) {
			if (number < Fibonacci.series(i)) {
				break;
			}
			System.out.print(Fibonacci.series(i) + " ");
		}
	
	}

}
