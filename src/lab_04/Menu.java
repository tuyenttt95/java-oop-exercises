package lab_04;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Menu {
    /**
     * When the program starts, the menu must be displayed.
     * After each action is performed, the menu must be shown again.
     * Additionally, display a message that pressing 0 will exit the program.
     *
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        boolean isContinue = true;

        while (isContinue) {

            System.out.println("====MENU=====");
            System.out.println("1. Add number into ArrayList");
            System.out.println("2. Print numbers");
            System.out.println("3. Get maximum number");
            System.out.println("4. Get minimum number");
            System.out.println("5. Find a number");
            System.out.println("0. Exit");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                // TODO
                System.out.println("Enter number to add: ");
                int number = scanner.nextInt();
                list.add(number); // Add number to list
                System.out.println("Number added");  // Print noti
                System.out.println("Numbers in list: " + list); // Print list number

            } else if (choice == 2) {
                // TODO
                System.out.println("Numbers in list: " + list); // Print list number

            } else if (choice == 3) {
                // TODO
                if (list.isEmpty()) {
                    System.out.println("List is empty");
                }else {
                    int max = list.get(0); // Start from the first element
                    for (int temp = 1; temp < list.size(); temp++) {
                        int numberCurrent = list.get(temp);
                        if (numberCurrent > max) {
                            max = numberCurrent;
                        }
                    }
                    System.out.println("Numbers in list: " + list);
                    System.out.println("Maximum number: " + max);
                }

            } else if (choice == 4) {
                // TODO
                if (list.isEmpty()) {
                    System.out.println("List is empty");
                }else {
                    int min = list.get(0); // Start from the first element
                    for (int temp = 1; temp < list.size(); temp++) {
                        int numberCurrent = list.get(temp);
                        if (numberCurrent < min) {
                            min = numberCurrent;
                        }
                    }
                    System.out.println("Numbers in list: " + list);
                    System.out.println("Miximum number: " + min);
                }
            } else if (choice == 5) {
                // TODO
                System.out.print("Enter number to search: ");
                int target = scanner.nextInt();

                boolean found = false; // The target value is not found
                int foundIndex = -1;  // Assign the default value as 'not found'

                for (int temp1 = 0; temp1 < list.size(); temp1++) {
                    if (list.get(temp1) == target) {
                        found = true;
                        foundIndex = temp1;
                        break; // Only one search
                    }
                }
                if (found) {
                    System.out.println("Found number: " + target);
                }else {
                    System.out.println("Not found number: " + target);
                }

            } else if (choice == 0) {
                isContinue = false;
                System.out.println("Thank you for using our program");
            } else {
                System.out.println("Invalid choice");
            }

        }
    }
}
