package dppackage;

import java.util.Scanner;

public class Test_Ques {

    public static void main(String[] args) {
        // Asks a user for a season of the year
        System.out.println("Enter the season of the Year");
        Scanner sc = new Scanner(System.in);
        int season = sc.nextInt();

        //Then a whole number,
        System.out.println("Enter a whole number");
        int number = sc.nextInt();

        //then an adjective.
        System.out.println("Enter the ajective ");
        String abjective= sc.next();
        System.out.println("On a "  + abjective + " " + season +
                " day, I drink a minimum of " + number +
                " cups of coffee." );

    }

}
