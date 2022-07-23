class Printer {
    public static void main(String[] args) {
        String part1 = "There will be";
        int visitors = 5;
        String part2 = "people for dinner";
        System.out.println(part1 + " " + visitors + " " + part2); // Question 1
        System.out.println(part1 + " " + visitors + 2 + " " + part2); // Question 2.1 : it prints the 2 as a string
        System.out.println(part1 + " " + (visitors + 2) + " " + part2); // Question 2.2
    }
}

public class Test {
    public static void main(String[] args){
        int a = (int)(Math.random() * (351 - 100) + 100);
        int b = (int)(Math.random() * (351 - 100) + 100);
        // Q3: Assuming numbers are integers and are between 100-350
        System.out.println("The first number is " + a);
        System.out.println("The second number is " + b);
        System.out.println("The summation is " + (a + b));
        System.out.println("The average is " + ((a + b) / 2));
        System.out.println("The first remainder is " + (a % 10));
        System.out.println("The second remainder is " + (b % 10));
        System.out.println("The area is " + (a * b));
        System.out.println();

        // Q4
        int minutes = a;
        System.out.print("The time is " + minutes + " minutes");
        System.out.println(" or " + (minutes / 60) + ":" + (minutes % 60));
        System.out.println();

        // Q5
        System.out.println("The bigger value is: " + Math.max(a, b));

        // Q5: another solution
        if (a > b) {
            System.out.println("a is bigger");
            System.out.println("The bigger value is: " + a);
        }
        else if (a < b) {
            System.out.println("b is bigger");
            System.out.println("The bigger value is: " + b);
        }
        else {
            System.out.println("The numbers are equal");
            System.out.println("The bigger value is: " + a);
        }
    }
}
