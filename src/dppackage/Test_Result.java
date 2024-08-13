package dppackage;
/*Program for grade system

 */

import java.util.Scanner;

public class Test_Result {

        public static void main(String[] args) {
            // Initialize the garde
            char grade;
            // Get the score
            System.out.println("Enter the score student have get");
            Scanner scanner = new Scanner(System.in);
            double score = scanner.nextDouble();

            // Determine the grage
            if(score>=90)
                grade ='A';
            else if (score>=80)
                grade = 'B';
            else if(score>=70)
                grade = 'C';
            else if (score>=60)
                grade = 'D';
            else if (score>=50)
                        grade = 'E';
            else
                grade = 'F';
            System.out.println( " Your grade is " + grade );

        }
}
