package method_calling_class;
/*
VARIABLE SCOPE
 * Write an ‘instant credit check’ program that approves
 * anyone who makes more than $25,000 and has a credit score
 * of 700 or better. Reject all others.
 */

import java.util.Scanner;

public class CreditCheck {

   static  int required_salary = 25000;
    static int required_credit = 700;
    static Scanner scanner = new Scanner(System.in);
    private static int amount;
    private static int credit;


    public static void main(String[] args) {
        getRequired_credit();
        get_credit();
        boolean qualified = get_qualified(amount,credit);
        notifyuser(qualified);

    }


    public static int getRequired_credit() {
        System.out.println("Enter the amount of money");
        int amount = scanner.nextInt();
        return  amount;
    }
    public static int get_credit() {
        System.out.println("Enter the amount of Credit");
        int credit = scanner.nextInt();
        return  credit;
}

    public static boolean get_qualified(int amount ,int creditScore) {
       if(amount >=required_salary && required_credit  <= creditScore) {

           return true;
       }
       else {

       return false;}
    }
public static void notifyuser(boolean qualified) {
          if(qualified){
              System.out.println("You have successfully approved the credit check.");}
          else {
              System.out.println("You have not successfully approved the credit check.");
          }
}

}
