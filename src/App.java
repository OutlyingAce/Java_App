import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = sc.next();

        System.out.print("Enter password: ");
        String password = sc.next();

        if (username.equals("Siddhant") && password.equals("123abc")) {
            System.out.println("Login successful");
            System.out.println("You can choose between the following programs");
            System.out.println("1) Calculator");
            System.out.println("2) Guessing Game");
            System.out.println("3) SI Calculator");
            System.out.println("4) Vowel/Consonent Checker");

            System.out.println("Enter the number for the app you want to use:");
            int num = sc.nextInt();

            if (num == 1) {
                System.out.println("Welcome to the Calculator App");
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter two numbers: ");
                int num1 = scanner.nextInt();
                int num2 = scanner.nextInt();
                System.out.println("Enter operator: ");
                String operator = scanner.next();
                System.out.println("Your result is: ");
                switch (operator) {
                    case "+":
                        System.out.println(num1 + num2);
                        break;
                    case "-":
                        System.out.println(num1 - num2);
                        break;
                    case "*":
                        System.out.println(num1 * num2);
                        break;
                    case "/":
                        System.out.println(num1 / num2);
                        break;
                    default:
                        System.out.println("Invalid operator");
                }
            }
            if (num == 2) {
                System.out.println("Welcome to the Guessing Game");
                Scanner scanner = new Scanner(System.in);
                Random random = new Random();

                int Number = random.nextInt(10) + 1; // Generates a random number between 1 and 10
                boolean GuessedCorrectly = false;
                System.out.println("Guess a random number from 1 to 10..");

                while (!GuessedCorrectly) {
                    System.out.print("Enter your guess: ");
                    int guess = scanner.nextInt();

                    if (guess < Number) {
                               System.out.println("Try a higher number.");
                    } else if (guess > Number) {
                        System.out.println("Try a lower number.");
                    } else {
                        GuessedCorrectly = true;
                        System.out.println("Congratulations! You have guessed the number.");
                    }
                }
            }
            if (num == 3) {
                System.out.println("Welcome to the SI calculator");
                System.out.println("Enter the principle amount:");
                float principle = sc.nextInt();
                System.out.println("Enter the rate:");
                float rate = sc.nextInt();
                System.out.println("Enter the time:");
                float time = sc.nextInt();
                Object simple_interest;
                simple_interest = (principle * rate * time) / 100;
                System.out.println("The simple interst is: ");
                System.out.println(simple_interest);
            }
            if (num == 4) {
                System.out.println("Welcome to the vowel/consonent checker");
                System.out.println("Enter the character: ");
                char alphabet = (char) sc.nextInt();
                switch (alphabet) {
                    case 'a', 'e', 'i', 'o', 'u':
                        System.out.println("The entered character is Vowel");
                        break;
                    default:
                        System.out.println("The entered character is Consonent");
                }
            }
        } else {
            System.out.println("Wrong Information");
        }

    }
}

