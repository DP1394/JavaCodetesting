package dppackage;

import java.util.Scanner;

/*
If else statement
, those who have met their quota and those who have not.
Let's code this using the if-else statements.
 */
public class IF_Else_statement {
    public static void main(String[] args) {
        int quota = 10;
        // Initilize the values we know
        System.out.println("Enter the Num of sales you made this week :");
        Scanner scanner= new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();


        // Get the unknown value
if (sales>=quota)
        // Make a decision on the path to take – Output
System.out.println("Congratulations! you have met qouta :");
else {
    int shortsales = quota - sales;
    System.out.println ("You did not met qouta this week : "+ shortsales +  " short sales" );


}
    }


}
