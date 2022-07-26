package thirteen;

public class Sum {
	
	int sum;
	
	public Sum(int num) {
		
		while(num > 0) {
			sum += num % 10;
			num /= 10;
		}
		
	}
}
