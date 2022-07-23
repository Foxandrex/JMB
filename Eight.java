class Eight {
    public static void main(String[] args) {
        int year = (int)(Math.random() * 1000 + 1582);
        System.out.print("The Year " + year);

        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(" is a leap year");
        }
        else if (year % 400 == 0) {
            System.out.println(" is a leap year");
        }
        else {
            System.out.println(" is not a leap year");
        }
    }
}
