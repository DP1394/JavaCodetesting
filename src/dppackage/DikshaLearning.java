package dppackage;

import java.util.Scanner;

public class DikshaLearning {

    public static void main(String[] args) {

        // Get the no of Hours worked
        System.out.println( "Please enter the No of Hours");
        Scanner  sc = new Scanner(System.in);
        int hr = sc.nextInt();


        // Get the Pay Rate
System.out.println( "Please Pay rate of an Hr");
Double Pay = sc.nextDouble();

        // Get the grosspay multiple Hr and payrate
        Double Total_pay = hr*Pay;
        //Display result
        System.out.println("Gross Pay of employess are $" +Total_pay);

    }
}
