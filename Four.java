class Four {
    public static void main(String[] args) {
        double n1 = Math.random();
        double n2 = Math.random();
        double n3 = Math.random();

        if (n1 > n2) {
            if (n1 > n3) {
                System.out.println("The biggest value between " + n1 + " ," + n2 + " ," + n3 + " is " + n1);
            }
            else {
                System.out.println("The biggest value between " + n1 + " ," + n2 + " ," + n3 + " is " + n3);
            }
        }
        else {
            if (n2 > n3) {
                System.out.println("The biggest value between " + n1 + " ," + n2 + " ," + n3 + " is " + n2);
            }
            else {
                System.out.println("The bigger value between " + n1 + " ," + n2 + " ," + n3 + " is " + n3);
            }
        }
    }
}
