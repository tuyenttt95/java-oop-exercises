package lab_06;

import java.util.Scanner;

public class ComparePassword {

    // TODO
    /**
     * String myPassword = "password123"
     * Allow user to input maximum 3 times
     */

    public static void main(String[] args) {

        String myPassword = "password123";
        Scanner scanner = new Scanner(System.in);

        int attempt = 0;

        while(attempt < 3) {
            System.out.print("Enter your password: ");
            String input = scanner.nextLine();

            if (input.equals(myPassword)) {
                System.out.println("Your password is correct");
                break;
            } else {
                System.out.println("Your password is incorrect");
                attempt++;
            }
        }
        if (attempt == 3) {
            System.out.println("Too many failed attempts. Account temporarily locked.");
        }
    }
}
