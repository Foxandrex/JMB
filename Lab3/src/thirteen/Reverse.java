package thirteen;

public class Reverse {
	
	public int mirror;
	
	public Reverse(int num) {
		
		while(num > 0) {
			mirror = mirror * 10 + (num % 10);
			num /= 10;
		}
		
	}
}
