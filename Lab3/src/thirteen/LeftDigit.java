package thirteen;

public class LeftDigit {
	
	int left;
	
	public LeftDigit(int num) {
		
		while(num > 0) {
			left = num % 10;
			num /= 10;
		}
		
	}
}
