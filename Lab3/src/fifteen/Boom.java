package fifteen;

public class Boom {

	public static void main(String[] args) {
		
		int number = (int) (Math.random() * 100 + 1);

		if (number % 7 == 0 || haveSeven(number)) {
			System.out.println("boom");
		}
		else {
			System.out.println(number);
		}
	}

	private static boolean haveSeven(int num) {
		
		while (num > 0) {
			if (num % 10 == 7) {
				return true;
			}
			num /= 10;
		}
		return false;
	}

}
