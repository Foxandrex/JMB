class TaxCalculator {
    public static void main(String[] args) {
        int salary = (int)(Math.random() * 200000);
        int prevTax, diffTax, totalTax, rate;
        System.out.println("The Salary is: " + salary);

        if (salary <= 23000) {
            rate = 10;
            prevTax = 0;
            diffTax = salary * rate / 100;
            totalTax = diffTax + prevTax;
        }
        else if (salary <= 50000) {
            rate = 20;
            prevTax = 2300; // tax from the first 23000 nis
            diffTax = (salary - 23000) * rate / 100; // tax from the additional salary over 23000 nis
            totalTax = diffTax + prevTax; // total tax
        }
        else if (salary <= 100000) {
            rate = 30;
            prevTax = 2300 + 5400; // 0-23000 tax and 23000-50000 tax
            diffTax = (salary - 50000) * rate / 100; // 50000-salary tax
            totalTax = diffTax + prevTax; // total tax
        }
        else {
            rate = 40;
            prevTax = 2300 + 5400 + 15000;
            diffTax = (salary - 100000) * rate / 100;
            totalTax = diffTax + prevTax;
        }
        rate = (int)(101 / ((double)salary / (double)totalTax));
        System.out.printf("The Salary including a total of %d%% VAT(%d nis) is: %,d %n", rate, totalTax, salary - totalTax);
    }
}
