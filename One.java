public class One {
    public static void main(String[] args) {
        int number = (int)(Math.random() * 101);
        System.out.println(number);
        
        if (number > 50) {
            System.out.println("Big!");
        }
        else if (number < 50) {
            System.out.println("Small!");
        }
        else {
            System.out.println("Bingo!");
        }
    }
}
