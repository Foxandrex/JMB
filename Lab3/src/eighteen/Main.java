package eighteen;

public class Main {

	public static void main(String[] args) {
		
		String name = "John Bryce";
		
		char[] nameArray = name.toCharArray();
		
		int i = 0;
		for (char c : nameArray) {
			if (c == 'h') {
				i++;
			}
		}
		System.out.printf("There are %d 'h' letters in the string.", i);
	}

}
