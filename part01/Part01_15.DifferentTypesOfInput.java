
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here

        System.out.println("Give a string:");
        String scanner1 = scan.nextLine();

        System.out.println("Give an integer:");
        int scanner2 = Integer.valueOf(scan.nextLine());

        System.out.println("Give a double:");
        double scanner3 = Double.valueOf(scan.nextLine());

        System.out.println("Give a boolean:");
        boolean scanner4 = Boolean.valueOf(scan.nextLine());

        System.out.println("You gave the string " + scanner1);
        System.out.println("You gave the integer " + scanner2);
        System.out.println("You gave the double " + scanner3);
        System.out.println("You gave the boolean " + scanner4);

    }
}
