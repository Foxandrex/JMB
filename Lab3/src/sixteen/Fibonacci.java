package sixteen;

public class Fibonacci {

	public static void main(String[] args) {
		for (int i = 0; i < 40; i++) {
			System.out.print(series(i) + " ");
		}	
	}

	public static int series(int id) {
		
		int[] fibonacci = new int[40];
		fibonacci[0] = fibonacci[1] = 1;
		
		for (int i = 2; i < fibonacci.length; i++) {
			fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
			//System.out.print(fibonacci[i - 2] + " ");
		}
		/* for (int i : fibonacci) {
		 * System.out.print(i + " ");
		}*/
			
		return fibonacci[id];
	
	}
	
}
