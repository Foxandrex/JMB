package three;

public class RandomPrint {

	public static void main(String[] args) {
		
		int number = (int) (Math.random() * 101);
		
		for (int i = 1; i <= number; i++) {
			System.out.println(i);
		}

	}

}
