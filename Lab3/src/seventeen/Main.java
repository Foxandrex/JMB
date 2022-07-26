package seventeen;

public class Main {

	public static void main(String[] args) {
		
		char[] arr = {'a','b','c','a','b','d','r','c'};
		
		int i = 0;
		int j = 0;
		for (char c : arr) {
			if (c == 'a') {
				i++;
			}
			else if (c == 'c') {
				j++;
			}
		}
		System.out.println("There are " + i + " 'a' character in the array.");
		System.out.println("There are " + (i + j) + " 'a' or 'c' characters in the array.");
	}

}
