package sixteen;

public class Fibonacci {

	public static void main(String[] args) {
		
		int[] fibonacci = new int[40];
		fibonacci[0] = fibonacci[1] = 1;
		
		for (int i = 2; i < fibonacci.length; i++) {
			fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
			System.out.print(fibonacci[i - 2] + " ");
		}
		
		//for (int i : fibonacci) {
			//System.out.print(i + " ");
		//}
	}
}
