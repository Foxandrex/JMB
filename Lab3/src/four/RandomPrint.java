package four;

public class RandomPrint {

	public static void main(String[] args) {
		
		int num1 = (int) (Math.random() * 101);
		int num2 = (int) (Math.random() * 101);
		
		for (int i = (Math.min(num1, num2) + 1); i < Math.max(num1, num2); i++) {
			System.out.println(i);
		}

	}

}
