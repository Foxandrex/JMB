class TaxCalculator {
    public static void main(String[] args) {
        int salary = (int)(Math.random() * 200000);
        int tax, rate;
        System.out.println("The Salary is: " + salary);

        if (salary <= 23000) {
            rate = 10;
        }
        else if (salary <= 50000) {
            rate = 20;
        }
        else if (salary <= 100000) {
            rate = 30;
        }
        else {
            rate = 40;
        }
        tax = salary * rate / 100;
        System.out.printf("The Salary including %d%% VAT(%d nis) is: %,d %n", rate, tax, salary - tax);
    }
}
