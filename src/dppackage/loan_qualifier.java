package dppackage;

import java.util.Scanner;

/*
To qualify for a loan there are two conditions that must be met.
The person must make at least $30,000 and they must have also been at their
job for 2 or more years.
 */
public class loan_qualifier {

    public static void main(String[] args) {
        //initializer what we know
        int RequiredSalary = 30000;
        int RequitedYears = 2;

        // Get what we don't know
        System.out.println("Enter the Employee Salary");
        Scanner scanner = new Scanner(System.in);
        Double EmployeeSalary = scanner.nextDouble();
        System.out.println("Enter the Years Employee worked in the organization ");
        Scanner EmployeeWorked = new Scanner(System.in);
        int Employeeyears = scanner.nextInt();
        scanner.close();
      // Make decision

if(EmployeeSalary>=RequiredSalary)
    if(Employeeyears>=RequitedYears)
        System.out.println("Congrats! You are qualied for the Loan ");
    else
        System.out.println("Sorry , you must worked at ur current job  " + RequitedYears + "Years");

else
        System.out.println("Sorry, You are must earn at least $ " + RequiredSalary + " to get loan");
    }
}

