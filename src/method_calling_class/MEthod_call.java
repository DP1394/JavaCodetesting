package method_calling_class;

import java.util.Scanner;

public class MEthod_call {

    private static String name;

    public static void main(String[] args) {
        // Ask user to enter the name
        System.out.println("Enter the Name you want to greet!");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        greet(name);

    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        MEthod_call.name = name;
    }

    public static void greet(String name)
{
    System.out.print("Hello there ,  " +name);
}

}