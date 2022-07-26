package nineteen;

public class Main {

	public static void main(String[] args) {
		
		String str = "Sara Shara Shir Cameach";
		
		char[] strArray = str.toUpperCase().toCharArray();
		
		int i = 0;
		for (char c : strArray) {
			if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
				i++;
			}
		}
		System.out.printf("There are %d vowels in the string.", i);

	}

}
