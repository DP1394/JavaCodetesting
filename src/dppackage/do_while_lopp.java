/*
DO while loop concept loop will run atleast 1 time
do does not check the condition
 * DO WHILE LOOP:
 * Write a program that allows a user to enter two numbers,
 * and then sums up the two numbers. The user should be able to
 * repeat this action until they indicate they are done
 */

package dppackage;

import java.util.Scanner;

public class do_while_lopp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
boolean again = true;
        do{
            System.out.println("Enter number first no: ");
            double num1= sc.nextDouble();
            System.out.println("Enter number second no: ");
            double num2= sc.nextDouble();
            double total= num1+num2;
            System.out.println("The Total of Nums is " +total );
            System.out.println("Do you want to continue? false or true ");
            again = sc.nextBoolean();
        }while(again);
            sc.close();

    }

}
