package JavaBasics;

import java.util.Scanner;

public class InputOutput {
    public static void main (String[] args) {
        System.out.println("------------Basic Output------------");
        System.out.println("Hello, World!");

        System.out.println();
        System.out.println("------------Escape Sequences------------");
        System.out.println("Hello, World!");
        System.out.println("Hello, \nWorld!");
        System.out.println("Hello, \tWorld!");
        System.out.println("Hello, \"World!\"");
        System.out.println("Hello, \'World!\'");
        System.out.println("C:\\Users\\Arnab");

        System.out.println();
        System.out.println("------------Printing Variables------------");
        int age = 25;
        String name = "Arnab";
        double height = 5.10;
        System.out.println("Name: " + name + ", Age: " + age + ", Height: " + height);

        System.out.println();
        System.out.println("------------Printf------------");
        System.out.printf("Name: %s, Age: %d, Height: %.2f\n", name, age, height);

        System.out.println("------------Create Scanner------------");
        Scanner scanner = new Scanner(System.in);

        System.out.println("------------String Input------------");

        System.out.println("Enter your first name: ");
        String firstName = scanner.next();
        System.out.println("Hello, " + firstName + "!");

        System.out.println();
        System.out.println("------------Integer Input------------");
        System.out.println("Enter your age: ");
        int userAge = scanner.nextInt();
        System.out.println("You are " + userAge + " years old.");

        System.out.println();
        System.out.println("------------Double Input------------");
        System.out.println("Enter your height: ");
        double userHeight = scanner.nextDouble();
        System.out.println("Your height is " + userHeight + " feet.");

        System.out.println();
        System.out.println("------------Boolean Input------------");
        System.out.println("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();
        if (isStudent) {
            System.out.println("You are a student.");
        } else {
            System.out.println("You are not a student.");
        }

        System.out.println();
        System.out.println("------------Character Input------------");
        System.out.println("Enter your gender (M/F): ");
        char gender = scanner.next().charAt(0);
        if (gender == 'M' || gender == 'm') {
            System.out.println("You are male.");
        } else if (gender == 'F' || gender == 'f') {
            System.out.println("You are female.");
        } else {
            System.out.println("Invalid gender input.");
        }
        scanner.close();
    }
}
