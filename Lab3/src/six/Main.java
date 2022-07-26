package six;

public class Main {

	public static void main(String[] args) {
		
		int max = (int) (Math.random() * 1001);
		int den = (int) (Math.random() * 101);
		
		for (int i = 0; i <= max; i++) {
			if (i % den == 0) {
				System.out.println(i);
			}
		}

	}

}
