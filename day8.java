import java.util.ArrayList;
import java.util.Scanner;

public class day9 {

    static ArrayList<String> history = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n===== Calculator =====");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. View History");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1 -> add();
                case 2 -> subtract();
                case 3 -> multiply();
                case 4 -> divide();
                case 5 -> showHistory();
                case 6 -> System.out.println("Goodbye!");
                default -> System.out.println("Invalid choice!");
            }

        } while (choice != 6);
    }

    static void add() {
        System.out.print("Enter two numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double result = a + b;
        String entry = a + " + " + b + " = " + result;
        history.add(entry);
        System.out.println("Result: " + result);
    }

    static void subtract() {
        System.out.print("Enter two numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double result = a - b;
        String entry = a + " - " + b + " = " + result;
        history.add(entry);
        System.out.println("Result: " + result);
    }

    static void multiply() {
        System.out.print("Enter two numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double result = a * b;
        String entry = a + " * " + b + " = " + result;
        history.add(entry);
        System.out.println("Result: " + result);
    }

    static void divide() {
        System.out.print("Enter two numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        if (b == 0) {
            System.out.println("Cannot divide by zero!");
            return;
        }

        double result = a / b;
        String entry = a + " / " + b + " = " + result;
        history.add(entry);
        System.out.println("Result: " + result);
    }

    static void showHistory() {
        System.out.println("\n--- Calculation History ---");
        for (String h : history) {
            System.out.println(h);
        }
    }
}
