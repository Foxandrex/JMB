class SalaryRaiser {
    public static void main(String[] args) {
        int salary = (int)(Math.random() * (6001 - 5000) + 5000);
        System.out.println("The Current salary is: " + salary);
        
        if ((salary + (salary * 0.1)) < 6000) {
            salary += (salary * 0.1);
            System.out.println("The salary is raised by 10%");
        }
        else {
            salary += (salary * 0.05);
            System.out.println("The salary is raised by 5%");
        }
        System.out.println("The Raised salary is: " + salary);
    }
}
