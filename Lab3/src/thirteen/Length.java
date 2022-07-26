package thirteen;

public class Length {
	
	int digits;
	
	public Length(int num) {
		
		while(num > 0) {
			num /= 10;
			digits++;
		}
		
	}
}
