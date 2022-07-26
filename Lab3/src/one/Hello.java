package one;

public class Hello {
	public static void main(String[] args) {
		
		/* Solution 1:
		 * System.out.println("Hello World");
		 * System.out.println("Hello World");
		 * System.out.println("Hello World");
		 * System.out.println("Hello World");
		 * System.out.println("Hello World");
		 * System.out.println("Hello World");
		 * System.out.println("Hello World");
		 * System.out.println("Hello World");
		 * System.out.println("Hello World");
		 * System.out.println("Hello World");
		 */
		
		hello(10); // Solution 2: using recursion
	}
	
	public static void hello(int counter) {
		if (counter > 0) {
			System.out.println("Hello World");
			counter--;
			hello(counter);
		}
	}
}
