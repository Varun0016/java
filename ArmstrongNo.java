package practice;

import java.util.Scanner;

public class ArmstrongNo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check if it is an Armstrong number: ");
        int number = scanner.nextInt();
        int originalNumber = number;
        int arm = 0;
        int rem;

        do {
            rem = number % 10;
            arm = arm + (rem * rem * rem);
            number = number / 10;
        } while (number > 0);

        if (originalNumber == arm) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }

        scanner.close();
    }

}
