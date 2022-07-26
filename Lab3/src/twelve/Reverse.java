package twelve;

public class Reverse {

	public static void main(String[] args) {
		
		int number = (int) (Math.random() * 10001);
		
		System.out.printf("%d reversed is: %d %n", number, mirror(number));
		
		System.out.printf("%d reversed is: ", number);
		System.out.println(mirrorString(number));

	}
	// Solution 1: 
	public static int mirror(int num) {
		int mirror = 0;
		while(num > 0) {
			mirror = mirror * 10 + (num % 10);
			num /= 10;
		}
		return mirror;
	}
	// Solution 2: to solve the leading zero issue (7290 reversed is: 927 --> 7290 reversed is: 0927)
	private static char[] mirrorString(int num) {
		char[] number = (Integer.toString(num)).toCharArray();
		char[] mirror = new char[number.length];
		int i = 0;
		for (char mirrors : number) {
			mirror[number.length - (i + 1)] = mirrors;
			i++;
		}
		return mirror;
	}
}
