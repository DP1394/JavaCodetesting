package dppackage;

import java.util.Scanner;

/*
 * WHILE LOOP:
 * Each store employee makes $15 an hour. Write a program that allows the employee
 * to enter the number of hours worked for the week. Do not allow overtime.
 */
public class while_loop_gross {
    public static void main(String args[]){
        //Initialization what we know
        int hr_Amount = 15;
        int worked_hr = 40;
        int gross ;

        // Ask what we don't know
        System.out.println("Enter the no of hr employee worked");
                Scanner scanner = new Scanner(System.in);
        double Employee_worked = scanner.nextDouble();

        // calculation
        while(Employee_worked >= worked_hr){
            System.out.println("Invalid Entry. your working hr must be bwtween 1-40. try again");
            Employee_worked =scanner.nextDouble();
            scanner.close();


        }
        // gros calculation
        gross = hr_Amount *worked_hr ;

        System.out.println("Employee worked: "+gross);
    }

}
