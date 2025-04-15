package org.example;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their name input
        System.out.print("Please enter your name: ");
        String fullName = scanner.nextLine().trim();

        // Split the name based on spaces
        String[] nameParts = fullName.split(" ");

        // Extract individual parts of the name
        String firstName = nameParts[0];
        String middleName = (nameParts.length > 2) ? nameParts[1] : "(none)";
        String lastName = nameParts[nameParts.length - 1];

        // Print the name components
        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);
    }
}
