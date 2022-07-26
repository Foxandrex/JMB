package five;

public class RandomEven {

	public static void main(String[] args) {
		
		int number = (int) (Math.random() * 101);
		
		for (int i = 0; i <= number; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

}
