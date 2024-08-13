package dppackage;

import java.util.Scanner;

/*
If statement learning
 pay a salesperson $1,000 - everyone gets this no matter what. However, at some point we need to check to see if the condition was met of them making more than 10 sales.
 */
public class Statement_IF {
    public static void main(String[] args) {
// Value initializer
int salary = 1000;
int bonus = 250;

// get unknown values
System.out.println("Enter Sales employee did this week");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //add bonus  earners
if (sales>10)
{
    salary = salary + bonus;
}
// output
        System.out.println("Salary of Employee  "       + salary);

    }
}
