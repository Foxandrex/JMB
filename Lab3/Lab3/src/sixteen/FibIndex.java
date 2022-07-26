package sixteen;

public class FibIndex {

	public static void main(String[] args) {
		
		int index = (int) (Math.random() * 40 + 1);
		
		System.out.printf("The fibonacci number located at index %d is: ", index);
		System.out.println(Fibonacci.series(index - 1));

	}

}
